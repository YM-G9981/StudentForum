package com.example.student_forum.controller.impl;

import com.example.student_forum.controller.PersonalController;
import com.example.student_forum.dao.Post;
import com.example.student_forum.dao.User;
import com.example.student_forum.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("person")
public class PersonalControllerImpl implements PersonalController {
    @Resource
    PersonService persionService;
    @Override
    @RequestMapping("/{username}")
    public String getPerson(Model model, HttpServletRequest request, HttpServletResponse response,@PathVariable String username) {
        User user = persionService.getUser();
        model.addAttribute("user",user);
        List<Post> myPosts = persionService.getMyPostByPage(user.getMyPsots(), 0, 10);
        model.addAttribute("myPosts",myPosts);
        List<Post> fabulousPosts = persionService.getMyPostByPage(user.getFabulousPosts(), 0, 10);
        model.addAttribute("fabulousPosts",fabulousPosts);
        List<Post> favouritePosts = persionService.getMyPostByPage(user.getFavouritePosts(), 0, 10);
        model.addAttribute("favouritePosts",favouritePosts);
        return "personal_page/personal_page";
    }
    @GetMapping("/getMyPost/{username}/{page}")
    @Override
    public String getMyPostByPage(Model model, HttpServletRequest request,
                                HttpServletResponse response, @PathVariable String username,@PathVariable String page) {
        User user = persionService.getUser();
        List<Post> posts = persionService.getMyPostByPage(user.getMyPsots(), Integer.valueOf(page), 10);
        model.addAttribute("myPosts",posts);
        return "personal_page/personal_page::myPosts";
    }
    @GetMapping("/getFabulousPost/{username}/{page}")
    @Override
    public String getFabulousPostByPage(Model model, HttpServletRequest request,
                                        HttpServletResponse response, @PathVariable String username,@PathVariable String page) {
        User user = persionService.getUser();
        List<Post> posts = persionService.getMyPostByPage(user.getFabulousPosts(), Integer.valueOf(page), 10);
        model.addAttribute("fabulousPosts",posts);
        return "personal_page/personal_page::fabulousPosts";
    }

    @Override
    public String getFavouritePostByPage(Model model, HttpServletRequest request,
                                         HttpServletResponse response, @PathVariable String username,@PathVariable String page) {
        User user = persionService.getUser();
        List<Post> posts = persionService.getMyPostByPage(user.getFavouritePosts(), Integer.valueOf(page), 10);
        model.addAttribute("favouritePosts",posts);
        return "personal_page/personal_page::favouritePosts";
    }


}
