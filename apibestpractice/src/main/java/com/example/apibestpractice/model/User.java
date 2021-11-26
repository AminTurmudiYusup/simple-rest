package com.example.apibestpractice.model;

public class User {

    private String nik;
    private String nama;
    private String alamat;

    public User(String nik, String nama, String alamat) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
