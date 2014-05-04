/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyaba.dvdrentalsystem.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author cnyaba
 */
@Embeddable
public class Address implements Serializable {
    private String postalCode;
    private String streetNo;
    private String streetName;
    private String city;
    private String province;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    
}
