package accenture.team3.fooddelivery.services.Impl;

import accenture.team3.fooddelivery.dao.CategoryDao;
import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.dto.category.CategoryWithRestaurantsDto;
import accenture.team3.fooddelivery.services.CategoryCrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class CategoryCrudServiceImpl implements CategoryCrudService {

    private CategoryDao categoryDao;
    private ModelMapper modelMapper;

    @Autowired
    public CategoryCrudServiceImpl(CategoryDao categoryDao, ModelMapper modelMapper) {
        this.categoryDao = categoryDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public Category create(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public Category update(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryDao.findAll();
    }

    @Override
    public CategoryWithRestaurantsDto findOneById(Long id) {
        Category category = categoryDao.findOne(id);
        return convertToDto(category);
    }

    @Override
    public Long deleteById(Long id) {
        try {
            categoryDao.delete(id);
        } catch (EmptyResultDataAccessException e) {
            return 0l;
        }
        return id;
    }

    private CategoryWithRestaurantsDto convertToDto(Category category) {
        CategoryWithRestaurantsDto categoryWithRestaurantsDto = modelMapper.map(category, CategoryWithRestaurantsDto.class);
        return categoryWithRestaurantsDto;
    }

}
