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
public class Address {
    private double streetNO;
    private String city;
    private String country;

    public Address() {
    }

    public Address(double streetNO, String city, String country) {
        this.streetNO = streetNO;
        this.city = city;
        this.country = country;
    }

    public double getStreetNO() {
        return streetNO;
    }

    public void setStreetNO(double streetNO) {
        this.streetNO = streetNO;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" + "streetNO=" + streetNO + ", city=" + city + ", country=" + country + '}';
    }
    
    
}

