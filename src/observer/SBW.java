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
public class SBW extends Stock{

    public SBW(String symbol, int price, ArrayList<Investor> investorList) {
        super(symbol, price, investorList);
    }
    
}
