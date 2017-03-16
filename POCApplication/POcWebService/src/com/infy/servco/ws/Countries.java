package com.infy.servco.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class Countries {
    
    List<Country> countries= new ArrayList<Country>();
    
    public Countries() {
        super();
        countries.add(new Country("IT","ITALY"));
        countries.add(new Country("IN","INDIA"));
        countries.add(new Country("AU","AUSTRALIA"));
    }

    

    public List<Country> getCountris() {
        return countries;
    }
    
    public boolean addCountry(String countryID,String countryName) {
        return countries.add(new Country(countryID,countryName));
    }
    
    
}
