package accenture.team3.fooddelivery.dto.comment;

import lombok.Data;

@Data
public class CommentDto {
    private Long id;
    private String content;
    private String userFirstName;
    private String userLastName;
    private String cratedAt;
}
