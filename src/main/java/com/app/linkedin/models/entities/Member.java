package com.app.linkedin.models.entities;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Member extends Person {
    private Date joinedDate;
    private List<Member> memberSuggestions;
    private List<Member> memberFollows;
    private List<Member> memberConnections;
    private Profile profile;

    // need to add company follows
    private List<Company> companyFollows;

    // need to add group;
    private List<Group> groups;
}
