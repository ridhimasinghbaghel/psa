package com.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "content", length = 1000)
    private String content;

    @ManyToOne  // many - comment & one - post
    @JoinColumn(name = "post_id") // join column - foreign key . to join two column we require two column that is foreign key & primary key
    private Post post;             // so we use this column @JoinColumn..

}