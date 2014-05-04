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
public class KSPTemplate {

    private static Scanner scanner;
    private TekoAlyInterface tekoaly;

    public KSPTemplate(TekoAlyInterface tekoaly) {
        this.scanner = new Scanner(System.in);
        this.tekoaly = tekoaly;
    }

    public KSPTemplate() {
        this.scanner = new Scanner(System.in);
    }

    public void pelaa(String player1, String player2) {
        Tuomari tuomari = new Tuomari();
        System.out.print(player1 + ":n vuoro\n");
        String player1Siirto = this.scanner.nextLine();
        String player2Siirto = tokanSiirto(player2, player1Siirto);
        while (onkoOkSiirto(player1Siirto) && onkoOkSiirto(player2Siirto)) {
            tuomari.kirjaaSiirto(player1Siirto, player2Siirto);
            System.out.println(tuomari);
            System.out.println();
            System.out.print(player1 + "n vuoro\n");
            player1Siirto = KSPTemplate.scanner.nextLine();
            player2Siirto = tokanSiirto(player2, player1Siirto);

        }
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    private String tokanSiirto(String player2, String player1Siirto) {
        String siirto;
        if (tekoaly == null) {
            System.out.println(player2 + ":n vuoro\n");
            siirto = this.scanner.nextLine();
            return siirto;
        } else {
            siirto = tekoaly.annaSiirto();
            System.out.println("Tietokone valitsi:" + siirto);
            tekoaly.asetaSiirto(player1Siirto);
            return siirto;
        }

    }
}
