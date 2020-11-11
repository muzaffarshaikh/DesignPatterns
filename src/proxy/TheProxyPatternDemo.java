package proxy;

import java.util.Scanner;

/**
 *
 * @author Muzaffar
 */

public class TheProxyPatternDemo {

    public static void main(String[] args) {
        ProxyPrinter pp = new ProxyPrinter();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Username : ");
        String user = scan.nextLine();
        System.out.println("Enter Password : ");
        String pass = scan.nextLine();
        pp.display(user, pass);
        
        
    }
    
}
