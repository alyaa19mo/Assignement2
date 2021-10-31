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
public class Employee extends Person {
    String office;
    double salary;
    String dataHired;

    public Employee() {
    }

    public Employee(String office, double salary, String dataHired, String name, String Address, String Phonenumber, String Email) {
        super(name, Address, Phonenumber, Email);
        this.office = office;
        this.salary = salary;
        this.dataHired = dataHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "office=" + office + ", salary=" + salary + ", dataHired=" + dataHired + '}';
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDataHired() {
        return dataHired;
    }

    public void setDataHired(String dataHired) {
        this.dataHired = dataHired;
    }
    
    
}
