package accenture.team3.fooddelivery.utils.builders;

import accenture.team3.fooddelivery.domain.Comment;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.domain.User;
import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

import java.util.Set;

/**
 * Created by UberV on 21.07.2016.
 */
public class CommentBuilder {
    private CreateUpdateTime createUpdateTime;

    private byte status;
    private byte type;
    private String content;
    private User user;
    private Set<Restaurant> restaurant;

    public CommentBuilder() {
    }

    public CommentBuilder withStatus(byte status) {
        this.status = status;
        return this;
    }

    public CommentBuilder withType(byte type) {
        this.type = type;
        return this;
    }

    public CommentBuilder withContent(String content) {
        this.content = content;
        return this;
    }

    public CommentBuilder withUser(User user) {
        this.user = user;
        return this;
    }

    public CommentBuilder withRestaurant(Set<Restaurant> restaurant) {
        this.restaurant = restaurant;
        return this;
    }

    public CommentBuilder withCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
        return this;
    }

    public Comment build() {
        Comment comment = new Comment();
        comment.setStatus(status);
        comment.setCreateUpdateTime(createUpdateTime);
        comment.setContent(content);
//        comment.setRestaurant(restaurant);
        comment.setType(type);

        return comment;
    }


}
