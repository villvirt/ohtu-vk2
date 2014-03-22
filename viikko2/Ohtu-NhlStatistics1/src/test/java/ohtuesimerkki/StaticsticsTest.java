package ohtuesimerkki;

import java.util.List;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StaticsticsTest {

    Statistics stats;
    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri", "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };
    @Before
    public void setUp() {
         stats = new Statistics(readerStub);
    }
    
    @Test
    public void etsintaJosLoytyy(){
        assertEquals("Semenko", stats.search("Semenko").getName());
    }
    
    @Test
    public void etsintaJosEiLoytyy(){
        assertEquals(null, stats.search("Virtanen"));
    }
    
    @Test
    public void joukkueenPelaajat(){
        Player yzerman = new Player("Yzerman", "DET", 42, 56);
        assertEquals(yzerman.getName(),stats.team("DET").get(0).getName());
    }
     
    @Test
    public void enitenPisteita(){
        
        //Gretzky 35+89 = 124
        assertEquals(124,stats.topScorers(1).get(0).getPoints());
    }
    
     @Test
    public void oikeaMaaraListaan(){

        assertEquals(3,stats.topScorers(3).size());
    }
    
    
}