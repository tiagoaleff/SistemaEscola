/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller;

import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Curso;
import br.sistemaescola.object.Professor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.views.CursoJInternalFrame;
import java.util.ArrayList;
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
                    br.sistemaescola.log.Log.gravarMessagem("Erro ao gravar curso : " + ex.getMessage());
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
        
        
        ArrayList<Professor> professores = new ArrayList<>();
        
        Professor gilberto = new Professor();
        gilberto.setNomeProfessor("gilberto");
        professores.add(gilberto);
        
        
        Curso curso = frame.atualizarDados();
        
        /* Verificação do nome do aluno */
        if(curso.getNome().trim().equals("")){
            throw new ExceptionEscola("O nome do usuario deve ser informado"); 
        }
        
        /* verificar Professor Responsavel*/
        boolean professorValido = false;
        for( Professor professor : professores){
            if(professor.getNomeProfessor().equals(curso.getProfessorResponsavel())){
                professorValido = true;
            }
        }
        if(!professorValido){
            throw new ExceptionEscola("O professor informado não existe deve-se informar um professor cadastrado");
        }
        
        
        /* verificar a existencia de uma descrição
           caso não exista cria uma descrição padrão 
        */
        if(curso.getDescricao().trim().equals("")){
            curso.setDescricao("Descrição não informada");
        }
        
        /*verificar a duração do curso*/
        if(!curso.getDuracao().matches("[0-9]+")){
            throw new ExceptionEscola("A duração informada não é valida - somente é aceito numeros");
        }
        
        /*verificar turnos
          deve ser informado um turno para o curso
        */
        if(!(curso.isMatutino() || curso.isVespertino() || curso.isNoturno())){
            throw new ExceptionEscola("Deve ser  marcado pelo menos um dos turnos para o curso");
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
