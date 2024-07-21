package com.credmarg.backend.controller;


import com.credmarg.backend.dto.EmployeeDTO;
import com.credmarg.backend.model.Employee;
import com.credmarg.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.saveEmployee(employeeDTO);
    }

    @GetMapping
    public Iterable<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}

