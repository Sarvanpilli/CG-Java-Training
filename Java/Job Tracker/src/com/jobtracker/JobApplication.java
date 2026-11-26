package com.jobtracker;

public class JobApplication {
    private int id ;
    private String company;
    private String position;
    private double salary;
    private String status;
    private String appliedDate;
    private String location;

    public JobApplication(int id, String company, String position, double salary, String status, String appliedDate, String location) {
        this.id = id;
        this.company = company;
        this.position = position;
        this.salary = salary;
        this.status = status;
        this.appliedDate = appliedDate;
        this.location = location;
    }

    public int getId() {
        return id;
    }
    public String getCompany() {
        return company;
    }
    public String getPosition() {
        return position;
    }
    public double getSalary() {
        return salary;
    }
    public String getStatus() {
        return status;
    }
    public String getAppliedDate() {
        return appliedDate;
    }
    public String getLocation() {
        return location;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setAppliedDate(String appliedDate) {
        this.appliedDate = appliedDate;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public void displayInfo(){
        System.out.println("Job Application ID: " + id);
        System.out.println("Company: " + company);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
        System.out.println("Status: " + status);
        System.out.println("Applied Date: " + appliedDate);
        System.out.println("Location: " + location);

    }
}
