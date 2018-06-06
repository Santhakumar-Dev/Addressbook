package main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class AddressBookEntry {

    private String givenName;

    private String surName;

    private Set<String> addresses;


    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public AddressBookEntry(String surName, String givenName, String address){

        this.surName = surName;
        this.givenName = givenName;

        Set<String> addresses = new HashSet();

        addresses.add(address);
        
        this.addresses = addresses;
    }
}
