/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.dvdrentalsystem.services.impl;

import com.nyaba.dvdrentalsystem.domain.Customer;
import com.nyaba.dvdrentalsystem.repository.CustomerRepository;
import com.nyaba.dvdrentalsystem.services.TotalCustomers;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author 210119667
 */
public class TotalCustomersImp implements TotalCustomers{
    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList();
        
        List <Customer> allCustomers = customerRepository.findAll();
       
        return allCustomers;
    }
    
}
