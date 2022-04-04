package com.rplbo;

public class Pria {
    private String nama;
    private int usia;
    private String status;
    private Double jumlahCinta = 0.0;
    private Perempuan jodoh;
    private Perempuan temanKencan;

    public Pria(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public void PDKT(Perempuan calon){
        if(this.temanKencan == null){this.temanKencan = calon;}
    }

    public void MengajakKencan(Perempuan p){
        if(p == this.temanKencan){
            this.jumlahCinta += 1;
            this.temanKencan.tambahCinta(1.0);
        }else{
            System.out.println("JANGAN SELINGKUH MAS HEI TOLONG");
            System.out.println("KAU JANGAN TIDAK SETIA, JANGAN KAU AJAK CEWEK LAIN JALAN!!!");
        }
    }
    public void MenembakKekasih(){
        if (temanKencan == null){
            System.out.println("SIAPA YANG MAU KAU TEMBAK :') | JANGAN NGAYAL DEH "+this.nama+"!!!");
        }
        else{
            if(temanKencan.getJumlahCinta() >= temanKencan.getStandarJumlahCinta()){
                System.out.println("SELAMAT KAMU DITERIMA :D | SELAMAT MENJALANI HIDUP BARU Farel");
            }else{
                System.out.println("F, yang sabar ya "+ this.nama+" ):");
            }
        }
    }




}
