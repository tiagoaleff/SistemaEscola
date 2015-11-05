/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller;

import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Curso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.views.CursoJInternalFrame;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Leandro Justin Vieira
 */
public class CursoController implements ActionListener{

    private CursoJInternalFrame frame;

    public CursoController(CursoJInternalFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
     
        String action = evt.getActionCommand();
        
        switch(action){
            
            case "salvar":
                
                try {
                    salvarDados();
                } catch (ExceptionEscola ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage());
                    br.sistemaescola.log.Log.gravarMessagem("Erro ao gravar : " + ex.getMessage());
                }
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

    private void salvarDados() throws ExceptionEscola{
        
        Curso curso = frame.atualizarDados();

        if(curso.getNome().trim().equals("")){
            throw new ExceptionEscola("O nome do usuario deve ser informado"); 
        }
      
        
        
        
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
