/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

/**
 *
 * @author Muzaffar
 */
public class Leaseable extends Decorator {

    private String leasee;

    Leaseable(ConstructionProject cp) {
        super(cp);
    }

    public String getLeasee() {
        return leasee;
    }

    public void setLeasee(String leasee) {
        this.leasee = leasee;
    }

    public void leaseFlat(String leasee) {
        this.leasee = leasee;
    }

    public void display() {
        System.out.println("Leased by: " + leasee);
        cp.display();
    }
}
