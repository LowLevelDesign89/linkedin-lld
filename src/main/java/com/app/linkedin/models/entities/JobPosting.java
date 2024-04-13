package com.app.linkedin.models.entities;

import lombok.Data;

@Data
public class JobPosting extends BaseModel {
    private Member postedBy;
    private Company postedFor;
    private String jobTitle;
    private String jobDescription;
}
