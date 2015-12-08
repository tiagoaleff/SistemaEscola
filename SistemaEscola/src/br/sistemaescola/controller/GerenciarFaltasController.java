/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller;

import br.sistemaescola.dao.FaltasDao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.log.Log;
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
            case "deletar":
                deletar();
                break;
            case "cancelar":
                frame.dispose();
                break;
        }
           
        }
    
    private void deletar(){
        
        try {
            int linha = frame.getTabelaJTable().getSelectedRow();          
            Object valorCelularObeject = frame.getTabelaJTable().getValueAt(linha, 0);
            int valorCelula = Integer.parseInt(valorCelularObeject.toString());        
            dao.deletar(valorCelula);            
        } catch (ExceptionEscola ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Falta: " + ex.getMessage());
            Log.gravarMessagem("Erro ao excluir Falta: " + ex.getMessage());
        } catch(IndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "Selecione uma falta para excluir!");
            Log.gravarMessagem("Erro ao excluir Falta: " + ex.getMessage());
        }
        limpar();
    }
    private void limpar(){
        
        frame.getIdAlunoTextField().setText("");
        frame.getNomeAlunoJTextField().setText("");
        frame.getAlunoJList().setModel(new DefaultListModel());               
        
        // frame.setTabelaJTable(new JTable());
    }
     private void buscar_id(){
         
        int id = 0;
         
        if(frame.getIdAluno() != null && !frame.getIdAluno().equals(""))                    
            id = Integer.parseInt(frame.getIdAluno());
        
        DefaultListModel dm = new DefaultListModel();
         
        for(Aluno aluno : br.sistemaescola.list.AlunoList.getListAluno()){
            if (aluno.getIdAluno() == id) {
                dm.addElement(aluno.getNomeAluno());
            } else if(id == 0){
                dm.addElement(aluno.getNomeAluno());
            }
        }
        frame.getAlunoJList().setModel(dm);
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
