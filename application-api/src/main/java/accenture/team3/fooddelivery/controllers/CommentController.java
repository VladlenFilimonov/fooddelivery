package accenture.team3.fooddelivery.controllers;


import accenture.team3.fooddelivery.domain.Comment;
import accenture.team3.fooddelivery.services.CommentCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    private CommentCrudService commentCrudService;

    @Autowired
    public CommentController(CommentCrudService commentCrudService) {
        this.commentCrudService = commentCrudService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Comment> findAllComments() {
        return commentCrudService.findAll();
    }
}
