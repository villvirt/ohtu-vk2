package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly implements Komento{

    KSPTemplate peli;

    public KPSTekoaly() {
        Tekoaly tekoaly = new Tekoaly();
        this.peli = new KSPTemplate(tekoaly);
    }

    public void pelaa() {
        peli.pelaa("Pelaaja1", "Tietokone");
    }
}