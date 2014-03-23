package ohtu.verkkokauppa;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;


@Component
public class Kauppa {

    private Varasto varasto;
    private Pankki pankki;
    private Ostoskori ostoskori;
    private Viitegeneraattori viitegeneraattori;
    private String kaupanTili;
    private Kirjanpito kirjanpito;
   
    
    @Autowired
    public Kauppa (Varasto v, Pankki p, Viitegeneraattori g, Kirjanpito k) {
        varasto = v;
        pankki = p;
        viitegeneraattori = g;
        kirjanpito = k;
        kaupanTili = "33333-44455";
    }

    public void aloitaAsiointi() {
        ostoskori = new Ostoskori();
    }

    public void poistaKorista(int id) {
        Tuote t = varasto.haeTuote(id); 
        varasto.palautaVarastoon(t);
    }

    public void lisaaKoriin(int id) {
        if (varasto.saldo(id)>0) {
            Tuote t = varasto.haeTuote(id);             
            ostoskori.lisaa(t);
            varasto.otaVarastosta(t);
        }
    }

    public boolean tilimaksu(String nimi, String tiliNumero) {
        int viite = viitegeneraattori.uusi();
        int summa = ostoskori.hinta();
        
        return pankki.tilisiirto(nimi, viite, tiliNumero, kaupanTili, summa);
    }
    
    public void tapahtumat(){
            for (String tapahtuma : kirjanpito.getTapahtumat()) {
            System.out.println(tapahtuma);
        }
    }
}
