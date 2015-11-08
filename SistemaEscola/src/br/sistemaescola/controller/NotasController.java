/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller;

import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Aluno;
import br.sistemaescola.object.Curso;
import br.sistemaescola.object.Disciplina;
import br.sistemaescola.object.Nota;
import br.sistemaescola.object.Professor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.views.NotaJInternalFrame;
import javax.swing.DefaultListModel;

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
                try {
                    salvar();
                    br.sistemaescola.log.Log.gravarMessagem("Nota Salva com Sucesso");
                    JOptionPane.showMessageDialog(frame, "Nota Salva com Sucesso");
                } catch (ExceptionEscola ex) {
                    br.sistemaescola.log.Log.gravarMessagem("Erro ao gravar : " + ex.getMessage());
                    JOptionPane.showMessageDialog(frame, ex.getMessage());
                }
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
    
    private void salvar() throws ExceptionEscola{
        
        Nota nota = frame.atualizar();
        
        /*Verificação de aluno é existente*/
        boolean alunoVerificado = false;
        for(Aluno aluno : br.sistemaescola.list.AlunoList.getListAluno()){
            if(nota.getNome().equals(aluno.getNomeAluno())){
                alunoVerificado = true;
            }
        }
        if(!alunoVerificado){
            throw new ExceptionEscola("O Aluno deve ser valido - você pode usar"
                    + " o botao de pesquisar para procurar o aluno");
        }
        
        /*verificação se professor é existente*/
        boolean professorVerificado = false;
        for(Professor professor : br.sistemaescola.list.ProfessorList.getListProfessor()){
            if(nota.getProfessor().equals(professor.getNomeProfessor())){
                professorVerificado = true;
            }
        }
        if(!professorVerificado){
            throw new ExceptionEscola("O professor deve ser valido - você pode usar"
                    + " o botao de pesquisar para procurar o professor");
        }
        
        /*verificação se Disciplina é existente*/
        boolean disciplinaVerificacao = false;
        for(Disciplina disciplina : br.sistemaescola.list.DisciplinaList.getListDisciplina()){
           if(nota.getDisciplicina().equals(disciplina.getNomeDisciplina())){
               
               disciplinaVerificacao = true;
               
               /*Verificar se o professor é lecionada pelo professor*/
               if(!nota.getProfessor().equals(disciplina.getNomeProfessor())){
                   throw new ExceptionEscola("O professor selecionado não leciona essa disciplina");
               }
               
           } 
        }
        if(!disciplinaVerificacao){
            throw new ExceptionEscola("A disciplina deve ser valida - você pode usar"
                    + " o botao de pesquisar para procurar a disciplina");
        }
        
        
        
        /*verificar se o peso é valido ele deve estar entre 1 e 10*/
        if(nota.getPeso().matches("^\\d*\\d+[\\.]*[\\d]*$")){
            Double peso = Double.parseDouble(nota.getPeso());
            if(!( 1 <= peso && peso <= 10)){
                throw new ExceptionEscola("O peso informado deve estar entre 1 e 10");
            }    
        }else{
            throw new ExceptionEscola("O peso informado é invalido tente novamente");
        }
        
        /*verificar se a nota é valida*/
        if(nota.getNota().matches("^\\d*\\d+[\\.]*[\\d]*$")){
            Double avaliacao = Double.parseDouble(nota.getNota());
            if(!( 0 <= avaliacao && avaliacao <= 10)){
                throw new ExceptionEscola("A nota não deve ser menor que 0 nem maior que 10");
            }    
        }else{
            throw new ExceptionEscola("A nota informado é invalido tente novamente");
        }
        
        br.sistemaescola.list.NotaList.addNota(nota);
        
    }
    
    private void limpar(){
        
        JOptionPane.showMessageDialog(frame, "limpar os dados ainda não implementado");
        
    }
    
    private  void cancelar(){
        
        frame.dispose();
        
    }
    
    private void buscar_aluno(){
        
                JOptionPane.showMessageDialog(frame, "A função não está completa você ainda "
                + "nao consegue editar o que voce informou mas nao fique triste "
                + "pode ver os alunos que você informou até o momento no "
                + "campo Resultado da pesquisa");
    
        String nomeAlunoPesquisa = frame.getAlunoPesquisa();
            DefaultListModel dm = new DefaultListModel();

            for( Aluno aluno :  br.sistemaescola.list.AlunoList.getListAluno()){
                   if(aluno.getNomeAluno().matches(".*" + nomeAlunoPesquisa + ".*")){
                       dm.addElement(aluno.getNomeAluno());     
                   }
            }       
        frame.getResultJList().setModel(dm); 
    }
    
    private void buscar_professor(){
        
        JOptionPane.showMessageDialog(frame, "A função não está completa você ainda "
                + "nao consegue editar o que voce informou mas nao fique triste "
                + "pode ver os professores que você informou até o momento no "
                + "campo Resultado da pesquisa");
    
        String nomeProfessorPesquisa = frame.getProfessorPesquisa();
            DefaultListModel dm = new DefaultListModel();

            for( Professor professor :  br.sistemaescola.list.ProfessorList.getListProfessor()){
                   if(professor.getNomeProfessor().matches(".*" + nomeProfessorPesquisa + ".*")){
                       dm.addElement(professor.getNomeProfessor());     
                   }
            }       
        frame.getResultJList().setModel(dm);     
    }
    
    private void buscar_disciplina(){
        JOptionPane.showMessageDialog(frame, "A função não está completa você ainda "
                + "nao consegue editar o que voce informou mas nao fique triste "
                + "pode ver as Disciplinas que você informou até o momento no "
                + "campo Resultado da pesquisa");
    
        String nomeDisciplinaPesquisa = frame.getDisciplinaPesquisa();
            DefaultListModel dm = new DefaultListModel();

            for( Disciplina disciplina :  br.sistemaescola.list.DisciplinaList.getListDisciplina()){
                   if(disciplina.getNomeDisciplina().matches(".*" + nomeDisciplinaPesquisa + ".*")){
                       dm.addElement(disciplina.getNomeDisciplina());     
                   }
            }       
        frame.getResultJList().setModel(dm);       
    }
}
