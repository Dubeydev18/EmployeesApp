package com.credmarg.backend.repository;



import com.credmarg.backend.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    Employee findByEmail(String email);
}

