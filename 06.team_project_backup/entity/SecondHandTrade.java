package com.ajd.meow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

//논리명 중고거래
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="SCND_HNDTR")
public class SecondHandTrade {

    @Column(name="USER_NO")
    private UUID userNo;

    @Id
    @Column(name="POST_NO")
    private String postNo;

    @Column(name="PRICE")
    private int price;
}
