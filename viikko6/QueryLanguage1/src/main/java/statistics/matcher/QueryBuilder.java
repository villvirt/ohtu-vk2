/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;
import statistics.Player;
import java.util.ArrayList;
/**
 *
 * @author Blackstorm
 */
public class QueryBuilder implements Matcher{
   private String operator="and"; //and, or, not
    private ArrayList<Matcher> query = new ArrayList();
    
    public Matcher build(){
        if(operator.equals("and")){
        return new And(this.query.toArray(new Matcher[query.size()]));
        }
        else if (operator.equals("or")){
            return new Or(this.query.toArray(new Matcher[query.size()]));
        }
        else{
            System.out.println("not");
            return new Not(this.query.toArray(new Matcher[query.size()]));
        }
    }
    
    public QueryBuilder hasAtLeast(int value, String category){
        this.query.add(new HasAtLeast(value,category));
        return this;
    }
    public QueryBuilder hasFewerThan(int value, String category){
        this.query.add(new HasFewerThan(value,category));
        return this;
    }
    public QueryBuilder playsIn(String team){
        this.query.add(new PlaysIn(team));
        return this;
    }
    public boolean matches(Player p){
        return false;
    }
    public QueryBuilder oneOf(){
        this.operator="or";
        return this;
    }
    public QueryBuilder not(){
        this.operator="not";
        return this;
    }
    
}
