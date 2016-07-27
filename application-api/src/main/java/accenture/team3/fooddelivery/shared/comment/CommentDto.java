package accenture.team3.fooddelivery.shared.comment;

import accenture.team3.fooddelivery.domain.Comment;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommentDto {

    private Long id;
    private String content;
    private String userFirstName;
    private String userLastName;
    private String cratedAt;

    public CommentDto(Comment comment) {
        this.id = comment.getId();
        this.content = comment.getContent();
        this.userFirstName = comment.getUser().getFirstName();
        this.userLastName = comment.getUser().getLastName();
        this.cratedAt = comment.getAudit().getCreatedAt().toString();
    }
}
