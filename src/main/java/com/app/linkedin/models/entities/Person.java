package com.app.linkedin.models.entities;

import lombok.Data;

@Data
public abstract class Person extends BaseModel {
    private String firstName;
    private String lastName;
    private Address address;
    private Account account;
}
