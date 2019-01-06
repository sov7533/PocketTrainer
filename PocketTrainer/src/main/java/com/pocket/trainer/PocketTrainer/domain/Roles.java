package com.pocket.trainer.PocketTrainer.domain;

import javax.persistence.*;

@Entity
@Table(name = "ROLES")

public class Roles {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    /*@ManyToMany
    @JoinTable(name = "USERROLE"),
    joinColumns = @JoinColumn(name = "ROLESID"),
    inverseJoinColumns = @JoinColumn(name = "USERSID")
    private List<Users> users;
    */

}