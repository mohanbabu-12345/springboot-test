package com.expample.demo.controller;

import com.expample.demo.pojo.Employee;
import com.expample.demo.service.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class EmpController {
    @Autowired
    private EmployeeInterface empInterface;
    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getEmployees(){
       return new ResponseEntity<>(empInterface.getAllEmploees(), HttpStatus.OK) ;
    }
    @GetMapping("highest")
    public ResponseEntity<Optional<Employee>> getHighestSalary(){
        return new ResponseEntity<>(empInterface.getHighestSalary(),HttpStatus.OK);
    }
    @GetMapping("min")
    public ResponseEntity<Optional<Employee>> getMinSalary(){
        return new ResponseEntity<>(empInterface.geyMinSalary(),HttpStatus.OK);
    }
    @GetMapping("avg")
    public ResponseEntity<Double> getAvgSalary(){
        return new ResponseEntity<>(empInterface.getAvgSalary(),HttpStatus.OK);
    }
    @GetMapping("countbygender")
    public ResponseEntity<Map<String, Long>> getCountByGender(){
        return new ResponseEntity<>(empInterface.countEmploiesBasedOnGender(),HttpStatus.OK);
    }
    @GetMapping("departmentname")
    public ResponseEntity<List<String>> printAllDepartmentNames(){
        return new ResponseEntity<>(empInterface.printAllDepartmentNames(),HttpStatus.OK);
    }
    @GetMapping("avgageofmaleandfemale")
    public ResponseEntity<Map<String,Double>> printAverageAgeOfMaleAndFemale(){
        return new ResponseEntity<>(empInterface.printAverageAgeOfMaleAndFemale(),HttpStatus.OK);
    }
}
