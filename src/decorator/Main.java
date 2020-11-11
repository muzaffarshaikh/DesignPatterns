package decorator;

/**
 *
 * @author Muzaffar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Flat f = new Flat();
        f.setFlatNo(12);
        f.setFlatid("101");
        f.setNoOfBedrooms(3);
        f.setOwner("Muzaffar");
        f.setArea(250.00);
        f.setBalconyPresent(true);
        
        Leaseable l = new Leaseable(f);
        l.setLeasee("XYZ");
        l.display();
        
    }
    
}
