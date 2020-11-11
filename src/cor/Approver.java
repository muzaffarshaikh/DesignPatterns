/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cor;

/**
 *
 * @author Muzaffar
 */
public abstract class Approver {
    
    private Approver successor;
    
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }
    
    public Approver getSuccessor() {
        return successor;
    }

    public abstract void sanctionMoney(PurchaseOrder po);
}
