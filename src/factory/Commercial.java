
package factory;

import thefactorypattern.ElectricityBillInterface;

/**
 *
 * @author Student
 */
public class Commercial implements ElectricityBillInterface {

    @Override
    public float generateElectricityBill(float i) {
       return (i * 7.50f);
    }
}
