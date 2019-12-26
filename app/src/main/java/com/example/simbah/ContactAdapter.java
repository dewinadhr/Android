package com.example.simbah;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.simbah.model.Contact;

import java.util.ArrayList;
import java.util.LinkedList;

public class ContactAdapter extends
        RecyclerView.Adapter<ContactAdapter.ContactViewHolder>  {
    private final LinkedList<Contact> contactList;
    private final LayoutInflater mInflater;
    private Context context;

    public ContactAdapter(Context context, LinkedList<Contact> contactList) {
        mInflater = LayoutInflater.from(context);
        this.contactList = contactList;
        this.context = context;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_contact, parent, false);
        return new ContactViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Contact mCurrent = contactList.get(position);
        // Add the data to the view holder.

        Log.d("__dbgrvemail",String.valueOf(mCurrent.getEmail()));
        holder.textViewEmail.setText(mCurrent.getEmail());
        holder.textViewNama.setText(mCurrent.getNama());

        Glide.with(context).load(mCurrent.getGambar()).into(holder.imgAnggota);
    }

    @Override
    public int getItemCount() {
        Log.d("__dbgrv",String.valueOf(contactList.size()));
        return contactList.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgAnggota;
        public TextView textViewNama;
        public TextView textViewEmail;

        /**
         * Creates a new custom view holder to hold the view to display in
         * the RecyclerView.
         *
         * @param itemView The view in which to display the data.
         * @param adapter The adapter that manages the the data and views
         *                for the RecyclerView.
         */
        public ContactViewHolder(View itemView, ContactAdapter adapter) {
            super(itemView);
            imgAnggota = itemView.findViewById(R.id.anggota1);
            textViewNama = itemView.findViewById(R.id.team1);
            textViewEmail = itemView.findViewById(R.id.email1);

        }

    }
}
