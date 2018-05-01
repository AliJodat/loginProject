package org.loginProject.model;

import org.loginProject.model.generic.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Ali
 * Create on 4/18/2018 10:51 PM
 */

@Entity
@Table(name = "GROUP_PERSON")
public class GroupPerson extends BaseEntity<Long> implements Serializable {

    @Column
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
/*    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }*/
}
