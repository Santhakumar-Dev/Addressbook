package main;

import java.util.HashMap;
import java.util.Set;

public class AddressBookService {

    private HashMap<String, AddressBookEntry> contacts = new HashMap<>();

    public void addContact(String surName, String givenName, String address){

        AddressBookEntry entry;

        String name = new StringBuilder().append(givenName)
                                        .append(surName)
                                        .toString();

        //Check for already existing contact
        if(contacts.get(name) == null){

            entry = new AddressBookEntry(surName, givenName, address);
            contacts.put(name, entry);

        }
        else{

            contacts.get(name).getAddresses().add(address);
        }
    }

    public String getAddresses(String surName, String givenName){

        AddressBookEntry entry;
        String addressList = null;


        // check for valid surname and givenname
        if(!"".equals(surName) && surName != null && !"".equals(givenName) && givenName != null){

            String name = new StringBuilder().append(givenName)
                    .append(surName)
                    .toString();

            entry = contacts.get(name);

            if(entry != null){

                Set<String> addresses = entry.getAddresses();


                if(addresses != null){

                    for(String address : addresses) {

                        if(addressList == null){

                            addressList = new String(address);
                        }
                        else {
                            addressList = new StringBuilder(addressList)
                                    .append(", ")
                                    .append(address)
                                    .toString();
                        }
                    }

                    System.out.println(addressList);
                }
            }

        }
        else{

            System.out.println("Invalid Surname and Givenname");
        }

        return addressList;
    }
}
