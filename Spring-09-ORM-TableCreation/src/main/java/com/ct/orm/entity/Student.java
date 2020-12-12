package com.ct.orm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {

    @Id
    private Long Id;
    private String firstName;
    private String lastName;
    private String email;


}
