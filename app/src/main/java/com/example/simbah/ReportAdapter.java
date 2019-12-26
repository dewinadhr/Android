package com.example.simbah;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simbah.models.DataPasien;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;

import java.util.LinkedList;

public class ReportAdapter extends
        RecyclerView.Adapter<ReportAdapter.ReportViewHolder> {
    private DatabaseReference database;
    private final LinkedList<DataPasien> reportList;
    private final LayoutInflater mInflater;
    private Context context;
    private FirebaseUser user;

    public ReportAdapter(Context context, LinkedList<DataPasien> reportList, DatabaseReference database, FirebaseUser user) {
        mInflater = LayoutInflater.from(context);
        this.reportList = reportList;
        this.context = context;
        this.database = database;
        this.user = user;
    }

    @NonNull
    @Override
    public ReportAdapter.ReportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.activity_list_report, parent, false);
        return new ReportViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ReportAdapter.ReportViewHolder holder, final int position) {

        final DataPasien mCurrent = reportList.get(position);

        holder.namaReport.setText(mCurrent.getNama());
        holder.btnSampah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reportList.remove(position);
                database.child("Data_pasien").child(user.getUid()).child(mCurrent.getKey()).removeValue();
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return reportList.size();
    }

    public class ReportViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView namaReport;
        private ImageView btnSampah;

        public ReportViewHolder(@NonNull View itemView) {
            super(itemView);
            namaReport = itemView.findViewById(R.id.title_namaReports);
            btnSampah = itemView.findViewById(R.id.deleteReport_ic);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            final DataPasien mCurrent = reportList.get(getAdapterPosition());
            Intent intent = new Intent(context,ReportRecomendActivity.class);
            intent.putExtra("pasien",mCurrent);
            context.startActivity(intent);
        }
    }
}

