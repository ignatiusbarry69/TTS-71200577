package com.rplbo;

public class Perempuan {
    private String nama;
    private int usia;
    private String status;
    private Double jumlahCinta = 0.0;
    private Pria temanKencan;
    private Pria jodoh;
    private Double standarJumlahCinta;


    public Perempuan(String nama, int usia, Double standarJumlahCinta) {
        this.nama = nama;
        this.usia = usia;
        this.standarJumlahCinta = standarJumlahCinta;
    }

    public void MengajakKencan(Pria pria){
        if(pria == this.temanKencan){
            this.jumlahCinta += 0.5;
        }else{
            System.out.println("JANGAN SELINGKUH MAS HEI TOLONG");
            System.out.println("KAU JANGAN TIDAK SETIA, JANGAN KAU AJAK CEWEK LAIN JALAN!!!");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getJumlahCinta() {
        return jumlahCinta;
    }

    public void setJumlahCinta(Double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public void tambahCinta(Double n){
        this.jumlahCinta += n;
    }

    public Pria getTemanKencan() {
        return temanKencan;
    }

    public void setTemanKencan(Pria temanKencan) {
        this.temanKencan = temanKencan;
    }

    public Pria getJodoh() {
        return jodoh;
    }

    public void setJodoh(Pria jodoh) {
        this.jodoh = jodoh;
    }

    public Double getStandarJumlahCinta() {
        return standarJumlahCinta;
    }

    public void setStandarJumlahCinta(Double standarJumlahCinta) {
        this.standarJumlahCinta = standarJumlahCinta;
    }
}
