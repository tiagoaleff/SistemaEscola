/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.swing.JFrame;

/**
 * 
 * @author Leandro Justin Vieira
 */
public class LoginController {
    
    private String password;
    private String user;
        
    public LoginController(String user, String password){
    
        this.password = password;
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }
    
}
