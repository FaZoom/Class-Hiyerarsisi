package com.company;

public class Main {

    public static void main(String[] args) {
        Kedi k1 = new Kedi("Tekir", 10, "Lazanya");
        Kedi k2 = new Kedi("Sarman ", 1, "Makarna");
        Kopek t1 = new Kopek("Karabaş", 11, 17, 52);
        Hayvan h1 = new Hayvan("İsim", 4);

        System.out.println("İslem Sonucu : " + (k1.islemYap(3, 5)));
        System.out.println("İslem Sonucu : " + (k2.islemYap(5, 5)));
        System.out.println("İslem Sonucu : " + (t1.islemYap(3, 5)));
        System.out.println("İslem Sonucu : " + (h1.islemYap(3, 5)));

    }
}
