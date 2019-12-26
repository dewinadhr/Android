package com.example.simbah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.simbah.model.Artikel;
import com.example.simbah.model.ArtikelResponse;
import com.example.simbah.network.ApiRequest;
import com.example.simbah.network.ApiService;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArtikelActivity extends AppCompatActivity {
    private ApiRequest apiRequest;
    private LinkedList<Artikel> artikelResponse;
    private FloatingActionButton floatingActionButton;

    private RecyclerView mRecyclerView;
    private ArtikelAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel);
        apiRequest = ApiService.getServices();
        artikelResponse = new LinkedList<>();
        floatingActionButton = findViewById(R.id.fab_tambah);

        mRecyclerView = findViewById(R.id.rv_artikel);

        mAdapter = new ArtikelAdapter(ArtikelActivity.this, artikelResponse, apiRequest);
        // Connect the adapter with the recycler view.
        mRecyclerView.setAdapter(mAdapter);
        // Give the recycler view a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(ArtikelActivity.this));
        apiRequest.getArtikel().enqueue(new Callback<ArtikelResponse>() {
            @Override
            public void onResponse(Call<ArtikelResponse> call, Response<ArtikelResponse> response) {
                if (response.body()!=null){
                    artikelResponse.clear();
                    artikelResponse.addAll(response.body().getData());
                    mAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<ArtikelResponse> call, Throwable t) {
                Log.d("__DEBUGFAIL", t.getMessage());
            }
        });
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtikelActivity.this, TambahArtikelActivity.class));
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        apiRequest.getArtikel().enqueue(new Callback<ArtikelResponse>() {
            @Override
            public void onResponse(Call<ArtikelResponse> call, Response<ArtikelResponse> response) {
                if (response.body()!=null){
                    artikelResponse.clear();
                    artikelResponse.addAll(response.body().getData());
                    mAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<ArtikelResponse> call, Throwable t) {
                Log.d("__DEBUGFAIL", t.getMessage());
            }
        });
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtikelActivity.this, TambahArtikelActivity.class));
            }
        });
    }

    public void editArtikel(View view) {
        startActivity(new Intent(ArtikelActivity.this, Edit_artikelActivity.class));
    }

    public void card_article(View view) {
        startActivity(new Intent(ArtikelActivity.this, IsiArtikelActivity.class));
    }
}
