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
@Table(name="REPLY")
public class Reply {

    @Id
    @Column(name="USER_NO")
    @GeneratedValue(generator = "uuids")
    @GenericGenerator(name= "uuid2", strategy = "uuid")
    private UUID userNo;

    @Id
    @Column(name="POST_NO")
    private String postNo;

    @Column(name = "REPLY_CONTENT")
    private String replyContent;

    @Column(name="REPLY_USER_NO")
    private UUID replyUserNo;

    @Column(name="UPDATE_DATE")
    private LocalDateTime updateReplyDate;

    @Column(name="DELETE_DATE")
    private LocalDateTime deleteReplyDate;

}
