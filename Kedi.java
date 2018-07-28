package com.company;

public class Kedi extends Hayvan {

    String mamaTuru;

    public Kedi(String isim, int yas, String mamaTuru) {
        super(isim, yas);
        this.mamaTuru = mamaTuru;
    }

    @Override
    public int islemYap(int sayi1, int sayi2) {
        int sonuc = super.islemYap(sayi1, sayi2);
        System.out.println(sonuc);
        return sonuc + sayi1 + sayi2;
    }

    @Override
    public void sesCikar() {
        System.out.println("Miyav ben "+ yas + " yasşındayım.");
    }

    public void kediyeOZel() {
        System.out.println("Kediye özel");
    }
}
