package accenture.team3.fooddelivery.controllers;


import accenture.team3.fooddelivery.services.comment.CommentService;
import accenture.team3.fooddelivery.shared.comment.CommentDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
@Slf4j
public class CommentController {

    private CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void handle(RuntimeException e) {
        log.error("Error Message : {}", e.getMessage(), e);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<CommentDto> getAllComments(@PathVariable("id") Long id) {
        return commentService.getComments(id);
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public List<CommentDto> findAllComments(@RequestBody CommentDto commentDto) {
//        return null;//CommentService.findAll();
//    }
}
