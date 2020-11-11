package memento;

/**
 *
 * @author Muzaffar
 */
public class InsuranceCustomer {

    private String name;
    private int phone;
    private String email;

    InsuranceCustomer(String name, int phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Memento saveMemento(){
        return new Memento(this);
    }
    
    public void restoreMemento(Memento memento){
        name = memento.getName();
        phone = memento.getPhone();
        email = memento.getEmail();   
    }
    
}
