package com.jobtracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        JobTracker tracker = new JobTracker();

        Scanner sc = new Scanner(System.in);


        boolean running = true;

        while (running) {
            System.out.println("=========================");
            System.out.println("       JOB TRACKER");
            System.out.println("=========================");
            System.out.println("1. Add Job");
            System.out.println("2. View Jobs");
            System.out.println("3. Search by Company");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    tracker.addJob(sc);

                    break;
                case 2:
                    tracker.viewJobs();
                    break;
                case 3:
                    tracker.searchcompany(sc);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting Job Tracker. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}