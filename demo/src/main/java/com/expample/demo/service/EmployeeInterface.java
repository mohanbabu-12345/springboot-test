package com.expample.demo.service;

import com.expample.demo.pojo.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface EmployeeInterface {
    public List<Employee> getAllEmploees();
    public Optional<Employee> getHighestSalary();
    public  Optional<Employee> geyMinSalary();
    public Double getAvgSalary();
    public List<Employee> sortByName();
    public Map<Integer,List<Employee>> groupingTheData();
    public Map<String, Long> countEmploiesBasedOnGender();
    public List<String> printAllDepartmentNames();
    public Map<String,Double> printAverageAgeOfMaleAndFemale();

}
