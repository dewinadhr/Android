package com.example.simbah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class HomePage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    DrawerLayout drawer;
    NavigationView navigationView;
    FragmentManager fragmentManager;
    Fragment fragment = null;
    private MenuItem menuItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout_home_page);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        // Handle navigation view item clicks here.
        int id = menuItem.getItemId();

        // Untuk memanggil layout dari menu yang dipilih
        if (id == R.id.kontak) {
            startActivity(new Intent(HomePage.this, ContactActivity.class));
        } else if (id == R.id.nav_account) {
            startActivity(new Intent(HomePage.this, AccountActivity.class));
        } else if (id == R.id.setting) {
            startActivity(new Intent(HomePage.this, SettingsActivity.class));
        } else if (id == R.id.nav_logout) {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(HomePage.this, LoginActivity.class));
        }


        drawer = (DrawerLayout) findViewById(R.id.drawer_layout_home_page);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void artikel(View view) {
        startActivity(new Intent(HomePage.this, ArtikelActivity.class));
    }

    public void aboutBtn(View view) {
        startActivity(new Intent(HomePage.this, About_siMbahActivity.class));
    }

    public void dataBtn(View view) {
        startActivity(new Intent(HomePage.this, DataPasienActivity.class));
    }


    public void report(View view) {
        startActivity(new Intent(HomePage.this, ReportActivity.class));
    }
}
