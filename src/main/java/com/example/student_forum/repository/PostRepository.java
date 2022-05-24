package com.example.student_forum.repository;

import com.example.student_forum.dao.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PostRepository extends JpaRepository<Post,Integer> {


}
