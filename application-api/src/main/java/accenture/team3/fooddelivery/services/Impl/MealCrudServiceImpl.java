package accenture.team3.fooddelivery.services.Impl;

import accenture.team3.fooddelivery.dao.MealDao;
import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.services.MealCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class MealCrudServiceImpl implements MealCrudService {

    private MealDao mealDao;

    @Autowired
    public MealCrudServiceImpl(MealDao mealDao) {
        this.mealDao = mealDao;
    }

    @Override
    public Category create(Category category) {
        return mealDao.save(category);
    }

    @Override
    public Category update(Category category) {
        return mealDao.save(category);
    }

    @Override
    public List<Category> findAll() {
        return (List<Category>) mealDao.findAll();
    }

    @Override
    public Category findOneById(Long id) {
        return mealDao.findOne(id);
    }

    @Override
    public Long deleteById(Long id) {
        try {
            mealDao.delete(id);
        } catch (EmptyResultDataAccessException e) {
            return 0l;
        }
        return id;
    }
}
