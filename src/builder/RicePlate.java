/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Student
 */

public class RicePlate {
    
    String dish1;
    String dish2;
    String dish3;
    String dish4;
    String dish5;
    String dish6;
    String dessert;
    String drink;
            
    public void setDishes(String d1, String d2, String d3, String d4, String d5, String d6){
        dish1=d1;
        dish2=d2;
        dish3=d3;
        dish4=d4;
        dish5=d5;
        dish6=d6;
    }
    
    public void setDessert(String de){
        dessert=de;
    }
    
    public void setDrink(String d){
        drink=d;
    }
    
    public void display(){
        System.out.println("Dish 1: "+dish1+" "+"Dish 2: "+dish2+" "+"Dish 3: "+dish3+" "+"Dish 4: "+dish4+" "+"Dish 5: "+dish5+" "+"Dish 6: "+dish6+" ");
        System.out.println("Dessert: "+dessert+" ");
        System.out.println("Drink: "+drink+" ");
    }
        
}
