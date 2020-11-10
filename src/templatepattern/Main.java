package templatepattern;

import java.util.Scanner;

/**
 *
 * @author Muzaffar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        OrderProcessTemplate online = new OnlineOrder();
        OrderProcessTemplate store = new StoreOrder();

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Online Order");
        System.out.println("2. Store Order");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                online.processOrder(true);
                break;
            case 2:
                store.processOrder(true);
                break;
            default:
                System.out.println("Please Order Again!");
                break;
        }

    }

}
