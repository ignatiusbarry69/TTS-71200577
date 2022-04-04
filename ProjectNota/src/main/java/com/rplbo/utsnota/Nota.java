package com.rplbo.utsnota;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Nota {
    private String nonota ;
    private String notelppembeli;
    private Item items;
    private String namapembeli;

    public Nota(String nonota, String notelppembeli, String namapembeli, Item items) {
        this.nonota = nonota;
        this.notelppembeli = notelppembeli;
        this.items = items;
        this.namapembeli = namapembeli;
    }

    public String getNonota() {
        return nonota;
    }

    public void setNonota(String nonota) {
        this.nonota = nonota;
    }

    public String getNotelppembeli() {
        return notelppembeli;
    }

    public void setNotelppembeli(String notelppembeli) {
        this.notelppembeli = notelppembeli;
    }

    public String getNamapembeli() {
        return namapembeli;
    }

    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public void tampilNota(){
        System.out.println("NOTA PEMBELIAN");
        System.out.println("No Nota: "+this.nonota);
        System.out.println("Nama Pembeli: "+this.namapembeli);
        System.out.println("Telp Pembeli: "+this.notelppembeli);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Tgl: "+dtf.format(LocalDateTime.now()));
        if(items.bktulis != null){
            int totbktulis = 0;
            for (int i = 0; i < items.getJumlahBukuTulis(); i++) {
                totbktulis  = (totbktulis +items.bktulis[i].getHarga());
                System.out.println("=====================================");
                System.out.println("Kode : "+items.bktulis[i].getKodebarang());
                System.out.println("Kode : "+items.bktulis[i].getHarga());
                System.out.println("Kode : "+items.bktulis[i].getBerat());
                System.out.println("Kode : "+items.bktulis[i].getDeskripsi());
                System.out.println("Kode : "+items.bktulis[i].getMerk());
                System.out.println("---------------------------------------------");
                System.out.println("Sub Total : "+totbktulis );
            }
        }
        if(items.krhvs != null){
            int tothvs = 0;
            for (int i = 0; i < items.getJumlahKertasHVS(); i++) {
                tothvs  = (tothvs +items.krhvs[i].getHarga());
                System.out.println("=====================================");
                System.out.println("Kode : "+items.krhvs[i].getKodebarang());
                System.out.println("Kode : "+items.krhvs[i].getHarga());
                System.out.println("Kode : "+items.krhvs[i].getBerat());
                System.out.println("Kode : "+items.krhvs[i].getDeskripsi());
                System.out.println("Kode : "+items.krhvs[i].getGram());
                System.out.println("---------------------------------------------");
                System.out.println("Sub Total : "+tothvs );
            }
        }

        if(items.pen != null){
            int totpen = 0;
            for (int i = 0; i < items.getJumlahPen(); i++) {
                totpen  = (totpen +items.pen[i].getHarga());
                System.out.println("=====================================");
                System.out.println("Kode : "+items.pen[i].getKodebarang());
                System.out.println("Kode : "+items.pen[i].getHarga());
                System.out.println("Kode : "+items.pen[i].getBerat());
                System.out.println("Kode : "+items.pen[i].getDeskripsi());
                System.out.println("Kode : "+items.pen[i].getWarna());
                System.out.println("---------------------------------------------");
                System.out.println("Sub Total : "+totpen );
            }
        }

    }
    public void hitungTotalBayar(){

        int bayar = 0;
        System.out.println("==================================================");
        if(items.bktulis != null){
            for (int i = 0; i < items.getJumlahBukuTulis(); i++) {
                bayar = (bayar + items.bktulis[i].getHarga());
            }
        }

        if(items.krhvs != null){
            for (int i = 0; i < items.getJumlahKertasHVS(); i++) {
                bayar = (bayar + items.krhvs[i].getHarga());
            }
        }

        if(items.pen != null){
            for (int i = 0; i < items.getJumlahPen(); i++) {
                bayar = (bayar + items.pen[i].getHarga());
            }
        }

        System.out.println("TOTAL  BAYAR: "+bayar);
    }
}
