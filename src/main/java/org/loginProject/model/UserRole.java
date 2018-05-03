package org.loginProject.model;

/**
 * @author Ali
 * Create on 5/3/2018 11:10 PM
 */
public enum UserRole {

    ADMIN(1,"AdminRole"),
    USER(2,"UserRole");

    private final int  status;
    private final String description;

    UserRole(int status, String description) {
        this.status = status;
        this.description = description;
    }

    public int status(){
        return this.status;
    }

    public String description(){
        return this.description;
    }
}
