package com.quickdev.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickdev.model.User;
import com.quickdev.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    
    // CREATE
    public User savUser(User user){
        return repository.save(user);
    }

    // READ
    public List<User> getUsers(){
        return repository.findAll();
    }

    public User  getUserById(Integer id){
        return repository.findById(id).get();
    }

    // UPDATE 
    public User updatUser(User user){
        if (Objects.nonNull(user.getId())) {
            if(repository.existsById(user.getId())){
                return repository.save(user);
            } else{
                throw new IllegalArgumentException("Usuário não localizado");
        }
 
        } else{
            throw new IllegalArgumentException("O ID do usuário não pode ser nulo");
        }
        
    }

    // DELETE
    public void deleteUserById(Integer id){
        repository.deleteById(id);
    }

}
