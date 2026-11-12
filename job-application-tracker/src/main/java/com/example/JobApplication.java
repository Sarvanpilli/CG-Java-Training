
package com.example;

public class JobApplication {
    private final String company;
    private final String role;
    private String status;

    public JobApplication(String company, String role, String status) {
        this.company = company;
        this.role = role;
        this.status = status;
    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String status) {
        this.status = status;
    }
}
