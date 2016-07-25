package accenture.team3.fooddelivery.dto.admin.category;

import java.util.Set;

public class AddCategoryDto {

    private String name;
    private String pictureURL;
    private Set<Integer> restaurantsId;

    public AddCategoryDto() {
    }

    public AddCategoryDto(String name, String pictureURL, Set<Integer> restaurantsId) {
        this.name = name;
        this.pictureURL = pictureURL;
        this.restaurantsId = restaurantsId;
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
