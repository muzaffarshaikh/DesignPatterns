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
public class Secretary extends Approver {

    @Override
    public void sanctionMoney(PurchaseOrder po) {
        
        if(po.getAmount()>=100000){
            System.out.println("Passed on to Vice-President.");
            System.out.println("Kindly be Patient...");
            this.getSuccessor().sanctionMoney(po);
        } else{
             System.out.println("Transaction Approved By Secretarory!");
        }
    }
    
}
