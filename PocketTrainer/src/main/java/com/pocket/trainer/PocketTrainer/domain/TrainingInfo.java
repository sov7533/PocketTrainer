package com.pocket.trainer.PocketTrainer.domain;

import javax.persistence.*;

@Entity
public class TrainingInfo {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @Column(name = "name")
//    private String name;

    @Column(name = "trhead")
    private String trhead;

    @Column(name = "trbody")
    private String trbody;

    public String getTrhead() {
        return trhead;
    }

    public void setTrhead(String trhead) {
        this.trhead = trhead;
    }

    public String getTrbody() {
        return trbody;
    }

    public void setTrbody(String trbody) {
        this.trbody = trbody;
    }
}
