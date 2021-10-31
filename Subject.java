/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement2;

/**
 *
 * @author USER
 */
public class Subject {
    private int subjectID;
    private String subjectName;
    private double subjectHours;

    public Subject() {
    }

    public Subject(int subjectID, String subjectName, double subjectHours) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.subjectHours = subjectHours;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getSubjectHours() {
        return subjectHours;
    }

    public void setSubjectHours(double subjectHours) {
        this.subjectHours = subjectHours;
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectID=" + subjectID + ", subjectName=" + subjectName + ", subjectHours=" + subjectHours + '}';
    }
    
    
    
}
