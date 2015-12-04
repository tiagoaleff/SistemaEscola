/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller;

import br.sistemaescola.dao.FaltasDao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Aluno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.views.GerenciadorFaltasJInternalFrame;
import javax.swing.DefaultListModel;
import javax.swing.JTable;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GerenciarFaltasController implements ActionListener {

    private GerenciadorFaltasJInternalFrame frame;
    private FaltasDao dao;

    public GerenciarFaltasController(GerenciadorFaltasJInternalFrame frame) {
        this.frame = frame;
        dao = new FaltasDao();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
            
        String action = e.getActionCommand();
        
        switch(action){
            
            case "buscar_id":
                buscar_id();
                break;
            case "buscar_nome":
                buscar_nome();
                break;
            case "limpar":
                limpar();                
                break;
            case "deletar:":
                deletar();
        }
           
        }
    
    private void deletar(){
        String nome = frame.getNomeAluno();
          try {
            dao.deletar(nome);
        } catch (ExceptionEscola ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    private void limpar(){
        
        frame.getIdAlunoTextField().setText("");
        frame.getNomeAlunoJTextField().setText("");
        frame.getAlunoJList().setModel(new DefaultListModel());               
        
        frame.setTabelaJTable(new JTable());
    }
     private void buscar_id(){
            JOptionPane.showMessageDialog(frame, "buscar_id");
     }
     private void buscar_nome(){
         
         String nome = frame.getNomeAluno();
         DefaultListModel dm = new DefaultListModel();
         
            for(Aluno aluno : br.sistemaescola.list.AlunoList.getListAluno()){
                if (aluno.getNomeAluno().matches(".*" + nome + ".*")) {
                    dm.addElement(aluno.getNomeAluno());
                }
            }
        frame.getAlunoJList().setModel(dm);
    }    
}
