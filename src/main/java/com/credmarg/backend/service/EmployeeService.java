package com.credmarg.backend.service;

import com.credmarg.backend.dto.EmployeeDTO;
import com.credmarg.backend.model.Employee;
import com.credmarg.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setDesignation(employeeDTO.getDesignation());
        employee.setCtc(employeeDTO.getCtc());
        employee.setEmail(employeeDTO.getEmail());
        return employeeRepository.save(employee);
    }

    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}

