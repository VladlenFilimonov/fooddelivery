package accenture.team3.fooddelivery.services.Impl;

import accenture.team3.fooddelivery.dao.CommentDao;
import accenture.team3.fooddelivery.domain.Comment;
import accenture.team3.fooddelivery.services.CommentCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class CommentCrudServiceImpl implements CommentCrudService {

    private CommentDao CommentDao;

    @Autowired
    public CommentCrudServiceImpl(CommentDao CommentDao) {
        this.CommentDao = CommentDao;
    }

    @Override
    public Comment create(Comment comment) {
        return CommentDao.save(comment);
    }

    @Override
    public Comment update(Comment comment) {
        return CommentDao.save(comment);
    }

    @Override
    public List<Comment> findAll() {
        return (List<Comment>) CommentDao.findAll();
    }

    @Override
    public Comment findOneById(Long id) {
        return CommentDao.findOne(id);
    }

    @Override
    public Long deleteById(Long id) {
        try {
            CommentDao.delete(id);
        } catch (EmptyResultDataAccessException e) {
            return 0l;
        }
        return id;
    }
}
