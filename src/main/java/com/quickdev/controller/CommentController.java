package com.quickdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickdev.model.Comment;
import com.quickdev.service.CommentService;



@RestController
@RequestMapping("/comments")
public class CommentController {
    
    @Autowired
    private CommentService service;

    @PostMapping
    public ResponseEntity<Comment> saveUser(@RequestBody Comment comment){
        comment = service.saveComment(comment);
        return ResponseEntity.ok(comment);
    }

    @GetMapping
    public ResponseEntity<List<Comment>> getAlUsers(){
        return ResponseEntity.ok(service.getComments());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comment> getUserById(@PathVariable int id){
        return ResponseEntity.ok(service.getCommentById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable int id){
        service.deleteCommentById(id);
        return ResponseEntity.ok().build();
    }

}
