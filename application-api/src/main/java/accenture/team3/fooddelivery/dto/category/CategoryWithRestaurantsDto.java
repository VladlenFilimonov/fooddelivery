package accenture.team3.fooddelivery.dto.category;

import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;
import accenture.team3.fooddelivery.dto.restaurant.RestaurantGetDto;

import java.util.Set;

public class CategoryWithRestaurantsDto {
    private Long id;
    private String name;
    private String pictureURL;
    private byte status;
    private CreateUpdateTime createUpdateTime;
    private Set<RestaurantGetDto> restaurants;
//    private Set<Restaurant> restaurants;

    public CategoryWithRestaurantsDto() {
    }

    public CategoryWithRestaurantsDto(Long id, String name, String pictureURL, byte status, CreateUpdateTime createUpdateTime, Set<RestaurantGetDto> restaurants) {
        this.id = id;
        this.name = name;
        this.pictureURL = pictureURL;
        this.status = status;
        this.createUpdateTime = createUpdateTime;
        this.restaurants = restaurants;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public CreateUpdateTime getCreateUpdateTime() {
        return createUpdateTime;
    }

    public void setCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
    }

    public Set<RestaurantGetDto> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<RestaurantGetDto> restaurants) {
        this.restaurants = restaurants;
    }

//    public Set<Restaurant> getRestaurants() {
//        return restaurants;
//    }
//
//    public void setRestaurants(Set<Restaurant> restaurants) {
//        this.restaurants = restaurants;
//    }
}
