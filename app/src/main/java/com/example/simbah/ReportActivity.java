package com.example.simbah;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simbah.models.DataPasien;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.LinkedList;

public class ReportActivity extends AppCompatActivity {
    private DatabaseReference database;
    private LinkedList<DataPasien> reportResponse;
    private FloatingActionButton floatingActionButton;

    private RecyclerView mRecyclerView;
    private ReportAdapter mAdapter;
    private FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        database = FirebaseDatabase.getInstance().getReference();

        user = FirebaseAuth.getInstance().getCurrentUser();
        reportResponse = new LinkedList<DataPasien>();
        mRecyclerView = findViewById(R.id.rv_report);
        mAdapter = new ReportAdapter(ReportActivity.this, reportResponse, database, user);
        // Connect the adapter with the recycler view.
        mRecyclerView.setAdapter(mAdapter);
        // Give the recycler view a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(ReportActivity.this));
        database.child("Data_pasien").child(user.getUid()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                reportResponse.clear();
                for (DataSnapshot noteDataSnapshot : dataSnapshot.getChildren()) {

                    DataPasien dataPasien = noteDataSnapshot.getValue(DataPasien.class);
                    dataPasien.setKey(noteDataSnapshot.getKey());
                    reportResponse.add(dataPasien);


                }
                mAdapter.notifyDataSetChanged();

                Log.d("__dbg", "hhhhh");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.d("__dbg", databaseError.getMessage());
                Toast.makeText(ReportActivity.this, databaseError.getMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
