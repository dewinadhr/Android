package com.example.simbah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.simbah.model.Artikel;
import com.example.simbah.model.ArtikelResponse;
import com.example.simbah.network.ApiRequest;
import com.example.simbah.network.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Edit_artikelActivity extends AppCompatActivity {
    private EditText editJudulArtikel;
    private EditText editIsiArtikel;
    private ApiRequest apiRequest;
    private  Artikel artikel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_artikel);
        artikel = getIntent().getParcelableExtra("artikel");
        apiRequest = ApiService.getServices();
        editJudulArtikel = findViewById(R.id.edit_judulan_artikel);
        editIsiArtikel = findViewById(R.id.edit_isian_artikel);

        editJudulArtikel.setText(artikel.getTitle());
        editIsiArtikel.setText(artikel.getNews_title());

    }

    public void updateArtikel(View view) {
        apiRequest.updateArtikel(artikel.getId(),editJudulArtikel.getText().toString(),editIsiArtikel.getText().toString()).enqueue(new Callback<ArtikelResponse>() {
            @Override
            public void onResponse(Call<ArtikelResponse> call, Response<ArtikelResponse> response) {

                finish();
            }


            @Override
            public void onFailure(Call<ArtikelResponse> call, Throwable t) {

            }

        });
        startActivity(new Intent(Edit_artikelActivity.this, ArtikelActivity.class));
    }
}
