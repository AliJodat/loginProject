package org.loginProject.model.generic;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;



@MappedSuperclass
public class BaseEntity<PK extends Serializable> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private PK Id;

    public PK getId() {
        return Id;
    }

    public void setId(PK id) {
        Id = id;
    }
}
