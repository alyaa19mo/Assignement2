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
public class Student 
{
    private String studentName;
    private int studentID;
    private double studentGPA;

    public Student() 
    {
    }

    public Student(String studentName, int studentID, double studentGPA) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentGPA = studentGPA;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }

    @Override
    public String toString() {
        return "Student{" + "studentName=" + studentName + ", studentID=" + studentID + ", studentGPA=" + studentGPA + '}';
    }
    
    
}
