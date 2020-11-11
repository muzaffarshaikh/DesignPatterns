/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author Student
 */
public class ConcreteMediator extends Mediator {
    
    private ConcreteColleagueOne c1;
    private ConcreteColleagueTwo c2;
    
    public void setColleague1(ConcreteColleagueOne c1){
        this.c1 = c1;
    }
    
    public void setColleague2(ConcreteColleagueTwo c2){
        this.c2 = c2;
    }
}
