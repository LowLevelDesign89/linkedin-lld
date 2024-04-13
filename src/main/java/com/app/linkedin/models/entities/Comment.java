package com.app.linkedin.models.entities;

import lombok.Data;

import java.util.List;

@Data
public class Comment extends BaseModel{
    private Member commentedBy;
    private String commentText;
    private String image; // blob image link if any
    private List<Reaction> raections;
}
