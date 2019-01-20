package com.pocket.trainer.PocketTrainer.domain;

import javax.persistence.*;

@Entity
public class UserTraining {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //зависимости от таблиц пользователи и тренировки

}
