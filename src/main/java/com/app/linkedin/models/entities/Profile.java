package com.app.linkedin.models.entities;


import lombok.Data;

import java.util.List;

@Data
public class Profile {
    private List<Experience> experiences;
    private List<Education> educations;
    private List<Skill> skills;
    private List<Accomplishment> accomplishments;
    private List<Recommendation> recommendationsReceived;
    private List<Recommendation> recommendationsGiven;
}
