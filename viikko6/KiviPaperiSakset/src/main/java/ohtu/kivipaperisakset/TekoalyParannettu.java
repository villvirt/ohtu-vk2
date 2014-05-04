
package ohtu.kivipaperisakset;

// "Muistava tekoäly"

public class TekoalyParannettu implements TekoAlyInterface{
  private String[] muisti;
  private int vapaaMuistiIndeksi;

  public TekoalyParannettu(int muistinKoko) {
    muisti = new String[muistinKoko];
    vapaaMuistiIndeksi = 0;
  }
  
  public void asetaSiirto(String siirto) {
    // jos muisti täyttyy, unohdetaan viimeinen alkio
    if(vapaaMuistiIndeksi == muisti.length) {
      for(int i = 1; i < muisti.length; i++) {
        muisti[i-1] = muisti[i];
      }
      
      vapaaMuistiIndeksi--;
    }
    
    muisti[vapaaMuistiIndeksi] = siirto;    
    vapaaMuistiIndeksi++;
  }

  
  public String annaSiirto() {
    if(vapaaMuistiIndeksi == 0 || vapaaMuistiIndeksi == 1) {
      return "k";
    }
    
    String viimeisinSiirto = muisti[vapaaMuistiIndeksi - 1];
    
    int kivi = 0;
    int paperi = 0;
    int s = 0;
    
    
    for(int i = 0; i < vapaaMuistiIndeksi - 1; i++) {
      if(viimeisinSiirto.equals(muisti[i])) {
        String seuraava = muisti[i+1];
        
        if("k".equals(seuraava)) {
          kivi++;
        }
        else if("p".equals(seuraava)) {
          paperi++;
        }
        else {
          s++;
        }        
      }
    }
    
    
    // Tehdään siirron valinta esimerkiksi seuraavasti;
    // - jos kiviä eniten, annetaan aina paperi
    // - jos papereita eniten, annetaan aina sakset
    // muulloin annetaan aina kivi
    if(kivi > paperi && kivi > s) {
      return "p";
    }
    else if (paperi > kivi && paperi > s) {
      return "s";
    }
    else {
      return "k";
    }
    
    // Tehokkaampiakin tapoja löytyy, mutta niistä lisää 
    // Johdatus Tekoälyyn kurssilla!
  }
}