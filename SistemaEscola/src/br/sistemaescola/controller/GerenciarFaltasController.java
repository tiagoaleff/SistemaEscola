/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.views.GerenciadorFaltasJInternalFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GerenciarFaltasController implements ActionListener{

    private GerenciadorFaltasJInternalFrame frame;

    public GerenciarFaltasController(GerenciadorFaltasJInternalFrame frame) {
        this.frame = frame;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        String action = e.getActionCommand();
        
        switch(action){
            
            case "buscar_id":
                buscar_id();
                break;
            case "buscar_nome":
                buscar_nome();
                break;
        }
    
       
        }
     private void buscar_id(){
            JOptionPane.showMessageDialog(frame, "buscar_id");
     }
     private void buscar_nome(){
            JOptionPane.showMessageDialog(frame, "buscar_nome");
        
    }
    
    
    

}
