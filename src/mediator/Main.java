/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author Muzaffar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mediator med = new Mediator();        
        
        ConcreteColleagueOne c1 = new ConcreteColleagueOne(med, "Person1");
        ConcreteColleagueTwo c2 = new ConcreteColleagueTwo(med, "Person2");
        
        c1.send("Hey....");
        
        c1.send("How are you?");
        
        c2.send("Good!!!");
        
        c2.send("How are you?");
    }
    
}
