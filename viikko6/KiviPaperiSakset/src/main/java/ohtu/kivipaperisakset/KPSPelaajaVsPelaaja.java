package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja implements Komento{
 KSPTemplate peli;
    public KPSPelaajaVsPelaaja(){
        this.peli = new KSPTemplate();
    }
    public void pelaa(){
        peli.pelaa("Pelaaja1", "Pelaaja2");
    }

}