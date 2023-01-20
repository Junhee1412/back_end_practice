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
@Table(name="DNTN_STATECLS")
public class DonateStateClass {

    @Id
    @Column(name = "DNTN_STATECODE")
    private String donateStateCode;

    @Column(name = "DNTN_STATE")
    private String donateState;
}
