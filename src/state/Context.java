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
public class Context {

    State s;

    public State getS() {
        return s;
    }

    public void setState(State s) {
        this.s = s;
    }

    public void toggle() {
        s.doAction(this);
    }

}
