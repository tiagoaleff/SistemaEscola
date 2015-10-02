/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.AlunoJInternalFrame;



/**
 *
 * @author comp1
 */
public class AlunoController  implements ActionListener{
    private AlunoJInternalFrame frame;
    
    public AlunoController(AlunoJInternalFrame frame){
        this.frame = frame;
    }
    
    public void actionPerformed(ActionEvent e) {
        
        String action = e.getActionCommand();
        
        switch(action){
            case "salvar":
                salvar();
                break;
            case "limpar":
                limpar();
                break;
            case "cancelar":
                cancelar();
                break;
            case "buscar_id":
                buscar_id();
                break;
            case "buscar_nome":
                buscar_nome();
                break;
        }
        
    
    }
    
    private void salvar(){
        JOptionPane.showMessageDialog(frame, "salvar");
    }
    private void limpar(){
        JOptionPane.showMessageDialog(frame, "limpar");
    }
    
    private void cancelar(){
        JOptionPane.showMessageDialog(frame, "cancelar");
        frame.dispose();
    }
    private void buscar_id(){
        JOptionPane.showMessageDialog(frame, "buscar id");
    }
    private void buscar_nome(){
        JOptionPane.showMessageDialog(frame, "buscar_nome");
    }
    
}
