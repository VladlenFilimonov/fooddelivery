package accenture.team3.fooddelivery.dto;

import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.domain.restaurantDependencies.DeliveryTime;
import accenture.team3.fooddelivery.domain.restaurantDependencies.WorkWeek;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

/**
 * Created by student007 on 16.21.7.
 */
public class RestaurantPostDto {

    private String name;
    private String url;
    private String phone;
    private DeliveryTime deliveryTime;
    private WorkWeek workWeek;
    private BigDecimal freeDeliveryFrom;
    private boolean freeDeliveryWithClientCard;
    private boolean cardPay;
    private Map<Long, String> categoryURL;
    private Set<Category> categories;
    private String logoUrl;

    public RestaurantPostDto() {
    }

    public RestaurantPostDto(String name, String url, String phone, DeliveryTime deliveryTime, WorkWeek workWeek, BigDecimal freeDeliveryFrom, boolean freeDeliveryWithClientCard, boolean cardPay, Map<Long, String> categoryURL, Set<Category> categories, String logoUrl) {
        this.name = name;
        this.url = url;
        this.phone = phone;
        this.deliveryTime = deliveryTime;
        this.workWeek = workWeek;
        this.freeDeliveryFrom = freeDeliveryFrom;
        this.freeDeliveryWithClientCard = freeDeliveryWithClientCard;
        this.cardPay = cardPay;
        this.categoryURL = categoryURL;
        this.categories = categories;
        this.logoUrl = logoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DeliveryTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(DeliveryTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public WorkWeek getWorkWeek() {
        return workWeek;
    }

    public void setWorkWeek(WorkWeek workWeek) {
        this.workWeek = workWeek;
    }

    public BigDecimal getFreeDeliveryFrom() {
        return freeDeliveryFrom;
    }

    public void setFreeDeliveryFrom(BigDecimal freeDeliveryFrom) {
        this.freeDeliveryFrom = freeDeliveryFrom;
    }

    public boolean isFreeDeliveryWithClientCard() {
        return freeDeliveryWithClientCard;
    }

    public void setFreeDeliveryWithClientCard(boolean freeDeliveryWithClientCard) {
        this.freeDeliveryWithClientCard = freeDeliveryWithClientCard;
    }

    public boolean isCardPay() {
        return cardPay;
    }

    public void setCardPay(boolean cardPay) {
        this.cardPay = cardPay;
    }

    public Map<Long, String> getCategoryURL() {
        return categoryURL;
    }

    public void setCategoryURL(Map<Long, String> categoryURL) {
        this.categoryURL = categoryURL;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}
