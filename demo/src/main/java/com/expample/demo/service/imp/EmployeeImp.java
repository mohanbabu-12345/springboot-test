package com.expample.demo.service.imp;

import com.expample.demo.dao.EmployeeDao;
import com.expample.demo.pojo.Employee;
import com.expample.demo.service.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public Employee getHighestSalary() {
       Employee e= dao.getAllEmployeeDeatils().stream()
                .sorted((a,b)-> (int) (b.getSalary()-a.getSalary()))
                .collect(Collectors.toList())
                .get(0);
        return e;
    }
}
