package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends KSPTemplate{

    private static final Scanner scanner = new Scanner(System.in);



    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}