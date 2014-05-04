/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;
import statistics.Player;
/**
 *
 * @author Blackstorm
 */
public class QueryBuilder implements Matcher{
    private Matcher query;
    
    public Matcher build(){
        return this.query;
    }
    
    public QueryBuilder hasAtLeast(int value, String category){
        this.query = new And(new HasAtLeast(value,category));
        return this;
    }
    public QueryBuilder hasFewerThan(int value, String category){
        this.query = new And(new HasFewerThan(value,category));
        return this;
    }
    public QueryBuilder playsIn(String team){
        this.query = new And(new PlaysIn(team));
        return this;
    }
    public boolean matches(Player p){
        return false;
    }
}
