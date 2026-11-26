package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        JobTracker tracker = new JobTracker();
        int choice = 0;
        while(choice != 6){
            System.out.println("Job Application Tracker");
            System.out.println("1. Add Job Application");
            System.out.println("2. Display All Applications");
            System.out.println("3. Search Applications by Company");
            System.out.println("4. Update Application Status");
            System.out.println("5. Delete Application");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // Consume the invalid input
                continue;
            }


            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter company name: ");
                    String company = sc.nextLine();
                    System.out.print("Enter role: ");
                    String role = sc.nextLine();
                    System.out.print("Enter status: ");
                    String status = sc.nextLine();
                    JobApplication job = new JobApplication(company, role, status);
                    tracker.addApplication(job);
                    break;
                case 2:
                    tracker.displayApplications();
                    break;
                case 3:
                    System.out.print("Enter company name to search: ");
                    String searchCompany = sc.nextLine();
                    tracker.searchApplications(searchCompany);
                    break;
                case 4:
                    System.out.print("Enter company name to update status: ");
                    String updateCompany = sc.nextLine();
                    System.out.print("Enter new status: ");
                    String newStatus = sc.nextLine();
                    tracker.updateApplicationStatus(updateCompany, newStatus);
                    break;
                case 5:
                    System.out.print("Enter company name to delete application: ");
                    String deleteCompany = sc.nextLine();
                    tracker.deleteApplication(deleteCompany);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            //tracker.addApplication(job);
            tracker.saveApplication("applications.txt");
            tracker.loadApplications("applications.txt");

        }
//        JobTracker tracker = new JobTracker();
//
//        JobApplication job1 =
//                new JobApplication("Colruyt Group", "Software Developer", "Applied");
//
//        JobApplication job2 =
//                new JobApplication("Microsoft", "Software Engineer", "Interview");
//
//        tracker.addApplication(job1);
//        tracker.addApplication(job2);
//
//        tracker.displayApplications();
//        tracker.searchApplications("Microsoft");
//        tracker.searchApplications("Google");
//        tracker.updateApplicationStatus("Microsoft", "Offer");
//        tracker.deleteApplication("Microsoft");
    }
}