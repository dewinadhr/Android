package com.example.simbah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.simbah.models.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static android.text.TextUtils.isEmpty;

public class SignupActivity extends AppCompatActivity {
    EditText name;
    EditText email;
    EditText password;
    private DatabaseReference database;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        name= findViewById(R.id.edit_nama);
        email=findViewById(R.id.edit_email);
        password=findViewById(R.id.edit_pass);

        mAuth = FirebaseAuth.getInstance();

        database= FirebaseDatabase.getInstance().getReference();
    }

    private void registerUser(final User user){
        Log.d("__DBG",user.getEmail());
        mAuth.createUserWithEmailAndPassword(user.getEmail(), user.getPassword())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("__dbg", "signUpWithEmail:success");
                            FirebaseUser users = mAuth.getCurrentUser();
                            database.child("user").child(users.getUid()).setValue(user);
                            Toast.makeText(SignupActivity.this, "Register Berhasil",
                                    Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(SignupActivity.this, LoginActivity.class));
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("__dbg", "signUpWithEmail:failure", task.getException());
                            Toast.makeText(SignupActivity.this, "Register failed.",
                                    Toast.LENGTH_SHORT).show();

                        }


                    }
                });
    }

    public static Intent getActIntent(Activity activity){
        return new Intent(activity,SignupActivity.class);
    }

    public void signup(View view) {
        if(!isEmpty(name.getText().toString())&&
                !isEmpty(email.getText().toString())&&
                !isEmpty(password.getText().toString())){
            Log.d("__dbg","aa");
            User user = new User(name.getText().toString(),email.getText().toString(),password.getText().toString());
            registerUser(user);
        }else {
            Toast.makeText(SignupActivity.this, "Data user tidak boleh kosong", Toast.LENGTH_LONG).show();
        }
    }
}

