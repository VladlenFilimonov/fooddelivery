package accenture.team3.fooddelivery.services.Impl;

import accenture.team3.fooddelivery.dao.MealDao;
import accenture.team3.fooddelivery.domain.Meal;
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
    public Meal create(Meal meal) {
        return mealDao.save(meal);
    }

    @Override
    public Meal update(Meal meal) {
        return mealDao.save(meal);
    }

    @Override
    public List<Meal> findAll() {
        return (List<Meal>) mealDao.findAll();
    }

    @Override
    public Meal findOneById(Long id) {
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
