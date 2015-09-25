


import java.awt.Color;
import views.loginJFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Leandro Justin Vieira
 */
public class executar {
    
    public static void main(String args[]){
        
        loginJFrame login = new loginJFrame();
        login.setVisible(true);
        login.getContentPane().setBackground(Color.white);
    }

}
