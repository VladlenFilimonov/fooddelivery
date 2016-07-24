package accenture.team3.fooddelivery.utils.builders;

import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

import java.util.Set;

/**
 * Created by UberV on 21.07.2016.
 */
public class CategoryBuilder {

    private String name;
    private String pictureURL;
    private byte status;
    private CreateUpdateTime createUpdateTime;
    private Set<Restaurant> restaurants;

    public CategoryBuilder(String name) {
        this.name = name;
    }

    public CategoryBuilder withStatus(byte status) {
        this.status = status;
        return this;
    }

    public CategoryBuilder withCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
        return this;
    }

    public CategoryBuilder withRestaurants(Set<Restaurant> restaurants) {
        this.restaurants = restaurants;
        return this;
    }

    public Category build() {
        Category category = new Category();
        category.setName(this.name);
        category.setPictureURL(this.pictureURL);
        category.setStatus(this.status);
        category.setCreateUpdateTime(this.createUpdateTime);
        category.setRestaurants(this.restaurants);

        return category;
    }

}
