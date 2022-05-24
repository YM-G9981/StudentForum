package com.example.student_forum.dao;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "posts")
public class Post implements Serializable {
    @Id
    @Column(name = "post_id")
    private String postId;
    @Column(name = "post_title")
    @NotNull
    private String postTitle;
    @ManyToOne
    @JoinColumn(name = "post_label",referencedColumnName = "label_id")
    private PostLabelCollection postLabel;
    @OneToMany(mappedBy = "commentId")
    private List<Comment> comments;
    @Column(name = "content")
    @NotNull
    private String content;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "user",referencedColumnName = "username")
    private User user;
    @ManyToMany(mappedBy = "favouritePosts")
    private List<User> beFavourite;
    @ManyToMany(mappedBy = "fabulousPosts")
    private List<User> beFabulous;
}
