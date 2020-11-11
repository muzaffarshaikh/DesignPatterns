package factory;

import thefactorypattern.ElectricityBillInterface;

/**
 *
 * @author Student
 */

public class Institutional implements ElectricityBillInterface {

    @Override
    public float generateElectricityBill(float i) {
         return (i * 5.50f);
    }
}
