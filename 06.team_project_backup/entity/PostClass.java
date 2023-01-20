package com.ajd.meow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="POST_CLS")
public class PostClass {

    @Id
    @Column(name = "POST_ID")
    private String postId;

    @Column(name = "POST_TYPE")
    private String postType;
}
