/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.object;

import java.io.Serializable;
import javax.swing.JFrame;

/**
 * 
 * @author Leandro Justin Vieira
 */
public class Login implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String password;
    private String user;
    
    public Login (){
        
    }    
    
    public Login(String user, String password){
    
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
