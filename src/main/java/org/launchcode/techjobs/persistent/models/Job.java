package org.launchcode.techjobs.persistent.models;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManyToMany
//    @JoinTable(
//            name = "job_skills", // Join table name
//            joinColumns = @JoinColumn(name = "jobs_id"), // Foreign key column for Job
//            inverseJoinColumns = @JoinColumn(name = "skills_id") // Foreign key column for Skill
//    )
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

}
