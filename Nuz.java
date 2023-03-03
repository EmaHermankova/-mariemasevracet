package org.example;

public class Nuz {

    Vidlicka vidlicka;

    public synchronized void vezmiSi(){
        System.out.println("vzal jsem si nuz");
        vidlicka.najezse();
    }

    public synchronized void najezse(){
        System.out.println("jime");
    }
}
