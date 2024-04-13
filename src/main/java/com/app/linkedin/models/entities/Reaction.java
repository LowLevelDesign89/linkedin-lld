package com.app.linkedin.models.entities;

import com.app.linkedin.models.enums.PostReactionEmoji;
import lombok.Data;

@Data
public class Reaction extends BaseModel{
    private Member reactedBy;
    private PostReactionEmoji postReactionEmoji;
}
