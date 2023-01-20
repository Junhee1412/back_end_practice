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
@Table(name="CMNTY_IMG")
public class CommunityImage {

    @Id
    @Column(name="POST_NO")
    private Long postNo;

    @Id
    @Column(name="USER_NO")
    @GeneratedValue(generator = "uuids")
    @GenericGenerator(name= "uuid2", strategy = "uuid")
    private UUID userNo;

    @Column(name="THUM_NAIL_IMG_ADR")
    private String thumbnailImageAddress;

    @Column(name="IMG_ADR")
    private String imageAddress;

    @Column(name="IMG_NAME")
    private String imageName;

    @Column(name="IMG_SIZE")
    private String imageSize;
}
