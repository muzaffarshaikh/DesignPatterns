package prototype;

public class MainClass {

    public static void main(String[] args) throws CloneNotSupportedException {

        Sedan sedan = new Sedan();
        Scooter scooter = new Scooter();

        PrototypeGenerator pg;
        pg = new PrototypeGenerator(sedan, scooter);

    }

}
