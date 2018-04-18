package org.loginProject.model;

import javax.persistence.*;

/**
 * @author Ali
 * Create on 4/18/2018 10:51 PM
 */

@Entity
public class GroupPerson {

    @Id
    @SequenceGenerator(sequenceName = "Group_Person_Seq", name = "groupPersonSeq", allocationSize = 1)
    @GeneratedValue( strategy = GenerationType.IDENTITY, generator = "groupPersonSeq")
    private Integer id;

    @Column
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
