package com.example.simbah.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Artikel implements Parcelable {
   private int id;
   private String title;
   private String news_title;
   private String gambar;

    protected Artikel(Parcel in) {
        id = in.readInt();
        title = in.readString();
        news_title = in.readString();
        gambar = in.readString();
    }

    public static final Creator<Artikel> CREATOR = new Creator<Artikel>() {
        @Override
        public Artikel createFromParcel(Parcel in) {
            return new Artikel(in);
        }

        @Override
        public Artikel[] newArray(int size) {
            return new Artikel[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(title);
        parcel.writeString(news_title);
        parcel.writeString(gambar);
    }
}
