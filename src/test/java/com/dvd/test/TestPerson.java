/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dvd.test;

import com.nyaba.dvdrentalsystem.app.config.ConnectionConfig;
import com.nyaba.dvdrentalsystem.domain.Customer;
import com.nyaba.dvdrentalsystem.repository.CustomerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author 210119667
 */
public class TestPerson {
    public static ApplicationContext ctx;
    private Long id;

    private CustomerRepository repo;
    
    public TestPerson() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
     public void hello() {
         repo = ctx.getBean(CustomerRepository.class);
         Customer cust = new Customer();
         cust.setName("Hello");
         repo.save(cust);
         Customer newPerson = repo.findOne(id);
         
         Assert.assertEquals(newPerson.getName(), "Hello");
     
     }
    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
         ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
