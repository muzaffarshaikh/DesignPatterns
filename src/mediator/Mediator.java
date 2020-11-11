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
public class Mediator {
    public void send(String msg, Colleague c){
        c.notify(c.getName() + " : " + msg);
    }
}
