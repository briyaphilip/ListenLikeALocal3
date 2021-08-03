package com.example.listenlikealocal3.Model;

import android.content.Context;

import org.parceler.Parcel;

@Parcel
public class Playlist {
    private String name;
    private String id;

    public Playlist(){ }

    public Playlist(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }}