/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyaba.dvdrentalsystem.domain;

/**
 *
 * @author cnyaba
 */
public class Person {
    private String name;
    private String surname;
    private String Identity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentity() {
        return Identity;
    }

    public void setIdentity(String Identity) {
        this.Identity = Identity;
    }
    
}
