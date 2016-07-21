package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;

import javax.persistence.*;

@Entity
public class CategoryLanguage {
    @Id
    private Long id;
    @Embedded
    private SystemDateTime systemDateTime;
    private byte status;
    private String language;
    private String translation;
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    public CategoryLanguage() {
    }

    public CategoryLanguage(Long id, SystemDateTime systemDateTime, byte status, String language, String translation, Category category) {
        this.id = id;
        this.systemDateTime = systemDateTime;
        this.status = status;
        this.language = language;
        this.translation = translation;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SystemDateTime getSystemDateTime() {
        return systemDateTime;
    }

    public void setSystemDateTime(SystemDateTime systemDateTime) {
        this.systemDateTime = systemDateTime;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
