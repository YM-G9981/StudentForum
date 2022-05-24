package com.example.student_forum.service.impl;

import com.example.student_forum.dao.Post;
import com.example.student_forum.dao.User;
import com.example.student_forum.repository.UserRepository;
import com.example.student_forum.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    UserRepository userRepository;
    @Override
    public User getUser() {
//        Object details = SecurityContextHolder.getContext().getAuthentication().getDetails();
//        if(details instanceof User)
//            return (User) details;
        return userRepository.findByUserName("user");
    }

    @Override

    public List<Post> getMyPostByPage(List<Post> posts, int page,int size) {
        int index = page*size;
        int count = 0;
        LinkedList<Post> list = new LinkedList<>();
        while (count<size&&index< posts.size()){
            list.add(posts.get(index));
            count++;
        }
        return list;
     }

}
