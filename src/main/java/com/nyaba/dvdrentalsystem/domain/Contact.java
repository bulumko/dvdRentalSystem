/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyaba.dvdrentalsystem.domain;

import javax.persistence.Embeddable;

/**
 *
 * @author cnyaba
 */
@Embeddable
public class Contact {
    private String phoneNo;
    private String Fax;
    private String email;

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
