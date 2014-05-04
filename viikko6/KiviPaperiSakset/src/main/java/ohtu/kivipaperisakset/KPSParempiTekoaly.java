package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly implements Komento{
    KSPTemplate peli;
    public KPSParempiTekoaly(){
        TekoalyParannettu tekoaly= new TekoalyParannettu(20);
        this.peli = new KSPTemplate(tekoaly);
    }
    public void pelaa(){
        peli.pelaa("Pelaaja1", "Tietokone");
    }
    
}
