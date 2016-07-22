package accenture.team3.fooddelivery.domain.builders;

import accenture.team3.fooddelivery.domain.*;
import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;
import accenture.team3.fooddelivery.domain.restaurantDependencies.DeliveryTime;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

/**
 * Created by UberV on 21.07.2016.
 */
public class RestaurantBuilder {

    private String url;
    private String phone;
    private String name;
    private DeliveryTime deliveryTime;

    private Set<Schedule> schedule;
    private BigDecimal freeDeliveryFrom;
    private boolean freeDeliveryWithClientCard;
    private boolean cardPay;

    private CreateUpdateTime createUpdateTime;

    private Map<Long, String> categoryURL;

    private Set<Category> categories;
    private String logoUrl;
    private byte status;

    private Set<Rating> rating;

    private Set<Comment> comment;

    private User user;


    public RestaurantBuilder(String name) {
        this.name = name;
    }

    public RestaurantBuilder withUrl(String url) {
        this.url = url;
        return this;
    }

    public RestaurantBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public RestaurantBuilder withDeliveryTime(DeliveryTime deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }

    public RestaurantBuilder withSchedule(Set<Schedule> schedule) {
        this.schedule = schedule;
        return this;
    }

    public RestaurantBuilder withFreeDeliveryFrom(BigDecimal freeDeliveryFrom) {
        this.freeDeliveryFrom = freeDeliveryFrom;
        return this;
    }

    public RestaurantBuilder withFreeDeliveryWithClientCard(boolean freeDeliveryWithClientCard) {
        this.freeDeliveryWithClientCard = freeDeliveryWithClientCard;
        return this;
    }

    public RestaurantBuilder withCardPay(boolean cardPay) {
        this.cardPay = cardPay;
        return this;
    }

    public RestaurantBuilder withCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
        return this;
    }

    public RestaurantBuilder withCategoryUrl(Map<Long, String> categoryURL) {
        this.categoryURL = categoryURL;
        return this;
    }

    public RestaurantBuilder withCategories(Set<Category> categories) {
        this.categories = categories;
        return this;
    }

    public RestaurantBuilder withLogoURL(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    public RestaurantBuilder withStatus(byte status) {
        this.status = status;
        return this;
    }

    public RestaurantBuilder withRating(Set<Rating> rating) {
        this.rating = rating;
        return this;
    }

    public RestaurantBuilder withComment(Set<Comment> comment) {
        this.comment = comment;
        return this;
    }

    public RestaurantBuilder withUser(User user) {
        this.user = user;
        return this;
    }

    public Restaurant build() {
        Restaurant restaurant = new Restaurant();
        restaurant.setUrl(url);
        restaurant.setPhone(phone);
        restaurant.setDeliveryTime(deliveryTime);
//        restaurant.setSchedule(schedule);
        restaurant.setSchedule(this.schedule);
        restaurant.setFreeDeliveryFrom(freeDeliveryFrom);
        restaurant.setFreeDeliveryWithClientCard(freeDeliveryWithClientCard);
        restaurant.setCardPay(cardPay);
        restaurant.setCreateUpdateTime(createUpdateTime);
        restaurant.setCategoryURL(categoryURL);
        restaurant.setCategories(categories);
        restaurant.setLogoUrl(logoUrl);
        restaurant.setStatus(status);
        restaurant.setRating(rating);
        restaurant.setComment(comment);
        restaurant.setUser(user);
        return restaurant;
    }


}
