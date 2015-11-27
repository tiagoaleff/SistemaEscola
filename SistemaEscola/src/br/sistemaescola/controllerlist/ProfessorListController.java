/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controllerlist;

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
    
        
    }

}
