package org.loginProject.model;

import org.loginProject.model.generic.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity(name = "groupPerson")
@Table(name = "GROUP_PERSON")
public class GroupPerson extends BaseEntity<Long> implements Serializable {


    @Column
    private String role;

    private Personal personal;


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
