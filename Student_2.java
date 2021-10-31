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
public class Student extends Person {
    static String freshman;
    static  String sophomre;
    static  String junior;

    public Student() {
    }

    public Student(String freshman, String sophomre, String junior, String name, String Address, String Phonenumber, String Email) {
        super(name, Address, Phonenumber, Email);
        this.freshman = freshman;
        this.sophomre = sophomre;
        this.junior = junior;
    }

    

    public String getFreshman() {
        return freshman;
    }

    public void setFreshman(String freshman) {
        this.freshman = freshman;
    }

    public String getSophomre() {
        return sophomre;
    }

    public void setSophomre(String sophomre) {
        this.sophomre = sophomre;
    }

    public String getJunior() {
        return junior;
    }

    public void setJunior(String junior) {
        this.junior = junior;
    }

    @Override
    public String toString() {
        return "Student{" + "freshman=" + freshman + ", sophomre=" + sophomre + ", junior=" + junior + '}';
    }
    
    
}
