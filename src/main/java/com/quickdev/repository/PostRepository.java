package com.quickdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickdev.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
