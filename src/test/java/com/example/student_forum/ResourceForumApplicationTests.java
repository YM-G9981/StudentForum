package com.example.student_forum;

import com.example.student_forum.dao.User;
import com.example.student_forum.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ResourceForumApplicationTests {
    @Resource
    UserRepository userRepository;
    @Test
    void contextLoads() {
        userRepository.findByUserName("a");
        userRepository.save(new User("user","pass","张三","李四","男",15));
    }

}
