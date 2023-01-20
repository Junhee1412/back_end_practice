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
@Table(name="DNTN_WAYCLS")
public class DonateWayClass {

    @Id
    @Column(name = "DNTN_WAYCODE")
    private String donateWayCode;

    @Column(name = "DNTN_WAY")
    private String donateWay;
}
