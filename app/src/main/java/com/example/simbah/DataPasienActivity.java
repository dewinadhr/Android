package com.example.simbah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.example.simbah.models.DataPasien;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DataPasienActivity extends AppCompatActivity  implements
        AdapterView.OnItemSelectedListener {

    public static final String EXTRA_MESSAGE = "com.example.simbah.extra.MESSAGE";

    private DatabaseReference database;
    private DataPasien dataPasien;
    private EditText nama, umur, bBadan, tBadan;
    private Spinner menu, waktu;
    private RadioGroup mGender;
    private RadioButton mGenderOption;
    String strGender = " ";
    int i;
    String report;
    String txmenu_mkn;
    String txwaktu;
    String txpenyakit;
    private Spinner spinnerDropPasien;
    private Spinner spinnerDropMenu;
    private FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pasien);

        database = FirebaseDatabase.getInstance().getReference();

        init();
        initSpinner();

        database = FirebaseDatabase.getInstance().getReference();
        user = FirebaseAuth.getInstance().getCurrentUser();

        menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txmenu_mkn = menu.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        waktu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txwaktu = waktu.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnerDropPasien.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString() != "pILIH aKTIVITAS") {
                    txpenyakit = parent.getItemAtPosition(position).toString();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        mGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                int selectedId = group.getCheckedRadioButtonId();
                mGenderOption = mGender.findViewById(selectedId);
                switch (selectedId) {
                    case R.id.lk:
                        strGender = mGenderOption.getText().toString();
                        break;
                    case R.id.pr:
                        strGender = mGenderOption.getText().toString();
                        break;
                    default:
                }
            }
        });


    }

    private void initSpinner() {

//        ================KODE UNTUK MENGAKTIFKAN SPINNER===============
        if (spinnerDropPasien != null) {
            spinnerDropPasien.setOnItemSelectedListener((OnItemSelectedListener) this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.drop_pasien,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (spinnerDropPasien != null) {
            spinnerDropPasien.setAdapter(adapter);
        }

        // Create the spinnerDropPasien menu pilihan.
        if (spinnerDropMenu != null) {
            spinnerDropMenu.setOnItemSelectedListener((OnItemSelectedListener) this);
        }
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(
                this,
                R.array.drop_menu,
                android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (spinnerDropMenu != null) {
            spinnerDropMenu.setAdapter(adapter1);
        }

      //===========================================================================================
        // ==================Create the spinnerDropPasien menu pilihan.=======================
        Spinner spinner2 = findViewById(R.id.drop_waktu);
        if (spinner2 != null) {
            spinner2.setOnItemSelectedListener((OnItemSelectedListener) this);
        }
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                this,
                R.array.drop_waktu,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (spinner2 != null) {
            spinner2.setAdapter(adapter2);
        }
    }

    private void init() {
        nama = findViewById(R.id.isi_nama);
        umur = findViewById(R.id.isi_umur);
        bBadan = findViewById(R.id.isi_berat_badan);
        tBadan = findViewById(R.id.isi_tinggi_baadan);

        menu = findViewById(R.id.drop_menu);
        waktu = findViewById(R.id.drop_waktu);

        mGender = findViewById(R.id.radioGroup);
        spinnerDropPasien = findViewById(R.id.drop_pasien);
        spinnerDropMenu = findViewById(R.id.drop_menu);
    }


    private boolean isEmpty(String s) {
        return TextUtils.isEmpty(s);
    }


    public void submitPasien(View view) {
        Snackbar.make(findViewById(R.id.submit_data_pasien), txpenyakit, Snackbar.LENGTH_LONG).show();
        Log.d("__dbg",nama.getText().toString());
        final String key = database.push().getKey();
        if (!isEmpty(nama.getText().toString())
                || !isEmpty(umur.getText().toString())
                || !isEmpty(bBadan.getText().toString())
                || !isEmpty(tBadan.getText().toString())
                || !isEmpty(txmenu_mkn)
                || !isEmpty(txwaktu)
                || !isEmpty(txpenyakit)) {
            dataPasien = new DataPasien(nama.getText().toString(),
                    strGender,
                    umur.getText().toString(),
                    bBadan.getText().toString(),
                    tBadan.getText().toString(),
                    txpenyakit,
                    txmenu_mkn,
                    txwaktu);

            database.child("Data_pasien").child(user.getUid()).child(key).setValue(dataPasien).addOnSuccessListener(this, new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Snackbar.make(findViewById(R.id.submit_data_pasien), "Data berhasil ditambahkan",
                        Snackbar.LENGTH_LONG).show();
                Intent intent = new Intent(DataPasienActivity.this, ReportRecomendActivity.class);
                intent.putExtra("pasien", dataPasien);
                startActivity(intent);
            }
        });
        } else {
            Snackbar.make(findViewById(R.id.submit_data_pasien), "Data pasien tidak boleh kosong", Snackbar.LENGTH_LONG).show();
            InputMethodManager imm = (InputMethodManager)
                    getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(
                    nama.getWindowToken(), 0);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
















