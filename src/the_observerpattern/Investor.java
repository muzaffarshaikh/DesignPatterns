/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_observerpattern;

/**
 *
 * @author Muzaffar
 */
public class Investor implements MyInterface {
    
    Stock st;
    private final String name;
    
    Investor(String name){
        this.name = name;  
    }
    
    public void setStock(Stock stock){
       
    }

    @Override
    public void update() {
        
    }
    
}
