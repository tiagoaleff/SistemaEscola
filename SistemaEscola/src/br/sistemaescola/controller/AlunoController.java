/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemaescola.controller;

import br.sistemaescola.exception.ExceptionAluno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.sistemaescola.object.Aluno;

import br.sistemaescola.views.AlunoJInternalFrame;



/**
 *
 * @author comp1
 */
public class AlunoController  implements ActionListener{
    private AlunoJInternalFrame frame;
    private ArrayList<Aluno> cadastroProfessor = new ArrayList<Aluno>();
    private Aluno aluno;
    
    public AlunoController(AlunoJInternalFrame frame){
        this.frame = frame;
    }
    
    public void actionPerformed(ActionEvent e) {
        
        String action = e.getActionCommand();
        
        switch(e.getActionCommand()){
            case "buscarIdJButton":
                  break;
            case "salvarJButton":
                JOptionPane.showMessageDialog(null, "Salva com Sucesso");
                salvar();
                break;
            case "limparJButton":
                JOptionPane.showMessageDialog(null, "Limpo");
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
        frame.setAluno();
        aluno = frame.getAluno();
        
        
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
    
    public void validarInformacoesaluno(Aluno aluno)throws ExceptionAluno{
        if(aluno.getAlunoCelular().trim().equals("") || aluno.getNomeAluno() == null) {

            throw new ExceptionAluno("O campo Nome não pode estar vazio.");
        }
        if(aluno.getAlunoEmail().trim().equals("") || aluno.getAlunoEmail() == null){
           
            throw new ExceptionAluno("O campo CPF não pode estar vazio.");
        }
        if(aluno.getAlunoTelefone().trim().equals("") || aluno.getAlunoTelefone() == null){
            
            throw new ExceptionAluno("O campo Telefone não pode estar vazio.");
        }
        if(aluno.getBairro().trim().equals("") || aluno.getBairro() == null){
            throw new ExceptionAluno("O campo bairro não pode estar vazio");
        }
    }


}
