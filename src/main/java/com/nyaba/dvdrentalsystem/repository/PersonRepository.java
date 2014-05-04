/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.dvdrentalsystem.repository;

import com.nyaba.dvdrentalsystem.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hashcode
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
