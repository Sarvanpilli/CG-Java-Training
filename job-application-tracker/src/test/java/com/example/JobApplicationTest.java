
package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobApplicationTest {

    @Test
    public void testConstructor() {

        JobApplication job =
                new JobApplication("Amazon", "Developer", "Applied");

        assertNotNull(job);
        assertEquals("Amazon", job.getCompany());
        assertEquals("Developer", job.getRole());
        assertEquals("Applied", job.getStatus());
    }

    @Test
    public void testUpdateStatus() {

        JobApplication job =
                new JobApplication("Amazon", "Developer", "Applied");

        job.updateStatus("Selected");

        assertEquals("Selected", job.getStatus());
    }


}
