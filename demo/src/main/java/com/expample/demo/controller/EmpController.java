package com.expample.demo.controller;

import com.expample.demo.pojo.Employee;
import com.expample.demo.service.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmployeeInterface empInterface;
    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getEmployees(){
       return new ResponseEntity<>(empInterface.getAllEmploees(), HttpStatus.OK) ;
    }
    @GetMapping("highest")
    public ResponseEntity<Employee> getHighestSalary(){
        return new ResponseEntity<>(empInterface.getHighestSalary(),HttpStatus.OK);
    }
}
