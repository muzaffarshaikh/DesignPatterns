/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Muzaffar
 */
public class On extends State {
    public On() {
        stateName = "ON";
        System.out.println("ON");

    }

    @Override
    public void doAction(Context c) {
        Off off = new Off();
        c.setState(off);
    }
}
