package accenture.team3.fooddelivery.domain.builders;

import accenture.team3.fooddelivery.domain.Rating;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.domain.User;
import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

import java.util.Set;

/**
 * Created by UberV on 21.07.2016.
 */
public class RatingBuilder {

    private byte status;
    private CreateUpdateTime createUpdateTime;

    private Set<Restaurant> restaurant;

    private User user;

    public RatingBuilder() {
    }

    public RatingBuilder withStatus(byte status) {
        this.status = status;
        return this;
    }

    public RatingBuilder withCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
        return this;
    }

    public RatingBuilder withRestaurant(Set<Restaurant> restaurant) {
        this.restaurant = restaurant;
        return this;
    }

    public RatingBuilder withUser(User user) {
        this.user = user;
        return this;
    }

    public Rating build() {
        Rating rating = new Rating();
        rating.setCreateUpdateTime(createUpdateTime);
        rating.setStatus(status);
        rating.setUser(user);
        rating.setRestaurant(restaurant);

        return rating;
    }


}
