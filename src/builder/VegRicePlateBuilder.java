/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Muzaffar
 */
public class VegRicePlateBuilder extends RicePlateBuilder {
    
    RicePlate vrp = new RicePlate();

    @Override
    public void createNewRicePlate() {
        vrp = new RicePlate();
    }

    @Override
    public void makeDishes() {
        vrp.setDishes("Basmati Rice\n", "Coconut Curry\n", "Dal\n", "Papad\n", "Brinjal Raita\n", "Potato Bhaaji\n");
    }

    @Override
    public void makeDessert() {
        vrp.setDessert("Fruit Salad");
    }

    @Override
    public void makeDrinks() {
        vrp.setDrink("Orange Juice");
    }

    @Override
    public RicePlate getRicePlate() {
       return vrp;
    }
    
}
