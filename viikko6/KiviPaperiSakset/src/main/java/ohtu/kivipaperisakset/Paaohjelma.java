package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);
    private static Komentotehdas komento = new Komentotehdas();
    public static void main(String[] args) {

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            if (vastaus.endsWith("a")) {               
                    komento.kaksiPelaajaa().pelaa();
            } else if (vastaus.endsWith("b")) {              
                komento.yksinpeli().pelaa();
            } else if (vastaus.endsWith("c")) {              
                komento.pahaYksinpeli().pelaa();
            } else {
                break;
            }

        }

    }
}
