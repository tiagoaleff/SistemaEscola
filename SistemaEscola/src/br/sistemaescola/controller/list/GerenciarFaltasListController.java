/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller.list;

import br.sistemaescola.object.Faltas;
import br.sistemaescola.views.GerenciadorFaltasJInternalFrame;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GerenciarFaltasListController implements ListSelectionListener{

    private final GerenciadorFaltasJInternalFrame frame;
    
    public GerenciarFaltasListController(GerenciadorFaltasJInternalFrame frame) {
        this.frame = frame;        
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
         
        JList jList = frame.getAlunoJList();
        String nomeSelecionado = (String) jList.getSelectedValue();
        
        ArrayList<Faltas> faltasAluno = new ArrayList<>();
        
        for (Faltas falta : br.sistemaescola.list.FaltasList.getListFaltas()){
            if(falta.getAluno().equals(nomeSelecionado)){
               faltasAluno.add(falta);
            }
        }
        alimentarTable(faltasAluno);        
    }
    
    private void alimentarTable(ArrayList<Faltas> faltasAluno){
        
        DefaultTableModel dtm   = (DefaultTableModel) frame.getTabelaJTable().getModel();
        
        while(dtm.getRowCount() >= 1){
            dtm.removeRow(dtm.getRowCount() - 1);    
        }
 
       for(Faltas falta : faltasAluno){
       
            String primeiro = "não";
            String segundo  = "não";
            String terceiro = "não";
            String quarto   = "não";

            if(falta.isPrimeiroPeriodo()){
                primeiro = "sim";
            }
            if(falta.isSecundoPeriodo()){
                segundo = "sim";
            }
            if(falta.isTerceiroPeriodo()){
                terceiro = "sim";
            }
            if(falta.isQuartoPeriodo()){
                quarto = "sim";
            }    
            dtm.addRow(new Object[]{falta.getDisciplina(),falta.getDia(),falta.getMes(),falta.getAno(),primeiro,segundo,terceiro,quarto}); 
       } 
    }
        
}
