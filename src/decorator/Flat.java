package decorator;

/**
 *
 * @author Muzaffar
 */
public class Flat extends ConstructionProject {

    private String flatid;
    private int flatNo;
    private int noOfBedrooms;
    private boolean BalconyPresent;

    public String getFlatid() {
        return flatid;
    }

    public void setFlatid(String flatid) {
        this.flatid = flatid;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public int getNoOfBedrooms() {
        return noOfBedrooms;
    }

    public void setNoOfBedrooms(int noOfBedrooms) {
        this.noOfBedrooms = noOfBedrooms;
    }

    public boolean isBalconyPresent() {
        return BalconyPresent;
    }

    public void setBalconyPresent(boolean BalconyPresent) {
        this.BalconyPresent = BalconyPresent;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void display() {
        System.out.println("Flat ID : " + flatid);
        System.out.println("Flat No : " + flatNo);
        System.out.println("Number of Bedrooms : " + noOfBedrooms);
        System.out.println("Balcony : " + BalconyPresent);
        System.out.println("Owner Name : " + owner);
    }

}
