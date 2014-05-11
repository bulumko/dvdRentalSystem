/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyaba.dvdrentalsystem.services;

import java.util.List;
import org.hibernate.Transaction;

/**
 *
 * @author cnyaba
 */
public interface DisplaySales {
    public List<Transaction> getAllSales();
}
