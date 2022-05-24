package com.example.student_forum.dao;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "comments")
public class Comment implements Serializable {
    @Id
    @Column(name = "comment_id")
    long commentId;
    @NotNull
    @Column(name = "comment_content")
    String commentContent;
    @ManyToOne
    @JoinColumn(name = "user",referencedColumnName = "username")
    User user;
    @ManyToOne
    @JoinColumn(name = "post",referencedColumnName = "post_id")
    Post post;
    @Column(name = "fabulous")
    int fabulous;
}
