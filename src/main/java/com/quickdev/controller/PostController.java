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

import com.quickdev.model.Post;
import com.quickdev.service.PostService;



@RestController
@RequestMapping("/posts")
public class PostController {
    
    @Autowired
    private PostService service;

    @PostMapping
    public ResponseEntity<Post> savePost(@RequestBody Post post){
        post = service.savePost(post);
        return ResponseEntity.ok(post);
    }

    @GetMapping
    public ResponseEntity<List<Post>> getAlPosts(){
        return ResponseEntity.ok(service.getPosts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getUserById(@PathVariable int id){
        return ResponseEntity.ok(service.getPostById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable int id){
        service.deletePostById(id);
        return ResponseEntity.ok().build();
    }

}
