/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller.list;

import br.sistemaescola.object.Aluno;
import br.sistemaescola.object.Disciplina;
import br.sistemaescola.object.Faltas;
import br.sistemaescola.object.Professor;
import br.sistemaescola.views.NotaJInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class NotaListController implements ListSelectionListener{

    private NotaJInternalFrame frame;

    public NotaListController(NotaJInternalFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        
        String nomeSelecionado = (String) frame.getResultJList().getSelectedValue();
        
        switch(frame.getListAtual()){
            
            case "aluno":
                buscarAluno(nomeSelecionado);
                break;
            case "professor":
                buscarProfessor(nomeSelecionado);
                break;
            case "disciplina":
                buscarDisciplina(nomeSelecionado);
                break;
            default:
                JOptionPane.showMessageDialog(frame, "Erro ao encontrar o item selecionado - " + frame.getListAtual());
        }
        frame.getResultJList().clearSelection();
    }

    private void buscarAluno(String nomeSelecionado) {
       for (Aluno a : br.sistemaescola.list.AlunoList.getListAluno()){
           if(a.getNomeAluno().equals(nomeSelecionado)){
               frame.getAlunoJTextField().setText(nomeSelecionado);
               break;
            }
        }    
    }

    private void buscarProfessor(String nomeSelecionado) {
        for(Professor f : br.sistemaescola.list.ProfessorList.getListProfessor()){
            if(f.getNomeProfessor().equals(nomeSelecionado)){
                frame.getProfessorJTextField().setText(nomeSelecionado);
                break;
            }
        }    
    }

    private void buscarDisciplina(String nomeSelecionado) {
        for(Disciplina d : br.sistemaescola.list.DisciplinaList.getListDisciplina()){
            if(d.getNomeDisciplina().equals(nomeSelecionado)){
                frame.getDisciplinaJTextField().setText(nomeSelecionado);
                break;
            }
        }
    }
   
}
