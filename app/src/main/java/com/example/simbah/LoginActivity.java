/*Nama Kelompok : MARMALADE TEAM
* Anggota Kelompok :
* - Hikmah Muliandari (17523096)
* - Diah Hanifa P. (17523146)
* - Raisha Amini D.S (17523148)
* - Dewi Nadhiroh (17523235)*/

/*1. Topik atau masalah : Sistem rekomendasi menu makanan untuk lansia
* 2. Alasan menggunakan android : lebih fleksibel, masyarakat umum lebih aware dengan gawai dari pada komputer desktop
* 3. User : Masyarakat umum, terkusus yang mempunyai lansia yang dirawat
* 4. Client : Ahli Gizi
* 5. input : usia, tinggi badan, berat badan, jenis kelamin, txpenyakit yang diderita,
* 6. output : informasi umum terkait jumlah kebutuhan kalori, berat badan ideal, dan rekomendasi menu makanan
* 7. fungsi fitur dalam aplikasi :
*       - DATA PASIEN = untuk menginput rekam medis dari pasien
*       - ABOUT = untuk menjelaskan tentang aplikasi siMbah
*       - ARTIKEL = berisikan artikel mengenai lansia
*       - REPORT = kumpulan hasil data pasien */

package com.example.simbah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.simbah.model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.example.simbah.network.ApiRequest;
import com.example.simbah.network.ApiService;


import java.util.ArrayList;


public class LoginActivity extends AppCompatActivity {
    private DatabaseReference database;
    private ApiRequest apiRequest;
    private ArrayList<User> userResponse;
    private FirebaseAuth mAuth;
    private EditText password;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);


    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null){
            startActivity(new Intent(LoginActivity.this, HomePage.class));
        }
    }
    public static boolean isEmpty(EditText editText) {

        String input = editText.getText().toString().trim();
        return input.length() == 0;

    }


    public void loginBtn(View view) {
        if (!isEmpty(email) && !isEmpty(password)){
            mAuth.signInWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                Log.d("__dbg", "createUserWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();

                                startActivity(new Intent(LoginActivity.this, HomePage.class));
                            } else {
                                // If sign in fails, display a message to the user.
                                Log.w("__dbg", "failure", task.getException());
                                Toast.makeText(LoginActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                            }

                            // ...
                        }
                    });
        }else{
            Toast.makeText(LoginActivity.this, "Authentication failed.",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void signup(View view) {
        startActivity(new Intent(LoginActivity.this, SignupActivity.class));
    }


}
