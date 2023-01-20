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
@Table(name="USER_CLS")
public class UserClass {

    @Id
    @Column(name="USER_TYPE")
    private String userType;

    @Column(name="USER_DESC")
    private int userDescription;
}
