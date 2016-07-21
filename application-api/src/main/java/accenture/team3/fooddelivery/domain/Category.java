package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Category {

    @Id
    private Long id;
    private String name;
    private String pictureURL;
    private byte status;
    @Embedded
    private SystemDateTime systemDateTime;
    @ManyToMany(mappedBy = "categories")
    private Set<Restaurant> restaurants;

    public Category() {
    }

    public Category(byte status, Long id, String name, String pictureURL, SystemDateTime systemDateTime, Set<Restaurant> restaurants) {
        this.status = status;
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

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
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

        Category category = (Category) o;

        if (id != null ? !id.equals(category.id) : category.id != null) return false;
        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return pictureURL != null ? pictureURL.equals(category.pictureURL) : category.pictureURL == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pictureURL != null ? pictureURL.hashCode() : 0);
        return result;
    }
}
