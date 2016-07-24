package accenture.team3.fooddelivery.dto.category.admin;

import java.util.Set;

public class GetAndUpdateCategoryDto {

    private Long id;
    private String name;
    private String pictureURL;
    private Set<Integer> restaurantsId;

    public GetAndUpdateCategoryDto() {
    }

    public GetAndUpdateCategoryDto(Long id, String name, String pictureURL, Set<Integer> restaurantsId) {
        this.id = id;
        this.name = name;
        this.pictureURL = pictureURL;
        this.restaurantsId = restaurantsId;
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

    public Set<Integer> getRestaurantsId() {
        return restaurantsId;
    }

    public void setRestaurantsId(Set<Integer> restaurantsId) {
        this.restaurantsId = restaurantsId;
    }
}
