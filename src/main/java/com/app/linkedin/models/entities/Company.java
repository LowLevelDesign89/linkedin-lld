package com.app.linkedin.models.entities;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Company extends BaseModel {
    private String companyName;
    private String description;
    private String companyLogo; //blob image link
    private Date establishedAt;
    private List<JobPosting> jobPostings;
}
