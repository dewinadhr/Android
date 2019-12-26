package com.example.simbah.model;

import java.util.ArrayList;
import java.util.List;

public class ContactResponse {
    private List<Contact> result;

    public List<Contact> getUsers() {
        return result;
    }

    public void setUsers(List<Contact> user) {
        this.result = result;
    }
}
