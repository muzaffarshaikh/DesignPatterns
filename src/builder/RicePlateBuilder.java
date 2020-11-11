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

public abstract class RicePlateBuilder {
    
    RicePlate rp = new RicePlate();
    abstract public RicePlate getRicePlate();
    abstract public void createNewRicePlate();
    abstract public void makeDishes();
    abstract public void makeDessert();
    abstract public void makeDrinks();
    
}
