package decorator;

/**
 *
 * @author Muzaffar
 */
public class Shop extends ConstructionProject {

    public String shopid;

    public void display() {

        System.out.println("Shop ID : " + shopid);
        System.out.println(owner);
    }
}
