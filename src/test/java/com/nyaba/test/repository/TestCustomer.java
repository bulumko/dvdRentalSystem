package com.nyaba.test.repository;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.nyaba.dvdrentalsystem.app.config.ConnectionConfig;
import com.nyaba.dvdrentalsystem.domain.Customer;
import com.nyaba.dvdrentalsystem.repository.CustomerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author cnyaba
 */
public class TestCustomer {

    public static ApplicationContext ctx;
    private Long id;
    private CustomerRepository repo;

    public TestCustomer() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void hello() {
        repo = ctx.getBean(CustomerRepository.class);
        Customer cust = new Customer();
        cust.setName("Hello");
        repo.save(cust);
        id = cust.getId();
        Assert.notNull(cust);
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