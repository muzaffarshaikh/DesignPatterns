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
public class Off extends State {
    public Off() {
        stateName = "OFF";
        System.out.println("OFF");
    }

    @Override
    public void doAction(Context c) {
        // TODO Auto-generated method stub
        On on = new On();
        c.setState(on);

    }

}
