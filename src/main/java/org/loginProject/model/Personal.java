package org.loginProject.model;

import org.loginProject.model.generic.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "PERSONAL")
public class Personal extends BaseEntity<Long> implements Serializable {

    @Column
    private String name;
    @Column
    private String family;


    @Column(unique = true)
    private String username;
    @Column
    private String password;
    /*
    @ManyToOne*/
    @Column
    private String role;

    @Column(unique = true)
    private Integer code;

 /*
    @JoinColumn(name = "id")
    private GroupPerson GroupPerson;*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
/*
    public org.loginProject.model.GroupPerson getGroupPerson() {
        return GroupPerson;
    }

    public void setGroupPerson(org.loginProject.model.GroupPerson groupPerson) {
        GroupPerson = groupPerson;
    }*/

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}