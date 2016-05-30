/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate;

/**
 *
 * @author sampada kaushal
 */
public class pojo {
     private String name;
    private String password;
    private String email;
   // private int id;
    public String getName() {
        return name;
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
}
