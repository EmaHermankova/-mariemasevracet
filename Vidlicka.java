package org.example;

public class Vidlicka {

    Nuz nuz;

    public synchronized  void vezmiSi(){
        System.out.println("vzal jsem si vidlicku");
        nuz.najezse();
    }

    public synchronized void najezse(){
        System.out.println("jime");
    }
}
