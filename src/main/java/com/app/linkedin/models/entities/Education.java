package com.app.linkedin.models.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Education {
    private String schoolName;
    private String degree;
    private String major;
    private Date yearOfPassing;
    private double percentageObtained;
}
