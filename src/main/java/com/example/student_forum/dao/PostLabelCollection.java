package com.example.student_forum.dao;

import lombok.Data;

import javax.persistence.Entity;
import java.io.File;
import java.io.Serializable;
import java.util.List;

//@Entity
@Data
public class PostLabelCollection implements Serializable {
    private String labelName;
    private List<Post> posts;
    private String labelDescribe;
    private File icon;

}
