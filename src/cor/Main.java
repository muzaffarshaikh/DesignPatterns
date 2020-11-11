package cor;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {
    
    //Chain Of Responsibility

    public static void main(String[] args) {
        PurchaseOrder po;
        President p = new President();
        VicePresident vp = new VicePresident();
        Secretary s = new Secretary();
        
        s.setSuccessor(vp);
        vp.setSuccessor(p);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Order ID : ");
        int oid = sc.nextInt();
        System.out.println("Enter Amount : ");
        double amt = sc.nextDouble();
        
        po = new PurchaseOrder(oid, amt);
        
        s.sanctionMoney(po);
    }
}
