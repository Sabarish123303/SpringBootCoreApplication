package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicationController {
    @GetMapping
    public String sayHello()
    {
        return "WELCOME TO FINTECH CSI PUNE";
    }
    @GetMapping("/services")
    public String services()
    {
        return "WELCOME TO CREDIT SYSTEMS INDIA";
    }
    @GetMapping("/address")
    public String address()
    {
        return "India";
    }
    @GetMapping("/showdata")
    public List<Employee> showData()
    {
        List<Employee> empList = new LinkedList<>();
        empList.add(new Employee(121,"RADHA"));
        empList.add(new Employee(122,"RANI"));
        empList.add(new Employee(124,"SWATI"));
        empList.add(new Employee(125,"SWADESHI"));

        return empList;
    }

}
class Employee
{
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public Employee(int empId) {
        this.empId = empId;
    }

    public Employee(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}