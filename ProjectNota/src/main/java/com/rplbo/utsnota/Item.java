package com.rplbo.utsnota;

public class Item {
    KertasHVS[] krhvs;
    BukuTulis[] bktulis;
    Pulpen[] pen;

    public Item(KertasHVS[] krhvs){
        this.krhvs = krhvs;
    }

    public Item(BukuTulis[] bktulis){
        this.bktulis = bktulis;
    }

    public Item(Pulpen[] pen){
        this.pen = pen;
    }

    public Item(BukuTulis[] bktulis, Pulpen[] pen){
        this.bktulis = bktulis;
        this.pen = pen;
    }
    public Item(KertasHVS[] krhvs, Pulpen[] pen){
        this.krhvs = krhvs;
        this.pen = pen;
    }
    public Item(BukuTulis[] bktulis, KertasHVS[] krhvs){
        this.bktulis = bktulis;
        this.krhvs = krhvs;
    }

    public Item(BukuTulis[] bktulis, KertasHVS[] krhvs, Pulpen[] pen) {
        this.krhvs = krhvs;
        this.bktulis = bktulis;
        this.pen = pen;
    }

    public KertasHVS[] getKrhvs() {
        return krhvs;
    }

    public BukuTulis[] getBktulis() {
        return bktulis;
    }

    public Pulpen[] getPen() {
        return pen;
    }

    public int getJumlahBukuTulis() {
        int counter = 0;
        for (int i = 0; i < bktulis.length; i++)
            if (bktulis[i] != null)
                counter++;
        return counter;
    }

    public int getJumlahPen(){
        int counter = 0;
        for (int i = 0; i < pen.length; i ++)
            if (pen[i] != null)
                counter ++;
        return counter;
    }

    public int getJumlahKertasHVS(){
        int counter = 0;
        for (int i = 0; i < krhvs.length; i ++)
            if (krhvs[i] != null)
                counter ++;
        return counter;
    }

}
