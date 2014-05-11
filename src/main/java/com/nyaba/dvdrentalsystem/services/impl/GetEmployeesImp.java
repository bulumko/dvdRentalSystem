/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyaba.dvdrentalsystem.services.impl;

import com.nyaba.dvdrentalsystem.domain.Employee;
import com.nyaba.dvdrentalsystem.repository.EmployeeRepository;
import com.nyaba.dvdrentalsystem.services.GetEmployees;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cnyaba
 */
@Service
public class GetEmployeesImp implements GetEmployees{

    @Autowired
    private EmployeeRepository personRepository;

    public List<Employee> getEmployees() {
        return personRepository.findAll();
    }
}
