package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Meal {

    @Id
    private Long id;
    private String name;
    private String pictureURL;
    @Embedded
    private SystemDateTime systemDateTime;
    @ManyToMany(mappedBy = "meals")
    private Set<Restaurant> restaurants;

    public Meal() {
    }

    public Meal(Long id, String name, String pictureURL, SystemDateTime systemDateTime, Set<Restaurant> restaurants) {
        this.id = id;
        this.name = name;
        this.pictureURL = pictureURL;
        this.systemDateTime = systemDateTime;
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

    public SystemDateTime getSystemDateTime() {
        return systemDateTime;
    }

    public void setSystemDateTime(SystemDateTime systemDateTime) {
        this.systemDateTime = systemDateTime;
    }

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meal meal = (Meal) o;

        if (id != null ? !id.equals(meal.id) : meal.id != null) return false;
        if (name != null ? !name.equals(meal.name) : meal.name != null) return false;
        return pictureURL != null ? pictureURL.equals(meal.pictureURL) : meal.pictureURL == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pictureURL != null ? pictureURL.hashCode() : 0);
        return result;
    }
}
