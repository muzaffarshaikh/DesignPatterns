/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author Muzaffar
 */
public class Stock {
    private final String symbol;
    private double price;
    
    ArrayList<Investor> investorList;
    
    Stock(String symbol, int price, ArrayList<Investor> investorList){
        this.symbol = symbol;
        this.price = price;
        this.investorList = investorList;
    }
    
    public void attach(Investor investor){
        investorList.add(investor);
    }
    
    public void notifyInvestors(){
        for(int i = 0; i < investorList.size(); i++){
            investorList.get(i).update();
        }
    }
    
    public void setPrice(double price){
        this.price = price;
        notifyInvestors();
    }
}
