/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.dvdrentalsystem.presentation;

import com.nyaba.dvdrentalsystem.domain.Customer;
import com.nyaba.dvdrentalsystem.services.CustomerService;
import com.nyaba.dvdrentalsystem.services.TotalCustomers;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author 210119667
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping(value = "customer")
    @ResponseBody
    public Customer getCustomers(){
        
        Customer customer = null;
        List<Customer> customers = customerService.findAll();
        return null;
        
    }
    
}
