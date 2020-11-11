package memento;

import java.util.Scanner;

/**
 *
 * @author Muzaffar
 */
public class Main {
    
    

    public static void main(String[] args) {
        Memory meme = new Memory();
        InsuranceCustomer ic = new InsuranceCustomer("Muzaffar",9289,"mzfr@gmail.com");   
        System.out.println("Current User "+ic.getName());
        meme.setMen(ic.saveMemento());
        
        ic.setName("Akshay");
        ic.setPhone(90908);
        ic.setEmail("mzfr@gmail.com");
        
        System.out.println("Control Passed to User " + ic.getName());
        
        ic.restoreMemento(meme.getMen());
        
        System.out.println("Curernt User "+ic.getName());
    }
    
}
