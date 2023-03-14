package com.ta.crudsimplefirestore.Model;

import com.google.firebase.Timestamp;

import java.net.URI;

public class User {
    private String id, name, email, avatar;
//    private URI uri;
    private Timestamp tanggal;
    public User(){

    }

    public User(String name, String email, Timestamp tanggal, String avatar){
        this.tanggal=tanggal;
        this.name = name;
        this.email = email;
        this.avatar = avatar;
    }

    public Timestamp getTanggal() {
        return tanggal;
    }

    public void setTanggal(Timestamp tanggal) {
        this.tanggal = tanggal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}