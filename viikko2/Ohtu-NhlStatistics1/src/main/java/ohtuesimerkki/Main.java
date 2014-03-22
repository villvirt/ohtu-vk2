package ohtuesimerkki;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics( new PlayerReader("http://nhlstats-2013-14.herokuapp.com/players.txt") );
        

<<<<<<< HEAD
=======
        System.out.println("Philadelphia Flyers");
       for (Player player : stats.team("PHI") ) {
           System.out.println( player );
        }
>>>>>>> 2eb2818023b000e7da0a5f693f64b913c77bad07
       
        System.out.println("");
        
        System.out.println("Top scorers");
        for (Player player : stats.topScorers(5) ) {
            System.out.println( player );
<<<<<<< HEAD
        }     
=======
        }       
>>>>>>> 2eb2818023b000e7da0a5f693f64b913c77bad07
    }
}
