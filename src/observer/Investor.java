/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Muzaffar
 */
public class Investor implements Interface {
    private final String name;
    
    public Investor(String name){
        this.name = name;
    }
    
    public void setStock(Stock stock){
        stock.attach(this);
    }

    @Override
    public void update() {
        System.out.println(name + " your stock price has changed");
    }
}
