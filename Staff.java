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
public class Staff  extends Employee{
    String title;

    public Staff() {
    }

    public Staff(String title, String office, double salary, String dataHired, String name, String Address, String Phonenumber, String Email) {
        super(office, salary, dataHired, name, Address, Phonenumber, Email);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" + "title=" + title + '}';
    }
    
}
