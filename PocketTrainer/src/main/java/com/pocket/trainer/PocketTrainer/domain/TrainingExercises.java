package com.pocket.trainer.PocketTrainer.domain;


import javax.persistence.*;

@Entity
public class TrainingExercises {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //реализовать эту таблицу через зависимости

}