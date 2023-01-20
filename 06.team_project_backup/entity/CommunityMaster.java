package com.ajd.meow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="CMNTY_MSTR")
public class CommunityMaster {

    @Id
    @Column(name="POST_NO")
    private Long postNo;

    @Id
    @Column(name="USER_NO")
    @GeneratedValue(generator = "uuids")
    @GenericGenerator(name= "uuid2", strategy = "uuid")
    private UUID userNo;

    @Id
    @Column(name="CMNTY_ID")
    private String communityId;

    @Id
    @Column(name="POST_ID")
    private String postId;

    @Column(name="SUBJECT")
    private String subject;

    @Column(name="CONTENT")
    private String content;

    @Column(name="CRT_DATE")
    private LocalDateTime createPostDate;

    @Column(name="UPDATE_DATE")
    private LocalDateTime updatePostDate;

    @Column(name = "DELETE_DATE")
    private LocalDateTime deletePostDate;
}
