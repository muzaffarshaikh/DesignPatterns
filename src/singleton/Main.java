package singleton;

/**
 *
 * @author Student
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        SBW instance = SBW.getInstance();
        instance.getSBWdetails();
        System.out.println("");
        System.out.println(SBW.getInstance());

        
    }
    
}
