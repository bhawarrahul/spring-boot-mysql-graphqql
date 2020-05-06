package com.graphql.mysql.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String studentId;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private int age;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Gender gender;
    @Email
    @Size(max = 100)
    @Column(unique = true)
    private String email;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Address address;

}

enum Gender {
    MALE,
    FEMALE
}