package com.example.student_forum.dao;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

//@Entity
@Data
public class Post implements Serializable {
    private String postName;
    private enum postClassification;
    private List<Comment> comments;
    private String content;
    private User user;

}
