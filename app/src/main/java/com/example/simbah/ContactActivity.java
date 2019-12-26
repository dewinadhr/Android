package com.example.simbah;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simbah.model.ArtikelResponse;
import com.example.simbah.model.Contact;
import com.example.simbah.model.ContactResponse;
import com.example.simbah.network.ApiRequest;
import com.example.simbah.network.ApiService;

import java.util.ArrayList;
import java.util.LinkedList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ContactActivity extends AppCompatActivity {
//    private final LinkedList<Contact> contactList = new LinkedList<>();
    private ApiRequest apiRequest;
    private LinkedList<Contact> contactResponse;

    private RecyclerView mRecyclerView;
    private ContactAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        apiRequest = ApiService.getServices();
        contactResponse = new LinkedList<>();

        mRecyclerView = findViewById(R.id.rv_contact);
        // Create an adapter and supply the data to be displayed.


        apiRequest.getContact().enqueue(new Callback<ContactResponse>() {
            @Override
            public void onResponse(Call<ContactResponse> call, Response<ContactResponse> response) {
                if (response.body() !=null){

                    contactResponse.addAll(response.body().getUsers());

                    Log.d("__DEBUGFAIL", contactResponse.get(0).getNama());
                    mAdapter = new ContactAdapter(ContactActivity.this, contactResponse);
                    // Connect the adapter with the recycler view.
                    mRecyclerView.setAdapter(mAdapter);
                    // Give the recycler view a default layout manager.
                    mRecyclerView.setLayoutManager(new LinearLayoutManager(ContactActivity.this));
                }
            }

            @Override
            public void onFailure(Call<ContactResponse> call, Throwable t) {
                Log.d("__DEBUGFAIL", t.getMessage());
            }
        });

    }

}
