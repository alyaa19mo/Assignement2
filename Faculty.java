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
public class Faculty extends Employee{
    double officeHoures;
    String rank;

    public Faculty() {
    }

    public Faculty(double officeHoures, String rank, String office, double salary, String dataHired, String name, String Address, String Phonenumber, String Email) {
        super(office, salary, dataHired, name, Address, Phonenumber, Email);
        this.officeHoures = officeHoures;
        this.rank = rank;
    }

    public double getOfficeHoures() {
        return officeHoures;
    }

    public void setOfficeHoures(double officeHoures) {
        this.officeHoures = officeHoures;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" + "officeHoures=" + officeHoures + ", rank=" + rank + '}';
    }
    
    
}
