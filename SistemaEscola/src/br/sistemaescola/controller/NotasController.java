/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.views.NotaJInternalFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class NotasController implements ActionListener{

    private NotaJInternalFrame frame;

    public NotasController(NotaJInternalFrame frame) {
        this.frame = frame;
    }
    
    @Override
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
            case "buscar_aluno":
                buscar_aluno();
                break;
            case "buscar_professor":
                buscar_professor();
                break;
            case "buscar_disciplina":
                buscar_disciplina();
                break;
        }
        
    }
    private void salvar(){
        JOptionPane.showMessageDialog(frame, "salvar");
    }
    private void limpar(){
        JOptionPane.showMessageDialog(frame, "limpar");
    }
    private  void cancelar(){
        JOptionPane.showMessageDialog(frame, "cancelar");
    }
    private void buscar_aluno(){
        JOptionPane.showMessageDialog(frame, "buscar_aluno");
    }
    private void buscar_professor(){
        JOptionPane.showMessageDialog(frame, "buscar_prifessor");
    }
    private void buscar_disciplina(){
        JOptionPane.showMessageDialog(frame, "buscar_disciplina");
    }
}
