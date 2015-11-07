/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller;

import br.sistemaescola.views.GerenciadorFaltasJInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GerenciarFaltasListController implements ListSelectionListener{

    private GerenciadorFaltasJInternalFrame frame;
    
    public GerenciarFaltasListController(GerenciadorFaltasJInternalFrame frame) {
        this.frame = frame;
    }
   
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
         
        JOptionPane.showMessageDialog(frame, e.);
        
    }

}
