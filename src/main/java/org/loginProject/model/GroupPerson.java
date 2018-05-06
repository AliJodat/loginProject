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
    private String userRole;

    @ManyToOne
    @JoinColumn(name = "roleId")
    private Personal personal;

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
