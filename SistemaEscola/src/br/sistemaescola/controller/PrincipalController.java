/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller;

import br.sistemaescola.exception.ExceptionEscola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.sistemaescola.views.AlunoJInternalFrame;
import br.sistemaescola.views.DisciplinasJInternalFrame;
import br.sistemaescola.views.CursoJInternalFrame;
import br.sistemaescola.views.FaltasJInternalFrame;
import br.sistemaescola.views.GerenciadorFaltasJInternalFrame;
import br.sistemaescola.views.GerenciarNotasJInternalFrame;
import br.sistemaescola.views.NotaJInternalFrame;
import br.sistemaescola.views.ProfessorJInternalFrame;
import br.sistemaescola.views.PrincipalJFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
                {
                    try {
                        criarFrameAluno();
                        br.sistemaescola.log.Log.gravarMessagem("Aberto a janela de Cadastrar e Editar Alunos");
                    } catch (ExceptionEscola ex) {
                        JOptionPane.showMessageDialog(frame, ex.getMessage());
                        br.sistemaescola.log.Log.gravarMessagem(ex.getMessage());
                    }
                }
                break;
            case "professor":
                {
                    try {
                        criarFrameProfessor();
                        br.sistemaescola.log.Log.gravarMessagem("Aberto a janela de Cadastrar e Editar Professores");
                    } catch (ExceptionEscola ex) {
                        JOptionPane.showMessageDialog(frame, ex.getMessage());
                        br.sistemaescola.log.Log.gravarMessagem(ex.getMessage());
                    }
                }
                
                break;
            case "disciplina":
                criarFrameDisciplina();
                br.sistemaescola.log.Log.gravarMessagem("Aberto a janela de Cadastrar e Editar Disciplinas");
                break;
            case "curso":
                criarFrameCurso();
                br.sistemaescola.log.Log.gravarMessagem("Aberto a janela de Cadastrar e Editar Cursos");
                break;
            case "nota":
                criarFrameNotas();
                br.sistemaescola.log.Log.gravarMessagem("Aberto a janela de Cadastrar e Editar Notas");
                break;
            case "falta":
                criarFrameFaltas();
                br.sistemaescola.log.Log.gravarMessagem("Aberto a janela de Cadastrar e Editar Faltas");
                break;
            case "gerenciar notas":
                criarFrameGerenciarNotas();
                br.sistemaescola.log.Log.gravarMessagem("Aberto a janela de Gerenciar Notas");
                break;
            case "gerenciar faltas":
                criarFrameGerenciarFaltas();
                br.sistemaescola.log.Log.gravarMessagem("Aberto a janela de Gerenciar Faltas");
                break;
        } 
    }
       
    public void criarFrameCurso(){
        
        frame.getPrincipalFrame().add(new CursoJInternalFrame()).setVisible(true);
    }

    private void criarFrameGerenciarNotas() {
        frame.getPrincipalFrame().add(new GerenciarNotasJInternalFrame()).setVisible(true);
    }

    private void criarFrameGerenciarFaltas() {
        frame.getPrincipalFrame().add(new GerenciadorFaltasJInternalFrame()).setVisible(true);
    }

    private void criarFrameFaltas() {
       frame.getPrincipalFrame().add(new FaltasJInternalFrame()).setVisible(true);
    }

    private void criarFrameNotas() {
       frame.getPrincipalFrame().add(new NotaJInternalFrame()).setVisible(true);
    }

    private void criarFrameDisciplina() {
        frame.getPrincipalFrame().add(new DisciplinasJInternalFrame()).setVisible(true);
    }

    private void criarFrameProfessor() throws ExceptionEscola{
        
        if(PrincipalJFrame.getJanela()[2]){
            throw new ExceptionEscola("Já existe uma janela professor"); 
        }
        PrincipalJFrame.getJanela()[2] = true;
        frame.getPrincipalFrame().add(new ProfessorJInternalFrame()).setVisible(true);
    }

    private void criarFrameAluno() throws ExceptionEscola{
        
        if(PrincipalJFrame.getJanela()[0]) {
            throw new ExceptionEscola("já existe uma janela aluno aberta");   
        }
        PrincipalJFrame.getJanela()[0] = true;
        frame.getPrincipalFrame().add(new AlunoJInternalFrame()).setVisible(true);
        
    }
    
}
