package com.example.student_forum.service;

import com.example.student_forum.dao.Post;
import com.example.student_forum.dao.User;

import java.util.List;


public interface PersonService {
    User getUser();
    List<Post> getMyPostByPage(List<Post> posts,int page,int size);
}
