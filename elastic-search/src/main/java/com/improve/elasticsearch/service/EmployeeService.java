package com.improve.elasticsearch.service;


import com.improve.elasticsearch.model.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> getAllEmployees();

    Employee updateEmployee(Long id, Employee employee);

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

}