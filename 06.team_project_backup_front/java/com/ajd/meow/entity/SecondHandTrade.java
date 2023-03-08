package com.ajd.meow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

//논리명 중고거래
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="SCND_HNDTR")
public class SecondHandTrade {

    @Id
    @Column(name="POST_NO")
    private Long postNo;

    @Column(name="PRICE")
    private int price;

    //230306 추가
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name="post_no" ,insertable = false, updatable = false)
    private CommunityMaster communityMaster;
}
