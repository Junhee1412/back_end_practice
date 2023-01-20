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
@Table(name="CMNTY_CLS")
public class CommunityClass {

    @Id
    @Column(name="CMNTY_ID")
    private String communityId;

    @Column(name="CMNTY_TYPE")
    private String communityType;

}
