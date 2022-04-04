package com.rplbo.utsnota;

public class BukuTulis extends Barang{
    private String merk;

    public BukuTulis(String deskripsi, int harga, int berat, String kodebarang, String merk) {
        super(deskripsi, harga, berat, kodebarang);
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    @Override
    public void getInformasi() {

    }
}
