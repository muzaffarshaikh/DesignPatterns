package prototype;

/**
 *
 * @author Student
 */
abstract class Bike implements Cloneable {
    public abstract String returnBike();
    
    public Object Clone() throws CloneNotSupportedException {
        return super.clone();
    }  
}
