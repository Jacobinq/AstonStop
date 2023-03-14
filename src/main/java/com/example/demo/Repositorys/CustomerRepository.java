
package com.example.demo.Repositorys;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Models.Customer;
import com.example.demo.Models.User.*;;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}



