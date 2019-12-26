package com.example.simbah;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.simbah.model.Artikel;
import com.example.simbah.model.ArtikelResponse;
import com.example.simbah.model.Contact;
import com.example.simbah.network.ApiRequest;

import java.util.LinkedList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ArtikelAdapter extends
        RecyclerView.Adapter<ArtikelAdapter.ArtikelViewHolder>  {
    private final LinkedList<Artikel> artikelList;
    private final LayoutInflater mInflater;
    private Context context;
    private ApiRequest apiRequest;

    public ArtikelAdapter(Context context, LinkedList<Artikel> artikelList,ApiRequest apiRequest) {
        mInflater = LayoutInflater.from(context);
        this.artikelList = artikelList;
        this.context = context;
        this.apiRequest = apiRequest;
    }

    @NonNull
    @Override
    public ArtikelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.list_item_artikel, parent, false);
        return new ArtikelViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtikelViewHolder holder, final int position) {
        final Artikel mCurrent = artikelList.get(position);
        // Add the data to the view holder.

//        Log.d("__dbgrvemail",String.valueOf(mCurrent.getEmail()));
        holder.textViewNewsTitle.setText(mCurrent.getNews_title());
        holder.textViewTitle.setText(mCurrent.getTitle());
        holder.imgEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Edit_artikelActivity.class);
                Log.d("__DBGADAP",mCurrent.getTitle());
                intent.putExtra("artikel",mCurrent);
                context.startActivity(intent);
            }
        });
        holder.imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apiRequest.deleteArtikel(mCurrent.getId()).enqueue(new Callback<ArtikelResponse>() {
                    @Override
                    public void onResponse(Call<ArtikelResponse> call, Response<ArtikelResponse> response) {

                    }

                    @Override
                    public void onFailure(Call<ArtikelResponse> call, Throwable t) {
                        Log.d("__DEBUGFAIL", t.getMessage());
                        artikelList.remove(position);
                        notifyDataSetChanged();

                    }
                });
            }
        });

        //untuk mengeset gambar//
        Glide.with(context).load(mCurrent.getGambar()).into(holder.imageViewArtikel);
    }

    @Override
    public int getItemCount() {
        Log.d("__dbgrv",String.valueOf(artikelList.size()));
        return artikelList.size();
    }

    class ArtikelViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView imageViewArtikel;
        public TextView textViewTitle;
        public TextView textViewNewsTitle;
        public ImageView imgDelete;
        public ImageView imgEdit;

        /**
         * Creates a new custom view holder to hold the view to display in
         * the RecyclerView.
         *
         * @param itemView The view in which to display the data.
         * @param adapter The adapter that manages the the data and views
         *                for the RecyclerView.
         */
        public ArtikelViewHolder(View itemView, ArtikelAdapter adapter) {
            super(itemView);
            imageViewArtikel = itemView.findViewById(R.id.artikel1);
            textViewTitle = itemView.findViewById(R.id.title_artikel);
            textViewNewsTitle = itemView.findViewById(R.id.newsTitle);
            imgDelete = itemView.findViewById(R.id.icon_delete_artikel);
            imgEdit = itemView.findViewById(R.id.icon_edit_artikel);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            final Artikel mCurrent = artikelList.get(getAdapterPosition());
            Intent intent = new Intent(context,IsiArtikelActivity.class);
            Log.d("__DBGADAP",mCurrent.getTitle());
            intent.putExtra("artikel",mCurrent);
            context.startActivity(intent);
        }
    }
}
