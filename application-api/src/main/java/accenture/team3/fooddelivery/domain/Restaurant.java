package accenture.team3.fooddelivery.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalTime;

@Entity
public class Restaurant extends DatedClass {

    @Id
    @GeneratedValue
    private Long id;
    private byte status;
   // private Schedule schedule;
    private String companyName;
    private String logo;
    private String url;
    private String phoneNumber;
    private LocalTime deliveryTime;
    private BigDecimal freeDeliveryByCost;
    private boolean clientCardFreeDelivery;
    private boolean creditCardsSupport;
    private String contactName;
    private String contactPhone;
    private String contactEmail;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

//    public Schedule getSchedule() {
//        return schedule;
//    }
//
//    public void setSchedule(Schedule schedule) {
//        this.schedule = schedule;
//    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public BigDecimal getFreeDeliveryByCost() {
        return freeDeliveryByCost;
    }

    public void setFreeDeliveryByCost(BigDecimal freeDeliveryByCost) {
        this.freeDeliveryByCost = freeDeliveryByCost;
    }

    public boolean isClientCardFreeDelivery() {
        return clientCardFreeDelivery;
    }

    public void setClientCardFreeDelivery(boolean clientCardFreeDelivery) {
        this.clientCardFreeDelivery = clientCardFreeDelivery;
    }

    public boolean isCreditCardsSupport() {
        return creditCardsSupport;
    }

    public void setCreditCardsSupport(boolean creditCardsSupport) {
        this.creditCardsSupport = creditCardsSupport;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Restaurant that = (Restaurant) o;

        if (status != that.status) return false;
        if (clientCardFreeDelivery != that.clientCardFreeDelivery) return false;
        if (creditCardsSupport != that.creditCardsSupport) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (logo != null ? !logo.equals(that.logo) : that.logo != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (deliveryTime != null ? !deliveryTime.equals(that.deliveryTime) : that.deliveryTime != null) return false;
        if (freeDeliveryByCost != null ? !freeDeliveryByCost.equals(that.freeDeliveryByCost) : that.freeDeliveryByCost != null)
            return false;
        if (contactName != null ? !contactName.equals(that.contactName) : that.contactName != null) return false;
        if (contactPhone != null ? !contactPhone.equals(that.contactPhone) : that.contactPhone != null) return false;
        return contactEmail != null ? contactEmail.equals(that.contactEmail) : that.contactEmail == null;

    }

    @Override
    public int hashCode() {
        int result = createdAt != null ? createdAt.hashCode() : 0;
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (deliveryTime != null ? deliveryTime.hashCode() : 0);
        result = 31 * result + (freeDeliveryByCost != null ? freeDeliveryByCost.hashCode() : 0);
        result = 31 * result + (clientCardFreeDelivery ? 1 : 0);
        result = 31 * result + (creditCardsSupport ? 1 : 0);
        result = 31 * result + (contactName != null ? contactName.hashCode() : 0);
        result = 31 * result + (contactPhone != null ? contactPhone.hashCode() : 0);
        result = 31 * result + (contactEmail != null ? contactEmail.hashCode() : 0);
        return result;
    }
}
