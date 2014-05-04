/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;
import java.util.Scanner;
/**
 *
 * @author Blackstorm
 */
public abstract class KSPTemplate implements KSP {

    public KSPTemplate() {
    }

    public void pelaa(String pelaaja1,String pelaaja2) {
        Tuomari tuomari = new Tuomari();
        TekoalyParannettu tekoaly = new TekoalyParannettu(20);
        System.out.print("Ensimm\u00e4isen pelaajan siirto: ");
        String ekanSiirto = KPSParempiTekoaly.scanner.nextLine();
        String tokanSiirto;
        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();
            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = KPSParempiTekoaly.scanner.nextLine();
            tokanSiirto = tekoaly.annaSiirto();
            System.out.println("Tietokone valitsi: " + tokanSiirto);
            tekoaly.asetaSiirto(ekanSiirto);
        }
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
    
}
