package com.example.spring2.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostsRepository extends JpaRepository<Posts,Long> {

}
