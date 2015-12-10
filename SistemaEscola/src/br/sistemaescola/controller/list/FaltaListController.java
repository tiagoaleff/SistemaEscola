/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller.list;

import br.sistemaescola.object.Aluno;
import br.sistemaescola.object.Curso;
import br.sistemaescola.object.Disciplina;
import br.sistemaescola.views.FaltasJInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FaltaListController implements ListSelectionListener{
    
    private FaltasJInternalFrame frame;
    
    public FaltaListController(FaltasJInternalFrame frame){
        this.frame = frame;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        
        String nomeSelecionado = (String) frame.getResultadoJList().getSelectedValue();
        
        if(frame.getListaAtual().equals("aluno")){
            buscarAluno(nomeSelecionado);
        }
        
        if(frame.getListaAtual().equals("curso")){
            buscarCurso(nomeSelecionado);
        }
        
        if(frame.getListaAtual().equals("disciplina")){
            buscarDisciplina(nomeSelecionado);
        }
        
        frame.getResultadoJList().clearSelection();
        
    }

    private void buscarAluno(String nomeSelecionado) {
        for(Aluno a : br.sistemaescola.list.AlunoList.getListAluno()){
            if(a.getNomeAluno().equals(nomeSelecionado)){
                frame.getAlunoJTextField().setText(nomeSelecionado);
                frame.setIdAluno(a.getIdAluno());
            }
        }      
    }

    private void buscarCurso(String nomeSelecionado) {
        for(Curso c : br.sistemaescola.list.CursoList.getListCurso()){
            if(c.getNome().equals(nomeSelecionado)){
                frame.getCursoJTextField().setText(nomeSelecionado);                 
                frame.setIdCurso(c.getId());
            }
        }
    }

    private void buscarDisciplina(String nomeSelecionado) {
       for(Disciplina d : br.sistemaescola.list.DisciplinaList.getListDisciplina()){
           if(d.getNomeDisciplina().equals(nomeSelecionado)){
               frame.getDisciplinaJTextField().setText(nomeSelecionado);
               frame.setIdDisciplina(d.getIdDisciplina());               
           }
       }
    }
    
    

}
