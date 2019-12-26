package com.example.simbah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.simbah.model.ArtikelResponse;
import com.example.simbah.network.ApiRequest;
import com.example.simbah.network.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TambahArtikelActivity extends AppCompatActivity {
    private ApiRequest apiRequest;
    private EditText title;
    private EditText news_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_artikel);
        apiRequest= ApiService.getServices();
        title=findViewById(R.id.isian_judul_artikel);
        news_title=findViewById(R.id.isian_artikel);

    }

    public void submit(View view) {
        apiRequest.setArtikel(title.getText().toString(),news_title.getText().toString()).enqueue(new Callback<ArtikelResponse>() {
            @Override
            public void onResponse(Call<ArtikelResponse> call, Response<ArtikelResponse> response) {
                Toast.makeText(TambahArtikelActivity.this, "Gagal",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<ArtikelResponse> call, Throwable t ) {
                Log.d("__debug",t.getMessage());

                Toast.makeText(TambahArtikelActivity.this, "Success",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(TambahArtikelActivity.this,ArtikelActivity.class));

            }
        });
    }


}
