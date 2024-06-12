package com.quickdev.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickdev.model.Post;
import com.quickdev.model.User;
import com.quickdev.repository.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;
    
    // CREATE
    public Post savePost(Post post){
        return repository.save(post);
    }

    // READ
    public List<Post> getPosts(){
        return repository.findAll();
    }

    public Post  getPostById(Integer id){
        return repository.findById(id).get();
    }

    // UPDATE 
    public Post updatPost(Post post){
        if (Objects.nonNull(post.getId())) {
            if(repository.existsById(post.getId())){
                return repository.save(post);
            } else{
                throw new IllegalArgumentException("Usuário não localizado");
        }
 
        } else{
            throw new IllegalArgumentException("O ID do usuário não pode ser nulo");
        }
        
    }

    // DELETE
    public void deletePostById(Integer id){
        repository.deleteById(id);
    }

}
