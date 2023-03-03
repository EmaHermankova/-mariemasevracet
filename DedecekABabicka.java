package org.example;

public class DedecekABabicka {
    public static void main(String[] args) throws InterruptedException {
        Nuz n = new Nuz();
        Vidlicka v = new Vidlicka();

        v.nuz = n;
        n.vidlicka = v;

        Thread dedecek = new Thread(() -> {
            n.vezmiSi();
        });

        Thread babicka = new Thread(() -> {
            v.vezmiSi();
        });

        dedecek.start();
        babicka.start();

        dedecek.join();
        babicka.join();

        System.out.println("je po obede");
    }
}
// muze se stat, ze obe vlakna cekaji na to druhe az odemkne ten zamek a
// do nekonecna se seknou a to je VELKA  nevyhoda vlaken. proste je tam komplikace
// s tim zkurvenym zamkem.