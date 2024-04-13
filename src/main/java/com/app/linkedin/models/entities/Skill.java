package com.app.linkedin.models.entities;

import com.app.linkedin.models.enums.SkillProficiency;
import lombok.Data;

@Data
public class Skill {
    private String skillName;
    private SkillProficiency skillProficiency;
    private int yearsUsed;
    private int monthsUsed;
}
