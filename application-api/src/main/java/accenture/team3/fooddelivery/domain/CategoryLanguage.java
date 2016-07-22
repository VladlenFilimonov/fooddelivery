package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

import javax.persistence.*;

@Entity
public class CategoryLanguage {
    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    private CreateUpdateTime createUpdateTime;
    private byte status;
    private String language;
    private String translation;
    @ManyToOne
    private Category category;

    public CategoryLanguage() {
    }

    public CategoryLanguage(Long id, CreateUpdateTime createUpdateTime, byte status, String language, String translation, Category category) {
        this.id = id;
        this.createUpdateTime = createUpdateTime;
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

    public CreateUpdateTime getCreateUpdateTime() {
        return createUpdateTime;
    }

    public void setCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CategoryLanguage)) return false;

        CategoryLanguage that = (CategoryLanguage) o;

        if (status != that.status) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        return translation != null ? translation.equals(that.translation) : that.translation == null;

    }

    @Override
    public int hashCode() {
        int result = (int) status;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (translation != null ? translation.hashCode() : 0);
        return result;
    }
}
