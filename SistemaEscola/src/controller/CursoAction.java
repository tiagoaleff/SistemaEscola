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

/**
 * 
 * @author Leandro Justin Vieira
 */
public class CursoAction implements ActionListener{

    private CursoJInternalFrame frame;

    public CursoAction(CursoJInternalFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
     
        String action = evt.getActionCommand();
        
        switch(action){
            
            case "salvar":
                salvarDados();
                break; 
            case "cancelar":
                cancelarFechar();
                break;
            case "limpar":
                limparFormulario();
                break;
            case "pesquisarNome":
                pesquisaNome();
                break;
            case "pesquisarProfessor":
                pesquisarProfessor();
                break;
            case "pesquisarId":
                pesquisarId();
                break;   
        } 
    }

    private void salvarDados() {
        JOptionPane.showMessageDialog(frame, "salvarDados");
    }

    private void cancelarFechar() {
        frame.dispose();
    }

    private void limparFormulario() {
        JOptionPane.showMessageDialog(frame, "limpar");
    }

    private void pesquisaNome() {
        JOptionPane.showMessageDialog(frame, "pesquisarNome");
    }

    private void pesquisarProfessor() {
        JOptionPane.showMessageDialog(frame, "pesquisarProfessor");
    }

    private void pesquisarId() {
        JOptionPane.showMessageDialog(frame, "pesquisarId");
    }
}
