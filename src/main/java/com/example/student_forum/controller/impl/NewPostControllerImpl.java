package com.example.student_forum.controller.impl;

import com.example.student_forum.controller.NewPostController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/NewPost")
public class NewPostControllerImpl implements NewPostController {

    @RequestMapping("")
    @Override
    public String newPost(HttpServletRequest request, HttpServletResponse response, Model model){

        return "/posts_page/new_post_page";
    }

}
