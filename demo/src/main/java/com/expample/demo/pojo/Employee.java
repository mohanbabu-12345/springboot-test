package com.expample.demo.pojo;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    private Integer age;
     private String gender;
     private String department;
     private Integer dateOfJoining;


    public Employee(Integer id, String name, Double salary, Integer age, String gender, String department, Integer dateOfJoining) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.dateOfJoining = dateOfJoining;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Integer dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                '}';
    }
}
