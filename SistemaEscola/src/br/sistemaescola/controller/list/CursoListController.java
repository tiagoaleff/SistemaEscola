/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller.list;
import br.sistemaescola.object.Curso;
import br.sistemaescola.object.Professor;
import br.sistemaescola.views.CursoJInternalFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CursoListController implements ListSelectionListener{

    private CursoJInternalFrame frame;    

    public CursoListController(CursoJInternalFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
         
        String nomeSelecionado = (String) frame.getJListResultado().getSelectedValue();
 
        if(frame.getListaAtual().equals("professor")){
            buscaProfessor(nomeSelecionado);
        }
        
        if(frame.getListaAtual().equals("curso")){
            buscaCurso(nomeSelecionado);
        }
        
        frame.getJListResultado().clearSelection();
    }

    private void buscaProfessor(String nome) {
        
        boolean professorEncontrado = false;
        Professor professor = null;
        
        for(Professor p : br.sistemaescola.list.ProfessorList.getListProfessor()){
            if(p.getNomeProfessor().equals(nome)){
                professorEncontrado = true;
                professor = p;
                break;
            }
        }
        
        if(professorEncontrado){
            frame.getProfessorJTextField().setText(professor.getNomeProfessor());
        }  
    }

    private void buscaCurso(String nomeSelecionado) {
       
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
            frame.getIdJTextField().setText(String.valueOf(curso.getId()));
            frame.getNomeJTextField().setText(curso.getNome());
            frame.getProfessorJTextField().setText(curso.getProfessorResponsavel());
            frame.getDuracaoJTextField().setText(curso.getDuracao());
            frame.getDescricaoJTextArea().setText(curso.getDescricao());
            frame.getNoturnoJCheckBox().setSelected(curso.isNoturno());
            frame.getMatutinoJCheckBox().setSelected(curso.isMatutino());
            frame.getVespertinoJCheckBox().setSelected(curso.isVespertino());
        }
    }

}
