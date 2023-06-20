package com.expample.demo.dao;

import com.expample.demo.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EmployeeDao {

    public List<Employee> getAllEmployeeDeatils(){
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(121,"madu",20000.00,23));
        list.add(new Employee(122,"raju",15000.00,20));
        list.add(new Employee(125,"saran",29000.00,24));
        list.add(new Employee(123,"ganesh",40000.00,26));
        list.add(new Employee(124,"purandi",50000.00,27));
        return list;
    }

}
