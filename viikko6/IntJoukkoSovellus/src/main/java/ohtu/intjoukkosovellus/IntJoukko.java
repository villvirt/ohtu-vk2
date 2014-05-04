package ohtu.intjoukkosovellus;

import java.util.ArrayList;

public class IntJoukko {

   /* public final static int KAPASITEETTI = 5, // aloitustalukon koko
            OLETUSKASVATUS = 5;  // luotava uusi taulukko on 
    // näin paljon isompi kuin vanha
    private int kasvatuskoko;     // Uusi taulukko on tämän verran vanhaa suurempi.
    private int[] ljono;      // Joukon luvut säilytetään taulukon alkupäässä. 
    private int alkioidenLkm;    // Tyhjässä joukossa alkioiden_määrä on nolla.*/
    private ArrayList<Integer> jono;

    public IntJoukko() {
        /*
         * ljono = new int[KAPASITEETTI]; for (int i = 0; i < ljono.length; i++)
         * { ljono[i] = 0; } alkioidenLkm = 0; this.kasvatuskoko =
         * OLETUSKASVATUS;
         */
        //alusta();
        jono = new ArrayList();

    }

    /*public IntJoukko(int kapasiteetti) {
        if (kapasiteetti < 0) {
            return;
        }
        /*
         * ljono = new int[kapasiteetti]; for (int i = 0; i < ljono.length; i++)
         * { ljono[i] = 0; } alkioidenLkm = 0; this.kasvatuskoko =
         * OLETUSKASVATUS;
         */
     /*   alusta();
    }

    public IntJoukko(int kapasiteetti, int kasvatuskoko) {
        if (kapasiteetti < 0) {
            throw new IndexOutOfBoundsException("Kapasitteetti väärin");//heitin vaan jotain :D
        }
        if (kasvatuskoko < 0) {
            throw new IndexOutOfBoundsException("kapasiteetti2");//heitin vaan jotain :D
        }
        /*
         * ljono = new int[kapasiteetti]; for (int i = 0; i < ljono.length; i++)
         * { ljono[i] = 0; } alkioidenLkm = 0; this.kasvatuskoko = kasvatuskoko;
         */
/*        alusta();
    }*/

    public boolean lisaa(int luku) {
        if (!kuuluu(luku)) {
            jono.add(luku);
            return true;
        }
        return false;

        /*
         * if (alkioidenLkm == 0) { ljono[0] = luku; alkioidenLkm++; return
         * true; } else { if (!kuuluu(luku)) { jono.add(luku);
         * ljono[alkioidenLkm] = luku; alkioidenLkm++; if (alkioidenLkm %
         * ljono.length == 0) { int[] taulukkoOld = new int[ljono.length];
         * taulukkoOld = ljono; kopioiTaulukko(ljono, taulukkoOld); ljono = new
         * int[alkioidenLkm + kasvatuskoko]; kopioiTaulukko(taulukkoOld, ljono);
         * } return true; } } return false;
         */
    }

    public boolean kuuluu(int luku) {
        if (jono.contains(luku)) {
            return true;
        }
        return false;
        /*
         * int on = 0; for (int i = 0; i < alkioidenLkm; i++) { if (luku ==
         * ljono[i]) { on++; } } if (on > 0) { return true; } else { return
         * false;
        }
         */
    }

    public boolean poista(int luku) {
      return jono.remove(new Integer(luku)); //poistetaan luku, ei indeksiä
        /*
         * int kohta = -1; int apu; for (int i = 0; i < alkioidenLkm; i++) { if
         * (luku == ljono[i]) { kohta = i; //siis luku löytyy tuosta kohdasta :D
         * ljono[kohta] = 0; break; } } if (kohta != -1) { for (int j = kohta; j
         * < alkioidenLkm - 1; j++) { apu = ljono[j]; ljono[j] = ljono[j + 1];
         * ljono[j + 1] = apu; } alkioidenLkm--; return true; }
         *
         *
         * return false;
         */
    }

