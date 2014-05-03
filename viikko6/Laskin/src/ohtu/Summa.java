/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author Blackstorm
 */
public class Summa implements Komento {

    private Sovelluslogiikka sovelluslogiikka;
    private JTextField tulos;
    private JTextField syote;

    public Summa(Sovelluslogiikka sovelluslogiikka, JTextField tuloskentta, JTextField syotekentta) {
        this.sovelluslogiikka = sovelluslogiikka;
        this.tulos = tuloskentta;
        this.syote = syotekentta;
    }

    public void suorita() {
        int syotettyLuku = Integer.parseInt(syote.getText());
        sovelluslogiikka.plus(syotettyLuku);
        tulos.setText("" + sovelluslogiikka.tulos());
    }

    public void peru() {
        int syotettyLuku = Integer.parseInt(syote.getText());
        sovelluslogiikka.miinus(syotettyLuku);
        tulos.setText("" + sovelluslogiikka.tulos());
    }
}
