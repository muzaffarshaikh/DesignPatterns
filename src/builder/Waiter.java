package builder;

import java.util.Scanner;

/**
 *
 * @author Muzaffar
 */
public class Waiter {
    
    RicePlateBuilder rpb;
    
      public void setRicePlateBuilder(){ 
          Scanner scan = new Scanner(System.in);
          System.out.println("M    E    N    U");
          System.out.println("Please Select a Thali");
          System.out.println("1. Non-Veg Rice Plate");
          System.out.println("2. Veg Rice Plate");
          int choice = scan.nextInt();
          
          switch(choice){
              case 1:
                  System.out.println("\nNon-Veg Rice Plate\n");
                  rpb = new NonVegRicePlateBuilder();
                  rpb.createNewRicePlate();
                  break;  
                  
              case 2:
                  System.out.println("\nVeg Rice Plate\n");
                  rpb = new VegRicePlateBuilder();
                  break; 
                  
              default:
                  System.out.println("Please Enter a correct choice!");    
          }
      }
      
      public RicePlate getRicePlate(){
        return rpb.getRicePlate();
      }
      
      public void constructRicePlate(){
          rpb.createNewRicePlate();
          rpb.makeDishes();
          rpb.makeDessert();
          rpb.makeDrinks();
      }
}
