package com.infy.servco.ws;

public class Country {
    
    protected String countryID;
    protected String countryName;
    
    public Country() {
        super();
    }
    
    public Country(String countryID,String countryName) {
        super();
        this.countryID = countryID;
        this.countryName = countryName;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
