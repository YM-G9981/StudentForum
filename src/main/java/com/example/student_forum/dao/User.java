package com.example.student_forum.dao;

import lombok.Data;

import javax.persistence.Entity;
import java.io.File;
import java.io.Serializable;

@Entity
@Data
public class User implements Serializable {
    private String userName;
    private String passWord;
    private String name;
    private String realName;
    private String gender;
    private File headSculpture;
    private int Age;
}
