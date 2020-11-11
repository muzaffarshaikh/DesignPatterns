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
public class PurchaseOrder {
    
    private int orderNo;
    private double amount;
    
    
    
    PurchaseOrder(int orderNo, double amount){
        this.orderNo=orderNo;
        this.amount=amount;           
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
