package com.app.linkedin.models.entities;

import lombok.Data;

import java.util.List;

@Data
public class Group extends BaseModel {
    private String groupName;
    private Member createdBy;
    private int totalMembers;
    private List<Member> members;
}
