
package ohtu.intjoukkosovellus;

import java.util.Arrays;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JoukkoOperaatiotTest {
    
    
    @Test
    public void testSomething() {
        IntJoukko eka = teeJoukko(1,2);
        IntJoukko toka = teeJoukko(3,4);
        
        IntJoukko tulos = IntJoukko.yhdiste(eka, toka);
        ArrayList<Integer> vastauksenLuvut = tulos.toIntArray();
       // Arrays.sort(vastauksenLuvut);

        ArrayList<Integer> odotettu = new ArrayList();
        odotettu.add(1);
        odotettu.add(2);
        odotettu.add(3);
        odotettu.add(4);
        
        assertEquals(odotettu, vastauksenLuvut);        
    } 

    private IntJoukko teeJoukko(int... luvut) {
        IntJoukko joukko = new IntJoukko();
        
        for (int luku : luvut) {
            joukko.lisaa(luku);
        }
        
        return joukko;
    }
}
