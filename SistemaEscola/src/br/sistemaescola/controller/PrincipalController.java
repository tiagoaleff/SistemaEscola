/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.views.AlunoJInternalFrame;
import br.sistemaescola.views.DisciplinasJInternalFrame;
import br.sistemaescola.views.CursoJInternalFrame;
import br.sistemaescola.views.FaltasJInternalFrame;
import br.sistemaescola.views.GerenciadorFaltasJInternalFrame;
import br.sistemaescola.views.GerenciarNotasJInternalFrame;
import br.sistemaescola.views.NotaJInternalFrame;
import br.sistemaescola.views.ProfessorJInternalFrame;
import br.sistemaescola.views.PrincipalJFrame;

/**
 * 
 * @author Leandro Justin Vieria
 */
public class PrincipalController implements ActionListener{
    
    private PrincipalJFrame frame;
    
    public PrincipalController( PrincipalJFrame frame){
    
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        
        String action = evt.getActionCommand();
        
        switch(action){
            
            case "aluno":
                criarFrameAluno();
                break;
            case "professor":
                criarFrameProfessor();
                break;
            case "disciplina":
                criarFrameDisciplina();
                break;
            case "curso":
                criarFrameCurso();
                break;
            case "nota":
                criarFrameNotas();
                break;
            case "falta":
                criarFrameFaltas();
                break;
            case "gerenciar notas":
                criarFrameGerenciarNotas();
                break;
            case "gerenciar faltas":
                criarFrameGerenciarFaltas();
                break;
        } 
    }
       
    public void criarFrameCurso(){
        
        frame.getjDesktopPane1().add(new CursoJInternalFrame()).setVisible(true);
    }

    private void criarFrameGerenciarNotas() {
        frame.getjDesktopPane1().add(new GerenciarNotasJInternalFrame()).setVisible(true);
    }

    private void criarFrameGerenciarFaltas() {
        frame.getjDesktopPane1().add(new GerenciadorFaltasJInternalFrame()).setVisible(true);
    }

    private void criarFrameFaltas() {
       frame.getjDesktopPane1().add(new FaltasJInternalFrame()).setVisible(true);
    }

    private void criarFrameNotas() {
       frame.getjDesktopPane1().add(new NotaJInternalFrame()).setVisible(true);
    }

    private void criarFrameDisciplina() {
        frame.getjDesktopPane1().add(new DisciplinasJInternalFrame()).setVisible(true);
    }

    private void criarFrameProfessor() {
        frame.getjDesktopPane1().add(new ProfessorJInternalFrame()).setVisible(true);
    }

    private void criarFrameAluno() {
        frame.getjDesktopPane1().add(new AlunoJInternalFrame()).setVisible(true);
    }   
}
