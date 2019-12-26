package com.example.simbah.Firebase;
import com.example.simbah.models.DataPasien;
import com.google.firebase.database.DatabaseReference;

public class firebaseHelper {
    DatabaseReference database;
    boolean saved = Boolean.parseBoolean(null);

    public firebaseHelper(DatabaseReference database, boolean saved) {
        this.database = database;
        this.saved = saved;
    }

    public boolean save(DataPasien data_p) {
        if (data_p == null) {
            saved = false;
        } else {
            try {
                database.child("Data pasien").push().setValue(data_p);
                saved = true;
            } catch (Exception e) {
                e.printStackTrace();
                saved = false;
            }
        }
        return saved;
    }
}
