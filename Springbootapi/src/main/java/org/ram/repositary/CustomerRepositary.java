package org.ram.repositary;

import org.ram.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositary  extends JpaRepository<Customer, Integer>{

}
