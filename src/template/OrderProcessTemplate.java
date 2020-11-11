package template;

/**
 *
 * @author Muzaffar
 */
public abstract class OrderProcessTemplate {
    
    abstract void doSelect();
    
    abstract void doPayment();
    
    abstract void doDelivery();
    
    public void doGiftWrap(){
        System.out.println("Wrapped!");
    }
    
    public final void processOrder(boolean wrap){
        doSelect();
        doPayment();
        if(wrap == true){
            doGiftWrap();
        }
        doPayment();
    }  
}
