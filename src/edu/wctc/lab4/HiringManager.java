package edu.wctc.lab4;

import java.util.ArrayList;
import java.util.List;

public class HiringManager {
    private List<Employee> employees;

    public HiringManager() {
        employees = new ArrayList<Employee>();
    }

    public void Hire(String firstName, String lastName, String ssn, String cudeID) {
        Employee e = new Employee(firstName, lastName, ssn);
        employees.add(e);
        e.doFirstTimeOrientation(cudeID);
    }

    public void printEmployees() {
        for (Employee e : employees) {
            e.printReport();
        }
    }
}
