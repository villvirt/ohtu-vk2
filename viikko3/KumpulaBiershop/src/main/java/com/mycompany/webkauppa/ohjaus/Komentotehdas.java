/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webkauppa.ohjaus;

import com.mycompany.webkauppa.sovelluslogiikka.Ostoskori;

/**
 *
 * @author Blackstorm
 */
public class Komentotehdas {

    Komento komento;

    public Komentotehdas ostoksenLisaysKoriin(Ostoskori ostoskori, long tuoteId) {
        this.komento = new OstoksenLisaysKoriin(ostoskori, tuoteId);
        return this;
    }

   /* public Komentotehdas ostoksenPoistoKorista(Ostoskori ostoskori, long tuoteId) {
        this.komento = new OstoksenLisaysKoriin(ostoskori, tuoteId);
        return this;
    }
    public Komentotehdas ostoksenSuoritus(String nimi, String osoite, String luottokorttinumero, Ostoskori kori){
        this.komento = new OstoksenSuoritus(nimi,osoite,luottokorttinumero,kori);
        return this;
    }*/
    public boolean suorita() {
        return this.komento.suorita();
    }
}
