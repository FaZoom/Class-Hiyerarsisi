package com.company;

public class PsiOgr extends Ogr implements Ciz {

    public PsiOgr(String isim, int no) {
        super(isim, no);
    }

    @Override
    public void bolumSoyle() {
        System.out.println("Benim bölümüm Psi!");
    }

    @Override
    public void ciz() {
        System.out.println("Çizdim abi...");
    }
}
