package com.mybloga.mybloga.repository;

import com.mybloga.mybloga.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
