package com.school.jsf;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "T_USERS", schema = "APP")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id @GeneratedValue
    private long id;
    
    private String username;
    
    private String password;
    
    private Boolean isAdmin;
    
    @ValidEmailAddress
    private String emailAddress;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getEmailAddress() {
		return emailAddress;
	}

    public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
