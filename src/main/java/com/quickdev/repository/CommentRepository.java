package com.quickdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickdev.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
