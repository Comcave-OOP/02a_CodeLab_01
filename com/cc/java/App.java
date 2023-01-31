package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Konten erzeugen
        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);
        
        // Ausgabe Anfangsstand
        output(String.valueOf(konto1.getKontostand()));
        output(String.valueOf(konto2.getKontostand()));
        output(String.valueOf(konto3.getKontostand()));

        // 1.Variante
        // konto1.setKontostand(konto1.getKontostand() * 2);
        // konto2.setKontostand(konto2.getKontostand() * 3);
        // konto3.setKontostand(konto3.getKontostand() * 10);

        // 2.Variante
        konto1.updateKonto(2);
        konto2.updateKonto(3);
        konto3.updateKonto(10);

        // Ausgabe Endstand
        output(String.valueOf(konto1.getKontostand()));
        output(String.valueOf(konto2.getKontostand()));
        output(String.valueOf(konto3.getKontostand()));
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }
}

