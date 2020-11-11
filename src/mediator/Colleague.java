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
public class Colleague {
    private final String name;

    public String getName() {
        return name;
    }
    private final Mediator m;
    
    public Colleague(Mediator m, String name){
        this.name = name;
        this.m = m;
    }
    
    public void send(String message){
        m.send(message, this);
    }
    
    public void notify(String message){
        System.out.println("Recieved Message from " + message);
    }
}
