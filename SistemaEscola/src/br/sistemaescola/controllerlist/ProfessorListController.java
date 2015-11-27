/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controllerlist;

import br.sistemaescola.object.Professor;
import br.sistemaescola.views.ProfessorJInternalFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ProfessorListController implements ListSelectionListener {
    
    private ProfessorJInternalFrame frame;
    
    public ProfessorListController(ProfessorJInternalFrame frame){
        this.frame = frame;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
    
        String nomeSelecionado = (String) frame.getResultadoJList().getSelectedValue();
        boolean professorEncontrado = false;
        Professor professor = null;
        
        for(Professor p : br.sistemaescola.list.ProfessorList.getListProfessor()) {
            
            if(p.getNomeProfessor().equals(nomeSelecionado)) {
                professor = p;
                professorEncontrado = true;
                break;
            } 
        }
        
        if(professorEncontrado){
            frame.getNomeJTextField().setText(professor.getNomeProfessor());
            frame.getCpfJTextField().setText(professor.getCPF());
            frame.getRgJTextField().setText(professor.getRG());
            frame.getNascimentoJTextField1().setText(professor.getNascimento());
            frame.getEmailJTextField().setText(professor.getEmailContato());
            frame.getCelularJTextField().setText(professor.getCelularContato());
            frame.getTelefoneJTextField().setText(professor.getTelefoneContato());
            frame.getRuaJTextField().setText(professor.getRuaEndereco());
            frame.getCidadeJTextField().setText(professor.getCidadeEndereco());
            frame.getBairroJTextField().setText(professor.getBairroEndereco());
            frame.getNumeroJTextField().setText(professor.getNumeroEndereco());
            frame.getEstadoJComboBox().getModel().setSelectedItem(professor.getEstadoEndereco());
            frame.getNivelJComboBox().getModel().setSelectedItem(professor.getNivelDeEscolaridade());
        }
        
        frame.getResultadoJList().clearSelection();
    }

}
