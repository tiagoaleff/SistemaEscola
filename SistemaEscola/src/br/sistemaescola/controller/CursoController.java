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
    private Curso curso;

    public CursoController(CursoJInternalFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
     
        curso = frame.atualizarDados(); 
        String action = evt.getActionCommand();
        
        switch(action){
            
            case "salvar":
                
                try {
                    verificarDados();
                    JOptionPane.showMessageDialog(frame, "Curso salvo com sucesso");
                    br.sistemaescola.log.Log.gravarMessagem("Curso salvo com sucesso ");
                    limparFormulario();
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
        } 
    }

    private void verificarDados() throws ExceptionEscola{
        
        
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
        
        
        /*verifica se o Curso já não existe*/
        for (Curso cursos : br.sistemaescola.list.CursoList.getListCurso()){
            if(cursos.getNome().equals(curso.getNome())){
              
                int confirma = JOptionPane.showConfirmDialog(frame, "Já existe um curso com esse nome você"
                        + " deseja sobre escrever o curso?");
                
                switch(confirma){
                    case 0:
                        edit(cursos);
                        limparFormulario();
                        throw new ExceptionEscola("O curso foi editado");
                    default:
                        throw new ExceptionEscola("já existe um curso com esse nome troque o nome do "
                                + "curso ou sobreescreva o mesmo");         
                }  
            }
        }    
        salvar(curso);   
          
    }

    private void cancelarFechar() {
        frame.dispose();
    }

    private void limparFormulario() {  
       frame.getNomeJTextField().setText("");
       frame.getProfessorJTextField().setText("");
       frame.getDescricaoJTextArea().setText("");
       frame.getDuracaoJTextField().setText("");
       frame.getNoturnoJCheckBox().setSelected(false);
       frame.getMatutinoJCheckBox().setSelected(false);
       frame.getVespertinoJCheckBox().setSelected(false);
       frame.getJListResultado().setModel(new DefaultListModel());
    }   
       
    private void pesquisaNome() {
        
        String nomeCursoPesquisa = frame.getCursoPesquisa();
            DefaultListModel dm = new DefaultListModel();

            for( Curso curso :  br.sistemaescola.list.CursoList.getListCurso()){
                   if(curso.getNome().matches(".*" + nomeCursoPesquisa + ".*")){
                       dm.addElement(curso.getNome());     
                   }
            }       
        frame.getJListResultado().setModel(dm);
        frame.setListaAtual("curso");
        
    }
    
    private void pesquisarProfessor() {
        DefaultListModel dm = new DefaultListModel();
   
        for( Professor professor :  br.sistemaescola.list.ProfessorList.getListProfessor()){
               if(professor.getNomeProfessor().matches(".*" + curso.getProfessorResponsavel() + ".*")){
                   dm.addElement(professor.getNomeProfessor());     
               }
        }       
        frame.getJListResultado().setModel(dm);
        frame.setListaAtual("professor");
    }

    private void salvar(Curso curso) {
        br.sistemaescola.list.CursoList.addCurso(curso);
    }  
    
    private void edit(Curso c) {
       c.setDescricao(curso.getDescricao());
       c.setDuracao(curso.getDuracao());
       c.setMatutino(curso.isMatutino());
       c.setNome(curso.getNome());
       c.setNoturno(curso.isNoturno());
       c.setProfessorResponsavel(curso.getProfessorResponsavel());
       c.setVespertino(curso.isVespertino());
    }
   
}
