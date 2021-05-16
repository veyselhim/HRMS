package com.example.hrmsdemo.entities.concretes;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="job_titles")
public class JobTitle {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int Id;

    @Column(name="title")
    private String title;


}
