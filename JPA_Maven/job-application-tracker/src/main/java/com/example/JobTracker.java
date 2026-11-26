package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class JobTracker {
    private ArrayList<JobApplication> jobs = new ArrayList<>();
    private FileWriter writer;

    public void addApplication(JobApplication job) {
        jobs.add(job);
    }

    public void displayApplications() {

        for (JobApplication job : jobs) {

            System.out.println("Company: " + job.getCompany());
            System.out.println("Role: " + job.getRole());
            System.out.println("Status: " + job.getStatus());

            System.out.println("------------------");
        }
    }

    public void searchApplications(String company) {
        boolean found = false;
        for (JobApplication job : jobs) {
            if (job.getCompany().equalsIgnoreCase(company)) {
                found = true;
                System.out.println("Company: " + job.getCompany());
                System.out.println("Role: " + job.getRole());
                System.out.println("Status: " + job.getStatus());
                System.out.println("------------------");
            }
        }
        if (!found) {
            System.out.println("No applications found for company: " + company);
        }
    }
    public void updateApplicationStatus(String company, String newStatus) {
        boolean found = false;
        for (JobApplication job : jobs) {
            if (job.getCompany().equalsIgnoreCase(company)) {
                found = true;
                job.updateStatus(newStatus);
                System.out.println("Updated status for " + company + " to " + newStatus);
                break;
            }
        }
        if (!found) {
            System.out.println("No applications found for company: " + company);
        }
    }
    public void deleteApplication(String company){
        boolean found = false;
        Iterator<JobApplication> iterator = jobs.iterator();
        while (iterator.hasNext()) {
            JobApplication job = iterator.next();
            if (job.getCompany().equalsIgnoreCase(company)) {
                found = true;
                iterator.remove();
                System.out.println("Deleted application for company: " + company);
                break;
            }
        }
        if (!found) {
            System.out.println("No applications found for company: " + company);
        }
    }

    public void saveApplication(String filename) {
        try {
            writer = new FileWriter(filename);
            for (JobApplication job : jobs) {
                writer.write(job.getCompany() + "," + job.getRole() + "," + job.getStatus() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error occurred while saving applications.");
        }
    }
    public int getApplicationCount() {
        return jobs.size();
    }
    public void loadApplications(String filename) {
        try {
            java.io.File file = new java.io.File(filename);
            if (!file.exists()) {
                return; // No applications to load
            }
            java.util.Scanner scanner = new java.util.Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    JobApplication job = new JobApplication(parts[0], parts[1], parts[2]);
                    jobs.add(job);
                }
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error occurred while loading applications.");
        }
    }
    public JobApplication findApplicationByCompany(String company) {
        for (JobApplication job : jobs) {
            if (job.getCompany().equalsIgnoreCase(company)) {
                return job;
            }
        }

        return null;
    }
}