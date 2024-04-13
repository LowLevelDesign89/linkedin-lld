package com.app.linkedin.models.entities;

import lombok.Data;

import java.util.List;

@Data
public class Post extends BaseModel{
    private Member owner;
    private String postDescription;
    private String image; // blob link of post image if any
    private List<Reaction> reactions;
    private List<Comment> comments;
}
