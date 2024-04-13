package com.app.linkedin.models.entities;

import lombok.Data;

@Data
public class Recommendation extends BaseModel {
    private Member givenBy;
    private Member givenTo;
    private String description;
}
