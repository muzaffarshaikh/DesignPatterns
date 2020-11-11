package factory;

import thefactorypattern.ElectricityBillInterface;

/**
 *
 * @author Muzaffar
 */

public class Domestic implements ElectricityBillInterface {

    @Override
    public float generateElectricityBill(float i) {
        return (i * 3.50f);
    }
}
