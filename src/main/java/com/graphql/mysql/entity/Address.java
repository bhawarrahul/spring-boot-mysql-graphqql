package com.graphql.mysql.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "address1")
    private String addressLine1;
    @Column(name = "address2")
    private String addressLine2;
    private String city;
    private String State;
    private String country;
    private int pinCode;
}
