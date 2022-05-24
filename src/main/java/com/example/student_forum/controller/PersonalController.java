package com.example.student_forum.controller;

import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface PersonalController {
    String getPerson(Model model, HttpServletRequest request, HttpServletResponse response,String username);
    String getMyPostByPage(Model model, HttpServletRequest request,
                           HttpServletResponse response,  String username,  String page);
    String getFabulousPostByPage(Model model, HttpServletRequest request,
                           HttpServletResponse response,  String username,  String page);
    String getFavouritePostByPage(Model model, HttpServletRequest request,
                           HttpServletResponse response,  String username,  String page);
}
