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
    private String userRoleString;

    @ManyToOne
    private Personal personal;


    public void setUserRoleString(String userRoleString) {
        this.userRoleString = userRoleString;
    }

    public String getUserRoleString() {
        return userRoleString;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
