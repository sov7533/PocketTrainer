package com.pocket.trainer.PocketTrainer.domain;


import javax.persistence.*;

@Entity
@Table(name = "LEVEL")
public class Level {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@Column(name = "ID _EXERCISES") реализовать связь с таб упражнения;

    @Column(name = "NUMBER")
    private Integer num;

    @Column(name = "QUANTITY")
    private Integer quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
