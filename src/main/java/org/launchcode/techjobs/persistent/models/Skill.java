package org.launchcode.techjobs.persistent.models;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description info is required")
    @Size(min=3, max=100, message = "Description must be between 3 and 100 characters")
    private String description;

    @ManyToMany(mappedBy="skills") //skills field in Job entity will be the owner of relationship
    private List<Job> jobs = new ArrayList<>();

    public Skill() {
    }

    //getter and setters
    public @NotBlank(message = "Description info is required") @Size(min = 3, max = 100, message = "Description must be between 3 and 100 characters") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "Description info is required") @Size(min = 3, max = 100, message = "Description must be between 3 and 100 characters") String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
