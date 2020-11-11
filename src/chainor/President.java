/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainor;

/**
 *
 * @author Muzaffar
 */
public class President extends Approver {

    @Override
    public void sanctionMoney(PurchaseOrder po) {
        if(po.getAmount()<=500000){
            System.out.println("Transaction Approved By President!");
        } else{
            System.out.println("Your Amount is too High!");
            System.out.println("We'll start a board meeting to process your request.");
        }
    }
    
}
