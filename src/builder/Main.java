package builder;

public class Main {
    
    public static void main(String[] args) {
        
        Waiter w = new Waiter();
        w.setRicePlateBuilder();
        w.constructRicePlate();
        
        RicePlate rc = w.getRicePlate();
        rc.display();
        
        
    }
    
}
