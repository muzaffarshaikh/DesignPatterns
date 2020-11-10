/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_observerpattern;

import java.util.ArrayList;


/**
 *
 * @author Muzaffar
 */
public class Stock {
    
    private final String symbol;
    private Double price;
    public ArrayList<Investor> investorList;
    
    /**
     *
     * @param symbol
     * @param price
     * @param investorList
     */
    public Stock(String symbol, Double price, ArrayList<Investor> investorList){
        this.symbol = symbol;
        this.price = price;
        this.investorList = investorList;
    }
    
    public void attach(Investor investor){
        investorList.add(investor);
    }
    
    public void Notify(){
        
    }
    
    public void setPrice(Double price){
        this.price = price;
    } 
}





