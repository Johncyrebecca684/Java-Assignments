package com.johncy.assignment.utilities;

import com.johncy.assignments.employees.*;

public class EmployeeUtilities {

    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }
}
