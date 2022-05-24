package com.example.student_forum.dao;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "post_label_collection")
public class PostLabelCollection implements Serializable {
    @Id
    @Column(name = "label_id")
    private int labelId;
    @Column(name = "label_title")
    @NotNull
    private String labelTitle;
    @OneToMany(mappedBy = "postId")
    private List<Post> posts;
    @Column(name  ="label_describe")
    @NotNull
    private String labelDescribe;
    private File icon;

}
