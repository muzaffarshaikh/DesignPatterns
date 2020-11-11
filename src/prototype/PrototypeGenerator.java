package prototype;

/**
 *
 * @author Student
 */
public class PrototypeGenerator {
    
//    public Car AbstractCar;
//    public Bike AbstractBike;
    
    public PrototypeGenerator(Car prototypeCar, Bike prototypeBike) throws CloneNotSupportedException{
        System.out.println("Car : " + prototypeCar.returnCar() + ", HashCode : " + prototypeCar.hashCode() + "\nBike : " + prototypeBike.returnBike() + ", " + prototypeBike.hashCode()+"\n");
        
        Car car = cloneCar(prototypeCar);
        Bike bike = cloneBike(prototypeBike);
        
        System.out.println("Clone : ");
        
        System.out.println("Car : " + car.returnCar() + ", HashCode : " + car.hashCode() + "\nBike : " + bike.returnBike() + " , " + bike.hashCode());
        
    }

    private Car cloneCar(Car prototypeCar) throws CloneNotSupportedException {
        return (Car) prototypeCar.Clone();
    }

    private Bike cloneBike(Bike prototypeBike) throws CloneNotSupportedException {
        return (Bike) prototypeBike.Clone();
    }
    
}
