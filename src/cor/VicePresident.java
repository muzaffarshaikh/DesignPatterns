/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cor;

/**
 *
 * @author Student
 */
public class VicePresident extends Approver {

    @Override
    public void sanctionMoney(PurchaseOrder po) {
        if(po.getAmount()>=250000){
            System.out.println("Passed on to President.");
            System.out.println("Kindly be Patient...");

            this.getSuccessor().sanctionMoney(po);
            
        } else{
            System.out.println("Transaction Approved By Vice-President!");
        }
    }
    
}
