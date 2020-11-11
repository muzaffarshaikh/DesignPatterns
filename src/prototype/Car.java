package prototype;

/**
 *
 * @author Student
 */
abstract class Car implements Cloneable {
    public abstract String returnCar();
    
    public Object Clone() throws CloneNotSupportedException {
        return super.clone();
    }    
}
