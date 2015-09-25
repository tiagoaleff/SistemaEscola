/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.CursoJInternalFrame;
import views.principalJFrame;

/**
 * 
 * @author Leandro Justin Vieria
 */
public class PrincipalAction implements ActionListener{
    
    private principalJFrame frame;
    
    public PrincipalAction( principalJFrame frame){
    
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        
        String action = evt.getActionCommand();
        
        switch(action){
            
            case "aluno":
                JOptionPane.showMessageDialog(frame, "teste de conexão com action do aluno");
                break;
            case "professor":
                JOptionPane.showMessageDialog(frame, "teste de conexão com action do professor");
                break;
            case "disciplina":
                JOptionPane.showMessageDialog(frame, "teste de conexão com action do Disciplina");
                break;
            case "curso":
                criarFrameCurso();
                break;
            case "nota":
                JOptionPane.showMessageDialog(frame, "teste de conexão com action do nota");
                break;
            case "falta":
                JOptionPane.showMessageDialog(frame, "teste de conexão com action do falta");
                break;
        }
        
        
        
        
    }
    
    public void criarJanelaInternalFrame(){
        /*
        if(teste == null){
            teste = new testeJInternalFrame();    
        }
        
        jDesktopPane1.add(teste);
        teste.setVisible(true);
        */    
    }
    
    public void criarFrameCurso(){
        
        frame.getjDesktopPane1().add(new CursoJInternalFrame()).setVisible(true);
    }
   
}
