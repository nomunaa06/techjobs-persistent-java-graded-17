package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description info is required")
    @Size(min=3, max=100, message = "Description must be between 3 and 100 characters")
    private String description;

    public Skill() {
    }

    public @NotBlank(message = "Description info is required") @Size(min = 3, max = 100, message = "Description must be between 3 and 100 characters") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "Description info is required") @Size(min = 3, max = 100, message = "Description must be between 3 and 100 characters") String description) {
        this.description = description;
    }
}
