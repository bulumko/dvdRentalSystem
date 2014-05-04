/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyaba.dvdrentalsystem.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author cnyaba
 */
@Entity
public class Title implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int ID;
    private String genre;
    private boolean availabe;
    private String description;
    private float price;

    public float getPrice() {
        return (float) 39.00;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return "Bulumko";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getGenre() {
        return "Comedy";
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvailabe() {
        return true;
    }

    public void setAvailabe(boolean availabe) {
        this.availabe = availabe;
    }

    public String getDescription() {
        return "Conan";
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Title)) {
            return false;
        }
        Title other = (Title) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nyaba.dvd.domain.Title[ id=" + id + " ]";
    }
    
}
