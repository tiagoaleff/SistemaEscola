/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import config.ConfigUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.principalJFrame;

/**
 *   
 * @author Leandro Justin Vieira
 */
public class LoginAction implements ActionListener{

    @Override
    
    public void actionPerformed(ActionEvent evt) {
        
        
       LoginController login = (LoginController) evt.getSource();       
       
       String action = evt.getActionCommand();
         
       if (action.equals("ENTRAR")){
           verificarConexao(login);
       }else{
           JOptionPane.showMessageDialog(null, "Action não informada");
       }
    }
    
    private void verificarConexao(LoginController login){
        
        ConfigUser user = new ConfigUser();
                               
        if(!login.getUser().equals(user.getUser())){
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta");
            return;
        }
        
        if(!login.getPassword().equals(user.getPassword())){
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta");
            return;
        }        
        
        login.getLogin().dispose();
        new principalJFrame().setVisible(true);
    }
    
}
