package com.example.simbah.model;

import java.util.List;

public class ArtikelResponse {
    private List<Artikel> result;

    public List<Artikel> getData() {
        return result;
    }

    public void setData(List<Contact> data) {
        this.result = result;
    }
}

