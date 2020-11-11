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
public class Runtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Investor firstInvestor = new Investor("Muzaffar");
        Investor secondInvestor = new Investor("Mangrish");
        Investor thirdInvestor = new Investor("Valdo");

        ArrayList<Investor> infosysInvestor = new ArrayList<>();
        infosysInvestor.add(firstInvestor);
        infosysInvestor.add(secondInvestor);

        ArrayList<Investor> TCSInvestor = new ArrayList<>();
        TCSInvestor.add(thirdInvestor);
        TCSInvestor.add(secondInvestor);

        SBW infosysStock = new SBW("LOL", 500, infosysInvestor);
        SBW TCSStock = new SBW("OWO", 700, TCSInvestor);

        infosysStock.setPrice(600);
        TCSStock.setPrice(400);
        infosysStock.setPrice(300);
        TCSStock.setPrice(700);
        TCSStock.setPrice(500);
    }
}