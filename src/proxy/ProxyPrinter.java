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
public class ProxyPrinter implements PrintInterface {

    Printer p = new Printer();
    @Override
    public void display(String user, String pass) {
       if(user.equals("admin") && pass.equals("mscit123")){
           p.display(user, pass);  
       }else{
           System.out.println("Access Denied");
       }
    }
    
}
