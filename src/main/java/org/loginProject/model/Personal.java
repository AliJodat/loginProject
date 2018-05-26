package org.loginProject.model;

import org.loginProject.model.generic.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity(name = "personal")
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

    @Column(unique = true)
    private Integer code;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_role")
    private Set<GroupPerson> roles;


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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Set<GroupPerson> getRoles() {
        return roles;
    }

    public void setRoles(Set<GroupPerson> roles) {
        this.roles = roles;
    }
}
