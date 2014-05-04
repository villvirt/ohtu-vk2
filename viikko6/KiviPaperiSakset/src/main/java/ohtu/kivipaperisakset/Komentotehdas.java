/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

/**
 *
 * @author Blackstorm
 */
public class Komentotehdas {

    Komento komento;

    public Komentotehdas pahaYksinpeli() {
        this.komento = new KPSParempiTekoaly();
        return this;
    }

    public Komentotehdas kaksiPelaajaa() {
        this.komento = new KPSParempiTekoaly();
        return this;
    }

    public Komentotehdas yksinpeli() {
        this.komento = new KPSTekoaly();
        return this;
    }
    
    public void pelaa(){
        this.komento.pelaa();
    }
}
