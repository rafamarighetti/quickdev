package com.quickdev.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickdev.model.Comment;
import com.quickdev.repository.CommentRepository;

@Service
public class CommentService {

    @Autowired
    private CommentRepository repository;
    
    // CREATE
    public Comment saveComment(Comment comment){
        return repository.save(comment);
    }

    // READ
    public List<Comment> getComments(){
        return repository.findAll();
    }

    public Comment  getCommentById(Integer id){
        return repository.findById(id).get();
    }

    // UPDATE 
    public Comment updaeComment(Comment comment){
        if (Objects.nonNull(comment.getId())) {
            if(repository.existsById(comment.getId())){
                return repository.save(comment);
            } else{
                throw new IllegalArgumentException("Usuário não localizado");
        }
 
        } else{
            throw new IllegalArgumentException("O ID do usuário não pode ser nulo");
        }
        
    }

    // DELETE
    public void deleteCommentById(Integer id){
        repository.deleteById(id);
    }

}
