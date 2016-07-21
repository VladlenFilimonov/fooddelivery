package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rating {

    @Id
    @GeneratedValue
    private long id;
    private byte status;
    private long restaurantDate;

    private byte serviceRating;
    private byte deliveryRating;
    private byte foodRating;
    private byte fieldRating;

    private SystemDateTime systemDateTime;

    public Rating() {

    }

    public Rating(byte status, long restaurantDate, byte serviceRating, byte deliveryRating, byte foodRating, byte fieldRating, SystemDateTime systemDateTime) {
        this.status = status;
        this.restaurantDate = restaurantDate;
        this.serviceRating = serviceRating;
        this.deliveryRating = deliveryRating;
        this.foodRating = foodRating;
        this.fieldRating = fieldRating;
        this.systemDateTime = systemDateTime;
    }

    public byte getDeliveryRating() {
        return deliveryRating;
    }

    public void setDeliveryRating(byte deliveryRating) {
        this.deliveryRating = deliveryRating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public long getRestaurantDate() {
        return restaurantDate;
    }

    public void setRestaurantDate(long restaurantDate) {
        this.restaurantDate = restaurantDate;
    }

    public byte getServiceRating() {
        return serviceRating;
    }

    public void setServiceRating(byte serviceRating) {
        this.serviceRating = serviceRating;
    }

    public byte getFoodRating() {
        return foodRating;
    }

    public void setFoodRating(byte foodRating) {
        this.foodRating = foodRating;
    }

    public byte getFieldRating() {
        return fieldRating;
    }

    public void setFieldRating(byte fieldRating) {
        this.fieldRating = fieldRating;
    }

    public SystemDateTime getSystemDateTime() {
        return systemDateTime;
    }

    public void setSystemDateTime(SystemDateTime systemDateTime) {
        this.systemDateTime = systemDateTime;
    }
}
