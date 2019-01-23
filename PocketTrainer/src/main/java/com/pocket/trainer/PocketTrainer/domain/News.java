package com.pocket.trainer.PocketTrainer.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class News {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "HEAD")
    private String head;

    @Column(name = "BODY")
    private String body;

    @Column(name = "DATE")
    private LocalDate date;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
