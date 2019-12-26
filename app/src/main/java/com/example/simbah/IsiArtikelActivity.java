package com.example.simbah;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.simbah.model.Artikel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class IsiArtikelActivity extends AppCompatActivity {
    private TextView isiKonten;
    private TextView title;
    private ImageView gambarArtikel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_artikel);

        Artikel artikel = getIntent().getParcelableExtra("artikel");


        isiKonten = findViewById(R.id.news_detail_title);
        title = findViewById(R.id.title_detail_artikel);
        gambarArtikel = findViewById(R.id.detail_gambar);

        isiKonten.setText(artikel.getNews_title());
        title.setText(artikel.getTitle());
        Glide.with(this).load(artikel.getGambar()).into(gambarArtikel);
    }
}
