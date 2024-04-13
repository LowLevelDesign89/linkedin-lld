package com.app.linkedin.models.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Experience {
    private Company company;
    private String jobTitle;
    private Date startDate;
    private Date endDate;
    private String description;
}
