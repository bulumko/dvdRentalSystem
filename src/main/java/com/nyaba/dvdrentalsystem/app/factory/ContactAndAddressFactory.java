/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyaba.dvdrentalsystem.app.factory;

import com.nyaba.dvdrentalsystem.domain.Address;
import com.nyaba.dvdrentalsystem.domain.Contact;

/**
 *
 * @author cnyaba
 */
public class ContactAndAddressFactory {
    public static Address getAddress(String postalAddress,String city, String suburb, String physicalAddress, String postalCode, String province){
        Address address = new Address();
        address.setStreetName(physicalAddress);
        address.setPostalCode(postalAddress);
        address.setStreetNo(postalCode);
        address.setSurbub(suburb);
        address.setCity(city);
        address.setProvince(province);
        
        return address;
    }
    public static Contact getContact(String phone, String email, String fax){
        Contact contact = new Contact();
        contact.setFax(phone);
        contact.setEmail(email);
        contact.setFax( fax);
        return contact;
    }
    
}
