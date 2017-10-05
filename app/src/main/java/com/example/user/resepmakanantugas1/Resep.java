package com.example.user.resepmakanantugas1;

/**
 * Created by user on 01/10/2017.
 */

public class Resep {
    private String namaResep;
    private String deskripsiResep;
    private int gambarResep;
    private String detailResep;
    private String titleBar;

    public Resep(String namaResep, String deskripsiResep, int gambarResep, String detailResep, String titleBar) {
        this.namaResep = namaResep;
        this.deskripsiResep = deskripsiResep;
        this.gambarResep = gambarResep;
        this.detailResep = detailResep;
        this.titleBar = titleBar;
    }

    public String getNamaResep() {
        return namaResep;
    }

    public String getDeskripsiResep() {
        return deskripsiResep;
    }

    public int getGambarResep() {
        return gambarResep;
    }

    public String getDetailResep() {
        return detailResep;
    }

    public String getTitleBar() {
        return titleBar;
    }
}
