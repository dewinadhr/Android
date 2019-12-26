package com.example.simbah.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class DataPasien implements Parcelable {
    private String nama;
    private String jk;
    private String umur;
    private String bBadan;
    private String tBadan;
    private String pasien;
    private String makan;
    private String waktu;

    protected DataPasien(Parcel in) {
        nama = in.readString();
        jk = in.readString();
        umur = in.readString();
        bBadan = in.readString();
        tBadan = in.readString();
        pasien = in.readString();
        makan = in.readString();
        waktu = in.readString();
        key = in.readString();
    }

    public static final Creator<DataPasien> CREATOR = new Creator<DataPasien>() {
        @Override
        public DataPasien createFromParcel(Parcel in) {
            return new DataPasien(in);
        }

        @Override
        public DataPasien[] newArray(int size) {
            return new DataPasien[size];
        }
    };

    public String getKey() {
        return key;
    }

    private String key;

    public void setKey(String key) {
        this.key = key;
    }

//    public DataPasien(String nama , String umur, String bBadan, String tBadan ) {
//        this.nama = nama;
//        this.jk = jk;
//        this.umur = umur;
//        this.bBadan = bBadan;
//        this.tBadan = tBadan;
//        this.pasien = pasien;
//        this.makan = makan;
//        this.waktu = waktu;
//    }

    public  DataPasien(){

    }


    public DataPasien(String nama, String jk, String umur, String bBadan, String tBadan, String pasien, String makan, String waktu) {
        this.nama = nama;
        this.jk = jk;
        this.umur = umur;
        this.bBadan = bBadan;
        this.tBadan = tBadan;
        this.pasien = pasien;
        this.makan = makan;
        this.waktu = waktu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getbBadan() {
        return bBadan;
    }

    public void setbBadan(String bBadan) {
        this.bBadan = bBadan;
    }

    public String gettBadan() {
        return tBadan;
    }

    public void settBadan(String tBadan) {
        this.tBadan = tBadan;
    }

    public String getPasien() {
        return pasien;
    }

    public void setPasien(String pasien) {
        this.pasien = pasien;
    }

    public String getMakan() {
        return makan;
    }

    public void setMakan(String makan) {
        this.makan = makan;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(jk);
        parcel.writeString(umur);
        parcel.writeString(bBadan);
        parcel.writeString(tBadan);
        parcel.writeString(pasien);
        parcel.writeString(makan);
        parcel.writeString(waktu);
        parcel.writeString(key);
    }
}
