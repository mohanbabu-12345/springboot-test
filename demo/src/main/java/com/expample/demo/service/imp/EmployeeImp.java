package com.expample.demo.service.imp;

import com.expample.demo.dao.EmployeeDao;
import com.expample.demo.pojo.Employee;
import com.expample.demo.service.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeImp implements EmployeeInterface {
    @Autowired
    private EmployeeDao dao;
    @Override
    public List<Employee> getAllEmploees() {
        List<Employee> list=dao.getAllEmployeeDeatils().stream()
                .sorted((a,b)->a.getId()-b.getId())
                .collect(Collectors.toList());
        return list;
    }

    @Override
    public  Optional<Employee> getHighestSalary() {
        Optional<Employee> e= dao.getAllEmployeeDeatils().stream()
                .collect(Collectors.maxBy(Comparator.comparing(s->s.getSalary())));
        return e;
    }

    @Override
    public  Optional<Employee> geyMinSalary() {
        Optional<Employee> collect = dao.getAllEmployeeDeatils().stream()
                .collect(Collectors.minBy(Comparator.comparing(e -> e.getSalary())));


        return collect;
    }

    @Override
    public Double getAvgSalary() {
       Double emp= dao.getAllEmployeeDeatils().stream()
                               .collect(Collectors.averagingDouble(e->e.getSalary()));
        return emp;
    }

    @Override
    public List<Employee> sortByName() {
        return dao.getAllEmployeeDeatils().stream()
                .sorted((a,b)->a.getName().compareTo(b.getName()))
                .collect(Collectors.toList());
    }
     public Map<Integer,List<Employee>> groupingTheData(){
       Map<Integer,List<Employee>> emp = dao.getAllEmployeeDeatils().stream()
                .collect(Collectors.groupingBy(e->e.getId()));
          return emp;
     }
      public  Map<String, Long> countEmploiesBasedOnGender(){
          Map<String, Long> genderCount = dao.getAllEmployeeDeatils().stream()
                  .collect(Collectors.groupingBy(Employee::getGender,
                          Collectors.counting()));
          return genderCount;
      }
      public List<String> printAllDepartmentNames(){
       List<String> s= dao.getAllEmployeeDeatils().stream()
                .map(d->d.getDepartment())
                .distinct()
                .collect(Collectors.toList());
        return s;
      }

      public Map<String,Double> printAverageAgeOfMaleAndFemale(){
        Map<String,Double> map=dao.getAllEmployeeDeatils().stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        return map;
      }
}
