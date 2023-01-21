package com.ajd.meow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

//논리명 좋아요
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="CMNTY_LIKE")
public class CommunityLike {

    @Id
    @Column(name="POST_NO")
    private Long postNo;

    @Column(name="USER_NO")
    private UUID userNo;

    @Column(name="LIKE_USER")
    private Long likeUser;
}
