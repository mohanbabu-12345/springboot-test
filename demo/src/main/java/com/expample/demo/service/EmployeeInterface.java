package com.expample.demo.service;

import com.expample.demo.pojo.Employee;

import java.util.List;

public interface EmployeeInterface {
    public List<Employee> getAllEmploees();
    public Employee getHighestSalary();
    public List<Employee> sortByName();

}
