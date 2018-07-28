package com.company;

public class OgrDene {
    public static void main(String[] args) {
        FenOgr o1 = new FenOgr("Ali", 2);
        MatOgr o2 = new MatOgr("Ayşe", 3);
        PsiOgr o3 = new PsiOgr("Veli", 33);

        o1.adsoyle();
        o2.adsoyle();
        o3.adsoyle();

        o2.bilgisayardaYaz();
        o1.bilgisayardaYaz();

        o3.ciz();
        o1.ciz();
    }
}
