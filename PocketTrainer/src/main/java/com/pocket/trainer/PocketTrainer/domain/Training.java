package com.pocket.trainer.PocketTrainer.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TRAINING")

public class Training {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "Date")
    private Date date;

}
