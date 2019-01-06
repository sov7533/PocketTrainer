package com.pocket.trainer.PocketTrainer.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "USERS")
public class Users {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "FIRSTNAME")
    private String firsname;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "WEIGHT")
    private Integer weight;

    @Column(name = "GROWTH")
    private Integer growth;

    @Column(name = "LEVEL")
    private Integer level ;

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    //    @ManyToMany
//    //@JoinTable(name = "USERROLE"),
//    //joinColumns = @JoinColumn(name = "USERSID"),
//    //inverseJoinColumns = @JoinColumn(name = "ROLESID")
//    private List<Roles> user;
//
//    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
//    private Collection<UserTraining> training;

}
