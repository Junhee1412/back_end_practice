package com.ajd.meow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="CMNTY_LIKE")
public class CommunityLike {

    @Id
    @Column(name="POST_NO")
    private Long postNo;

    @Id
    @Column(name="USER_NO")
    @GeneratedValue(generator = "uuids")
    @GenericGenerator(name= "uuid2", strategy = "uuid")
    private UUID userNo;

    @Column(name="LIKE_USER")
    private Long likeUser;
}
