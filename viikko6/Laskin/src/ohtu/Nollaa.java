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
public class Nollaa implements Komento{
    private Sovelluslogiikka sovelluslogiikka;
    private JTextField tulos;
    private JTextField syote;
    private int vanhaTulos;
    
    public Nollaa(Sovelluslogiikka sovelluslogiikka, JTextField tuloskentta, JTextField syotekentta){
       this.sovelluslogiikka=sovelluslogiikka;
       this.tulos = tuloskentta;
       this.syote = syotekentta;

    }
    public void suorita(){
        tulos.setText(""+0);
        syote.setText(""+0);
        this.vanhaTulos=sovelluslogiikka.tulos();
        sovelluslogiikka.nollaa();
    }
    
    public void peru(){
        System.out.println(vanhaTulos);
        sovelluslogiikka.plus(vanhaTulos);
        tulos.setText("" + sovelluslogiikka.tulos());
    }
}
