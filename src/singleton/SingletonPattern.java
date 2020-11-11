package singleton;

/**
 *
 * @author Muzaffar
 */

public class SingletonPattern {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        SBW instance = SBW.getInstance();
        instance.getSBWdetails();
        System.out.println("");
        System.out.println(SBW.getInstance().hashCode() + " : " + SBW.getInstance().hashCode() );
        System.out.println("");
        instance.getSBWdetails();
        
    }
    
}
