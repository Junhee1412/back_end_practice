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
@Table(name="CRCRD_PYMNT")
public class CreditcardPayment {

    @Id
    @Column(name = "DNTN_CODE")
    private String donateCode;

    @Id
    @Column(name="USER_NO")
    @GeneratedValue(generator = "uuids")
    @GenericGenerator(name= "uuid2", strategy = "uuid")
    private UUID userNo;

    @Column(name = "BANK")
    private String bank;

    @Column(name = "ACCOUNT")
    private String account;

    @Column(name = "CVC")
    private int cvc;

    @Column(name = "VLDT_PRD")
    private int validityPeriod;

    @Column(name = "CRCRD_PASS")
    private int creditcardPassword;

}
