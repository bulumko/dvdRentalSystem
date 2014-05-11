/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyaba.test.repository;

import com.nyaba.dvdrentalsystem.app.config.ConnectionConfig;
import com.nyaba.dvdrentalsystem.app.factory.ContactAndAddressFactory;
import com.nyaba.dvdrentalsystem.app.factory.CustomerFactory;
import com.nyaba.dvdrentalsystem.domain.Address;
import com.nyaba.dvdrentalsystem.domain.Contact;
import com.nyaba.dvdrentalsystem.domain.Customer;
import com.nyaba.dvdrentalsystem.repository.CustomerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author cnyaba
 */
public class CustomerRepositoryTest {

    public static ApplicationContext ctx;
    private Long id;
    private CustomerRepository repo;

    public CustomerRepositoryTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void createCustomer() {
        repo = ctx.getBean(CustomerRepository.class);

        Address address = ContactAndAddressFactory.getAddress("25", "De Busy", "Mandalay", "Cape Town", "7785", "Western Cape");
        Contact contact = ContactAndAddressFactory.getContact("0213612154", "nyaba.bulumko@webmail.co.za", "0641154151");

        Customer customer = (Customer) new CustomerFactory.Builder(900322603).surname("nyaba")
                .name("Bulumko")
                .Address(address)
                .Contact(contact)
                .cash(2000)
                .builder();
        repo.save(customer);
        id = customer.getId();
        Assert.assertNotNull(customer);
    }

    @Test
    public void readCustomer() {
        repo = ctx.getBean(CustomerRepository.class);
        Customer person = repo.findOne(id);
        Assert.assertEquals(person.getName(), "Bulumko");
    }

  /*  @Test
    private void deleteCustomer() {
        repo = ctx.getBean(CustomerRepository.class);
        Customer person = repo.findOne(id);
        repo.delete(person);

        Customer deletedPerson = repo.findOne(id);

        Assert.assertNull(deletedPerson);


    }*/

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}