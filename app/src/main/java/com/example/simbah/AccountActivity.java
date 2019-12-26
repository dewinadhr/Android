package com.example.simbah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.simbah.models.User;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AccountActivity extends AppCompatActivity {
 private FirebaseUser user;
 private DatabaseReference ref;
 private TextView namaAccount;
 private TextView email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        user = FirebaseAuth.getInstance().getCurrentUser();
        ref = FirebaseDatabase.getInstance().getReference("user").child(user.getUid());

        namaAccount=findViewById(R.id.namaAccount);
        email =findViewById(R.id.emailAccount);



        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                User value = dataSnapshot.getValue(User.class);
                namaAccount.setText(value.getNama());
                email.setText(value.getEmail());
                Log.d("__dbg", "Value is: " + value.getEmail());
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("__dbg", "Failed to read value.", error.toException());
            }
        });

    }
    public void logoutBtn(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(AccountActivity.this, LoginActivity.class));
    }

}
