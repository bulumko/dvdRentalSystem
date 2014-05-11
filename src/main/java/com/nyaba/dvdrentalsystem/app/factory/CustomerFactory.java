/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyaba.dvdrentalsystem.app.factory;

import com.nyaba.dvdrentalsystem.domain.Address;
import com.nyaba.dvdrentalsystem.domain.Contact;
import com.nyaba.dvdrentalsystem.domain.Customer;


/**
 *
 * @author cnyaba
 */
public class CustomerFactory {

    public static class Builder {

        private String name;
        private String surname;
        private int IDNumber;
        private double cash;
        private Address address;
        private Contact contact;
        private String postAddress;
        private String physicalAddress;
        private String postalCode;
        private String phone;
        private String cell;
        private String email;
        private String fax;
        private String suburb;
        private String city;

        public Builder(int IDNumber) {
            this.IDNumber = IDNumber;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }
        public Builder cash(double cash) {
            this.cash = cash;
            return this;
        }
        public Builder Address(Address address) {
            this.address = address;
            return this;
        }

        public Builder Contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Customer builder() {
            return cust(this);
        }

        private Customer cust(Builder build) {
            address = ContactAndAddressFactory.getAddress(postAddress, city, suburb, physicalAddress, postalCode, name);
            contact = ContactAndAddressFactory.getContact(phone, email, fax);
            
            Customer customer = new Customer();
            
            customer.setName(build.name);
            customer.setSurname(build.surname);
            customer.setBalance((float) build.cash);
            customer.setCustomerID(build.IDNumber);
            customer.setAddress(build.address);
            customer.setContact(build.contact);
            

            return customer;
        }
    }
}
