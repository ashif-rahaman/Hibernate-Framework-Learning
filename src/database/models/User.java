/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ashif
 */
@Entity
@Table(name = "USER_INFO")
public class User implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private long userId ;
    
    @Column(name = "USER_NAME")
    private String userName ;
    
    @Column(name = "PASSWORD")
    private String password ;

    public User() {
        
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
