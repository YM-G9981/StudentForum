package com.example.student_forum.dao;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

//@Entity
@Data
public class Comment implements Serializable {
    String commentName;
    User user;
    List <Comment> reply;
    int fabulous;
}
