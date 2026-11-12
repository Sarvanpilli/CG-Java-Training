package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class JobTrackerTest {
    @Test
    public void testAddApplication(){
        JobApplication job = new JobApplication("Amazon", "Developer", "Applied");
        JobTracker tracker = new JobTracker();
        tracker.addApplication(job);
        Assertions.assertEquals(1, tracker.getApplicationCount());
    }
    @Test
    public void testAddMultipleApplications() {

        JobApplication job1 =
                new JobApplication("Amazon", "Developer", "Applied");

        JobApplication job2 =
                new JobApplication("Microsoft", "Java Developer", "Selected");
        JobTracker tracker = new JobTracker();

        tracker.addApplication(job1);
        tracker.addApplication(job2);

        Assertions.assertEquals(2, tracker.getApplicationCount());
    }
    @Test
    public void testUpdateApplicationStatus() {

        JobApplication job =
                new JobApplication("Amazon", "Developer", "Applied");
        JobTracker tracker = new JobTracker();
        tracker.addApplication(job);

        tracker.updateApplicationStatus("Amazon", "Selected");

        JobApplication updatedJob =
                tracker.findApplicationByCompany("Amazon");

        assertNotNull(updatedJob);
        assertEquals("Selected", updatedJob.getStatus());
    }
    @Test
    public void testDeleteApplication() {

        JobApplication job1 =
                new JobApplication("Amazon", "Developer", "Applied");

        JobApplication job2 =
                new JobApplication("Microsoft", "Java Developer", "Selected");
        JobTracker tracker = new JobTracker();

        tracker.addApplication(job1);
        tracker.addApplication(job2);

        tracker.deleteApplication("Amazon");

        assertEquals(1, tracker.getApplicationCount());
        assertNull(tracker.findApplicationByCompany("Amazon"));
        assertNotNull(tracker.findApplicationByCompany("Microsoft"));
    }
}