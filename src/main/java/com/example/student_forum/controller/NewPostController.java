package com.example.student_forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/NewPostPage")
public interface NewPostController {
    String newPost(HttpServletRequest request, HttpServletResponse response, Model model);
}
