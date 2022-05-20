package com.example.student_forum.dao;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User implements Serializable {
    @Id
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    @NotNull
    private String passWord;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "realname")
    @NotNull
    private String realName;
    @Column(name = "gender")
    private String gender;
    private File headSculpture;
    @Column(name = "age")
    @NotNull
    private int age;
    @OneToMany(mappedBy = "user")
    private List<Post> myPsots;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_favourite_post",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id")
    )
    private List<Post> favouritePosts;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_fabulous_post",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id"))
    private List<Post> fabulousPosts;

    public User(String userName, String passWord, String name, String realName, String gender,int age) {
        this.userName = userName;
        this.passWord = passWord;
        this.name = name;
        this.realName = realName;
        this.gender = gender;
        this.age =  age;
    }
    public User(){

    }
}
