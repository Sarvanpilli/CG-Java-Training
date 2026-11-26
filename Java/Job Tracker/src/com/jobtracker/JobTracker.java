package com.jobtracker;

import java.util.ArrayList;
import java.util.Scanner;

public class JobTracker {
    private ArrayList<JobApplication> jobs;

    public JobTracker() {
        jobs = new ArrayList<>();
    }


    private int nextId = 1;
    public void addJob(Scanner sc) {
        System.out.print("Enter Company Name: ");
        String company = sc.nextLine();
        System.out.print("Enter Position: ");
        String position = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter Status: ");
        String status = sc.nextLine();
        System.out.print("Enter Applied Date (YYYY-MM-DD): ");
        String appliedDate = sc.nextLine();
        System.out.print("Enter Location: ");
        String location = sc.nextLine();
        JobApplication newJob = new JobApplication(nextId, company, position, salary, status, appliedDate, location);
        jobs.add(newJob);
        nextId++; // Increment the ID for the next job
        System.out.println("Job application added successfully!");
    }
    public void viewJobs() {
        for (JobApplication job : jobs) {
            job.displayInfo();
            System.out.println("---------------------------");
        }
    }

    public void searchcompany(Scanner sc){
        System.out.println("Enter the company name to search for: ");
        String searchcompany = sc.nextLine();
        boolean found = false;
        for(JobApplication job : jobs){
            if(searchcompany.equals(job.getCompany())){
                job.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No jobs found for company: " + searchcompany);
        }

    }

}
