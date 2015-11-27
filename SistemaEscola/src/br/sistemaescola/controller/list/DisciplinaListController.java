/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller.list;

import br.sistemaescola.object.Curso;
import br.sistemaescola.object.Disciplina;
import br.sistemaescola.object.Professor;
import br.sistemaescola.views.DisciplinasJInternalFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DisciplinaListController implements ListSelectionListener{

    private DisciplinasJInternalFrame frame;
    
    public DisciplinaListController(DisciplinasJInternalFrame frame){
        this.frame = frame;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        
        String nomeSelecionado = (String) frame.getListaResultadoJList().getSelectedValue();
        
        switch(frame.getListAtual()){
            case "disciplina":
                buscarDisciplina(nomeSelecionado);
                break;
            case "curso":
                buscarCurso(nomeSelecionado);
                break;
            case "professor":
                buscarProfessor(nomeSelecionado);
                break;
        }
        
        frame.getListaResultadoJList().clearSelection();
        
        
    }

    private void buscarDisciplina(String nomeSelecionado) {
        
        boolean disciplinaEncontrada = false;
        Disciplina disciplina = null;
        
        for(Disciplina d : br.sistemaescola.list.DisciplinaList.getListDisciplina()){
            if(d.getNomeDisciplina().equals(nomeSelecionado)){
                disciplinaEncontrada = true;
                disciplina = d;
                break;
            }
        }
        
        if(disciplinaEncontrada){
            frame.getnomeJTextField().setText(disciplina.getNomeDisciplina());
            frame.getCursoJTextField().setText(disciplina.getNomeCurso());
            frame.getProfessorJTextField().setText(disciplina.getNomeProfessor());
            frame.getCreditosJTextField().setText(disciplina.getCreditoDisciplina());
            frame.getTotalHorasJTextField().setText(disciplina.getTotalHorasDisciplina());
            frame.getTotalAlunosJTextField().setText(disciplina.getTotalAlunosDisciplina());
        }
    }

    private void buscarCurso(String nomeSelecionado) {
        boolean cursoEncontrado = false;
        Curso curso = null;
        
        for(Curso c : br.sistemaescola.list.CursoList.getListCurso()){
            if(c.getNome().equals(nomeSelecionado)){
                cursoEncontrado = true;
                curso = c;
                break;
            }
        }
        
        if(cursoEncontrado){
            frame.getCursoJTextField().setText(curso.getNome());
        }
    }

    private void buscarProfessor(String nomeSelecionado) {
        
        boolean professorEncontrado = false;
        Professor professor = null;
        
        for(Professor p : br.sistemaescola.list.ProfessorList.getListProfessor()){
            if(p.getNomeProfessor().equals(nomeSelecionado)){
                professorEncontrado = true;
                professor = p;
                break;
            }
        }
        if(professorEncontrado){
            frame.getProfessorJTextField().setText(professor.getNomeProfessor());
        }
    }
}
