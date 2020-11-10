/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatepattern;

/**
 *
 * @author Muzaffar
 */
public class OnlineOrder extends OrderProcessTemplate {

    @Override
    void doSelect() {
        System.out.println("Selected");
    }

    @Override
    void doPayment() {
        System.out.println("Made Payment");
    }

    @Override
    void doDelivery() {
        System.out.println("Delivered");
    }
    
}
