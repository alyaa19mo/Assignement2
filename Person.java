/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement_2;

/**
 *
 * @author USER
 */
public class Person {
    String name;
    String Address;
    String Phonenumber;
    String Email;

    public Person() {
    }

    public Person(String name, String Address, String Phonenumber, String Email) {
        this.name = name;
        this.Address = Address;
        this.Phonenumber = Phonenumber;
        this.Email = Email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String Phonenumber) {
        this.Phonenumber = Phonenumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", Address=" + Address + ", Phonenumber=" + Phonenumber + ", Email=" + Email + '}';
    }
    
    
}
