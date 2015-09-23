/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import config.ConfigUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import views.loginJFrame;
import views.principalJFrame;

/**
 *   
 * @author Leandro Justin Vieira
 */
public class LoginAction implements ActionListener{

   private loginJFrame  loginFrame;

    public LoginAction( loginJFrame loginFrame){
        
        this.loginFrame = loginFrame;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        
             
        String action = evt.getActionCommand();
        System.out.println(action);
       switch (action) {
           case "0":
               verificarConexao( loginFrame.createLoginController() );
               break;
           case "1":
               help();
               break;
       }
    }
    
    private void verificarConexao(LoginController result){
        
        ConfigUser config = new ConfigUser();
                               
        if(!result.getUser().equals(config.getUser())){
            JOptionPane.showMessageDialog(loginFrame, "usuário ou senha incorreta");
             System.out.println("usuario " + result.getUser() + " real" + config.getUser());
            return;
        }
        
        if(!result.getPassword().equals(config.getPassword())){
            JOptionPane.showMessageDialog(loginFrame, "Usuário ou senha incorreta");
            return;
        }        
        
        loginFrame.dispose();
        new principalJFrame().setVisible(true);
    }
    
    private void help(){
        
        String mensagem = 
                " A aplicação tem como funcionalidar gerir um sistema escolar\n"
                + "Para fazer login no programa deve-se informar o nome do usuario"
                + " e sua respectiva senha, nos campos correspondentes\n"
                + "Usuario Admin Senha 1234 (padrão)\n"
                + "Desenvolvedores: Leandro, Tiago e Kadson";
        
        
        JOptionPane.showMessageDialog(loginFrame, mensagem);
    }
    
    
}
