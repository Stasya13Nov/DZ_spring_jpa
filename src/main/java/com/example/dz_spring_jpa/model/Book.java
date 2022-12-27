package com.example.dz_spring_jpa.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@NoArgsConstructor
@Entity
@Table(name = "book")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fio")
    private String fio;
    @Column(name = "name")
    private String name;
    @Column(name = "ageofedition")
    private int ageOfEdition;
    @Column(name = "style")
    private String style;
    @Column(name = "countofpage")
    private int countOfPage;
}
