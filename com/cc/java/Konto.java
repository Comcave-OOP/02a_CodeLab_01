package com.cc.java;

public class Konto {

    private int kontostand;

    public Konto(int kontostand) {
        this.kontostand = kontostand;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    // 2.Variante
    public void updateKonto(int faktor){
        // this.kontostand = this.kontostand * faktor;
        this.kontostand *= faktor; // kürzere Schreibweise
    }

}
