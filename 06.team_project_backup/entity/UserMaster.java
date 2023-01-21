package com.ajd.meow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;

//논리명 사용자정보
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="USER_MSTR")
public class UserMaster {

    @Id
    @Column(name="USER_NO")
    @GeneratedValue(generator = "uuids")
    @GenericGenerator(name= "uuid2", strategy = "uuid")
    private UUID userNo;

    @Column(name="USER_TYPE")
    private String userType;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_PW")
    private String userPassword;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "NICK_NAME")
    private String nickName;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "DETAIL_ADDR")
    private String detailAddress;

    @Column(name = "PHONE_NUM")
    private String phoneNumber;

    @Column(name = "PHONE_TYPE")
    private String phoneType;

    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @Column(name = "INTRODUCE")
    private String introduce;

    @Column(name = "USER_PRF")
    private String userProfile;

    @Column(name = "PRF_IMG_NAME")
    private String profileImageName;

    @Column(name = "PRF_IMG_SIZE")
    private String profileImageSize;

    @Column(name = "USER_JOIN_DATE")
    private LocalDateTime userJoinDate;

    @Column(name = "USER_DELETE_DATE")
    private LocalDateTime userDeleteDate;
}
