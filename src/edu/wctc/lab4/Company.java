package edu.wctc.lab4;

public class Company {
    HiringManager hr;

    public Company() {
        hr = new HiringManager();
    }

    public void hireEmployee(String firstName, String lastName, String ssn, String cubeID) {
        hr.Hire(firstName, lastName, ssn, cubeID);
    }

    public void printEmployees() {
        hr.printEmployees();
    }

}
