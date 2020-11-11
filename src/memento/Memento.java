/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Muzaffar
 */
public class Memento {
    
    private String name;
    private int phone;
    private String email;

    Memento(InsuranceCustomer ic){
        name = ic.getName();
        phone = ic.getPhone();
        email = ic.getEmail();
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    
}
