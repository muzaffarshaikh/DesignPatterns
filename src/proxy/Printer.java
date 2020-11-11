/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author Muzaffar
 */
public class Printer implements PrintInterface {

    @Override
    public void display(String user, String pass) {
        System.out.println(user+" has access to print.");  
    } 
}
