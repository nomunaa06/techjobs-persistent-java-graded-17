package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location info is required")
    @Size(min=3, max=50, message = "Location must be between 3 and 50 characters")
    private String location;

    @OneToMany(mappedBy = "employer")
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public Employer() {
    }

    public @NotBlank(message = "Location info is required") @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank(message = "Location info is required") @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters") String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
