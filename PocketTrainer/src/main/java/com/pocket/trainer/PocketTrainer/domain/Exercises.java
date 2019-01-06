package com.pocket.trainer.PocketTrainer.domain;

import javax.persistence.*;

@Entity
@Table(name = "EXERCISES")
public class Exercises {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;

}