    /*
     * private void kopioiTaulukko(int[] vanha, int[] uusi) { for (int i = 0; i
     * < vanha.length; i++) { uusi[i] = vanha[i]; }
     *
     * }
     */
    public int mahtavuus() {
        return jono.size();
    }

    @Override
    public String toString() {
        /*
         * if (alkioidenLkm == 0) { return "{}"; } else if (alkioidenLkm == 1) {
         * return "{" + ljono[0] + "}"; } else { String tuotos = "{"; for (int i
         * = 0; i < alkioidenLkm - 1; i++) { tuotos += ljono[i]; tuotos += ", ";
         * } tuotos += ljono[alkioidenLkm - 1]; tuotos += "}";
         *
         * return tuotos;
         *
         * }
         */
        String joukko = jono.toString();
        joukko = joukko.substring(1, joukko.length()-1);
        return "{"+joukko+"}";
    }

    public ArrayList toIntArray() {

        /*
         * int[] taulu = new int[alkioidenLkm]; for (int i = 0; i <
         * taulu.length; i++) { taulu[i] = ljono[i]; } return taulu;
         */
        return new ArrayList(jono);
    }

    public static IntJoukko yhdiste(IntJoukko a, IntJoukko b) {
        /*
         * IntJoukko x = new IntJoukko(); int[] aTaulu = a.toIntArray(); int[]
         * bTaulu = b.toIntArray(); for (int i = 0; i < aTaulu.length; i++) {
         * x.lisaa(aTaulu[i]); } for (int i = 0; i < bTaulu.length; i++) {
         * x.lisaa(bTaulu[i]); } return x;
         */
        IntJoukko x = new IntJoukko();
        ArrayList<Integer> aJono = a.toIntArray();
        ArrayList<Integer> bJono = b.toIntArray();
        for (int i : aJono) {
            x.lisaa(i);
        }
        for (int j : bJono) {
            x.lisaa(j);
        }
        return x;
    }

    public static IntJoukko leikkaus(IntJoukko a, IntJoukko b) {
        /*
         * IntJoukko y = new IntJoukko(); int[] aTaulu = a.toIntArray(); int[]
         * bTaulu = b.toIntArray(); for (int i = 0; i < aTaulu.length; i++) {
         * for (int j = 0; j < bTaulu.length; j++) { if (aTaulu[i] == bTaulu[j])
         * { y.lisaa(bTaulu[j]); } } } return y;
         */
        IntJoukko x = new IntJoukko();
        ArrayList<Integer> aJono = a.toIntArray();
        ArrayList<Integer> bJono = b.toIntArray();
        for (int i : bJono) {
            if (aJono.contains(i)) {
                x.lisaa(i);
            }
        }
        return x;
    }

    public static IntJoukko erotus(IntJoukko a, IntJoukko b) {
        /*
         * IntJoukko z = new IntJoukko(); int[] aTaulu = a.toIntArray(); int[]
         * bTaulu = b.toIntArray(); for (int i = 0; i < aTaulu.length; i++) {
         * z.lisaa(aTaulu[i]); } for (int i = 0; i < bTaulu.length; i++) {
         * z.poista(i); }
         *
         * return z;
         */
        IntJoukko x = new IntJoukko();
        ArrayList<Integer> aJono = a.toIntArray();
        ArrayList<Integer> bJono = b.toIntArray();
        for (int i : aJono) {
            if (!bJono.contains(i)) {
                x.lisaa(i);
            }
        }
        return x;
    }

   /* private void alusta() {
        jono = new ArrayList();
        ljono = new int[kapasiteetti];
        for (int i = 0; i < ljono.length; i++) {
            ljono[i] = 0;
        }
        alkioidenLkm = 0;
        this.kasvatuskoko = kasvatuskoko;
    }*/
}