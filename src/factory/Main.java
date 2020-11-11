package factory;

import java.util.Scanner;

//CREATE A SEPERATE FACTORY CLASS TO DECIDE WHICH CLASS TO IMPLEMENT

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);        
        boolean run = true;
        
        ElectricityFactory ef = new ElectricityFactory();
        
        while(run){
            System.out.println("Enter bill type \n1: Domestic \n2: Institutional \n3: Commerical");
            if(scan.hasNextInt()){
                int BillType = scan.nextInt();
                System.out.println("Enter the units : ");
                if(scan.hasNextInt()){
                    int units = scan.nextInt();                   
                    ef.GenerateElectricityBill(BillType, units);
                } else{
                    run = false;
                    System.out.print("Exiting program\n");
                }
            } else{
                run = false;
                System.out.print("Exiting program\n");
            }        
        }      
    } 
}
