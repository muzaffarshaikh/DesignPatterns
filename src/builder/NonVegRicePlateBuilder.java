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
public class NonVegRicePlateBuilder extends RicePlateBuilder {

    RicePlate nvrp = new RicePlate();
    
    @Override
    public void createNewRicePlate() {
        nvrp = new RicePlate();
    }

    @Override
    public void makeDishes() {
       nvrp.setDishes("Basmati Rice\n", "Prawn Curry\n", "Fried Kingfish\n", "Butter Chicken\n", "Prawn Vindaloo\n", "Fried Oysters\n");
    }

    @Override
    public void makeDessert() {
        nvrp.setDessert("Fruit Cocktail");
    }

    @Override
    public void makeDrinks() {
        nvrp.setDrink("Lime Juice");
    }

    @Override
    public RicePlate getRicePlate() {
       return nvrp;
    }
    
}
