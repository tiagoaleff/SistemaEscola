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
import javax.swing.DefaultListModel;

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
                    JOptionPane.showMessageDialog(frame, "O curso foi salvo com sucesso");
                    br.sistemaescola.log.Log.gravarMessagem("Curso salvo com sucesso ");
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
        
        Curso curso = frame.atualizarDados();
        
        /* Verificação do nome do aluno */
        if(curso.getNome().trim().equals("")){
            throw new ExceptionEscola("O nome do curso deve ser informado"); 
        }
        
        /* verificar Professor Responsavel*/
        boolean professorValido = false;
        for( Professor professor : br.sistemaescola.list.ProfessorList.getListProfessor()){
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
        
        br.sistemaescola.list.CursoList.addCurso(curso);
        
        
    }

    private void cancelarFechar() {
        frame.dispose();
    }

    private void limparFormulario() {
       
       JOptionPane.showMessageDialog(frame, "limpar dados do Formulario!");
       
    }

    private void pesquisaNome() {
        
        JOptionPane.showMessageDialog(frame, "A função não está completa você ainda "
                + "nao consegue editar o que voce informou mas nao fique triste "
                + "pode ver os cursos que você informou até o momento no "
                + "campo Resultado da pesquisa");
    
        String nomeCursoPesquisa = frame.getCursoPesquisa();
            DefaultListModel dm = new DefaultListModel();

            for( Curso curso :  br.sistemaescola.list.CursoList.getListCurso()){
                   if(curso.getNome().matches(".*" + nomeCursoPesquisa + ".*")){
                       dm.addElement(curso.getNome());     
                   }
            }       
        frame.getJListResultado().setModel(dm);       
    }
    
    private void pesquisarProfessor() {
        
        /*Busca os professores que combinam com o nome
          informado no formulario e os joga na lista
        */
        
        String nomeProfessorPesquisa = frame.getProfessorPesquisar(); 
        DefaultListModel dm = new DefaultListModel();
   
        for( Professor professor :  br.sistemaescola.list.ProfessorList.getListProfessor()){
               if(professor.getNomeProfessor().matches(".*" + nomeProfessorPesquisa + ".*")){
                   dm.addElement(professor.getNomeProfessor());     
               }
        }       
        frame.getJListResultado().setModel(dm);       
    }

    private void pesquisarId() {
        JOptionPane.showMessageDialog(frame, "Desculpe ainda não foi implementado essa opção :(");
    }
}
