package org.loginProject.model;

import org.loginProject.model.generic.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Ali
 * Create on 4/18/2018 10:49 PM
 */

@Entity
@SequenceGenerator(sequenceName = "Group_Person_Seq", name = "groupPersonSeq", allocationSize = 1)
public class Personal extends BaseEntity implements Serializable {

    @Column
    private String name;
    @Column
    private String family;

    @Id
    @Column
    private String username;
    @Column
    private String password;

    @ManyToOne
    @JoinColumn(name = "id")
    private GroupPerson GroupPerson;


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

    public org.loginProject.model.GroupPerson getGroupPerson() {
        return GroupPerson;
    }

    public void setGroupPerson(org.loginProject.model.GroupPerson groupPerson) {
        GroupPerson = groupPerson;
    }
}
