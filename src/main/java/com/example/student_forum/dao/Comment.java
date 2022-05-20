package com.example.student_forum.dao;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "comments")
public class Comment implements Serializable {
    @Id
    @Column(name = "comment_id")
    long commentId;
    @NotNull
    @Column(name = "comment_name")
    String commentName;
    @ManyToOne
    @JoinColumn(name = "user",referencedColumnName = "username")
    User user;
    @ManyToOne
    @JoinColumn(name = "post",referencedColumnName = "post_id")
    Post post;
    @OneToOne
    @JoinColumn(name = "reply_from",referencedColumnName = "comment_id")
    Comment replyFrom;
    @Column(name = "fabulous")
    int fabulous;
}
