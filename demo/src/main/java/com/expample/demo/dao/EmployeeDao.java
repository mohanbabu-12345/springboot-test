package com.expample.demo.dao;

import com.expample.demo.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EmployeeDao {

    public List<Employee> getAllEmployeeDeatils(){
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(121,"madu",20000.00,23,"Male","Infrasturature",2022));
        list.add(new Employee(128,"kavya",60000.00,25,"Female","Development",2021));
        list.add(new Employee(122,"raju",15000.00,20,"Male","Development",2019));
        list.add(new Employee(125,"saran",29000.00,24,"Male","HR",2020));
        list.add(new Employee(129,"madhuri",40000.00,27,"Female","Infrasturature",2015));
        list.add(new Employee(123,"ganesh",40000.00,26,"Male","Development",2012));
        list.add(new Employee(126,"banu",50000.00,25,"Female","Sales",2018));
        list.add(new Employee(127,"hima",80000.00,27,"Female","Development",2014));
        list.add(new Employee(124,"purandi",50000.00,27,"Male","Sales",2020));

        return list;
    }

}
