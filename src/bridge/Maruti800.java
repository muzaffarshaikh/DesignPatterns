/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author Muzaffar
 */
 public class Maruti800 extends MarutiCar{

    
    @Override
    public void DisplayMileage() {
         
        CityRoad c = new CityRoad();
        Highway h = new Highway();
        
        
        this.NoOfSeats =5;
        this.Year=2000;
        
        System.out.println("No Of Seats:" +NoOfSeats);
        
        System.out.println("Year:" +Year);
        
        c.DisplayMileage();
        
        h.DisplayMileage();
    }

    
       
        
    

    
     
    
  
      
       
        
    }
     

