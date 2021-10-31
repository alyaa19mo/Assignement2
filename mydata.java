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
public class mydata {
    String Year;
    String mounth;
    String day;

    public mydata() {
    }

    public mydata(String Year, String mounth, String day) {
        this.Year = Year;
        this.mounth = mounth;
        this.day = day;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getMounth() {
        return mounth;
    }

    

    public void setMounth(String mounth) {
        this.mounth = mounth;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    @Override
    public String toString() {
        return "mydata{" + "Year=" + Year + ", mounth=" + mounth + ", day=" + day + '}';
    }
    
}
