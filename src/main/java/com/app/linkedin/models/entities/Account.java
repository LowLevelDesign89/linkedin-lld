package com.app.linkedin.models.entities;

import com.app.linkedin.models.enums.AccountStatus;
import lombok.Data;

@Data
public class Account extends BaseModel{
    private String username;
    private String password;
    private AccountStatus accountStatus;
}
