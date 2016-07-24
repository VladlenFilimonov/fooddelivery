package accenture.team3.fooddelivery.utils.builders;

import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.domain.CategoryLanguage;
import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

/**
 * Created by UberV on 21.07.2016.
 */
public class CategoryLanguageBuilder {

    private String name;
    private CreateUpdateTime createUpdateTime;
    private byte status;
    private String language;
    private String translation;
    private Category category;

    public CategoryLanguageBuilder() {

    }

    public CategoryLanguageBuilder withStatus(byte status) {
        this.status = status;
        return this;
    }

    public CategoryLanguageBuilder withLanguage(String language) {
        this.language = language;
        return this;
    }

    public CategoryLanguageBuilder withCategory(Category category) {
        this.category = category;
        return this;
    }


    public CategoryLanguageBuilder withTranslation(String translation) {
        this.translation = translation;
        return this;
    }


    public CategoryLanguageBuilder withCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
        return this;
    }

    public CategoryLanguage build() {
        CategoryLanguage categoryLanguage = new CategoryLanguage();
        categoryLanguage.setCreateUpdateTime(createUpdateTime);
        categoryLanguage.setStatus(status);
        categoryLanguage.setCategory(category);
        categoryLanguage.setTranslation(translation);


        return categoryLanguage;
    }

}