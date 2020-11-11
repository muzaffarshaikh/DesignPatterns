package singleton;

/**
 *
 * @author Student
 */

public class SBW {
    
    private static SBW instance;
    
    private final String name = "Swastik Bakery Works";
    private final String address = "Near Old Bus Stand, Aquem, Margao - Goa";
    private final String telephone = "9876543210";
    private final String email = "swastikbakeryworks@gmail.com";
  
    
    public static SBW getInstance(){
        if(instance == null)
            instance = new SBW();
        return instance;
    }
    
    public void getSBWdetails(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(telephone);
        System.out.println(email);
    }
    
}
