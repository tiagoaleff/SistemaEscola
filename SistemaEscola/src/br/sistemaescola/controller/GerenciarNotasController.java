/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller;

import br.sistemaescola.dao.NotaDao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.list.AlunoList;
import br.sistemaescola.log.Log;
import br.sistemaescola.object.Aluno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.sistemaescola.views.GerenciarNotasJInternalFrame;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GerenciarNotasController implements ActionListener{

    private GerenciarNotasJInternalFrame frame;
    private ArrayList<Aluno>listaAluno;
    private NotaDao dao;
    
    public GerenciarNotasController(GerenciarNotasJInternalFrame frame) {
        this.frame = frame;
         dao = new NotaDao();
        // listaAluno = new ArrayList<Aluno>();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        String action = e.getActionCommand();
        
        switch(action){
            
            case "buscar_id":
                buscarIdAluno();
                break;
            case "buscar_nome":
                buscarNome();
                break;
            case "fechar":
                frame.dispose();
                break;
            case "deletar":
                deletar();
                limpar();                
                break;
            case "limpar":
                limpar();
                break;
        }           
  }
    
    
    private void limpar(){
        frame.getIdJTextField2().setText("");
        frame.getNomeJTextField1().setText("");        
        frame.getListaResultadoJList1().setModel(new DefaultListModel());
    }
    
    
    private void deletar(){
        
        int indiceTable = frame.getTabelaJTable1().getSelectedRow();
        Object idNotaObject = frame.getTabelaJTable1().getValueAt(indiceTable, 0);
        int idNota = Integer.parseInt(idNotaObject.toString());
        System.out.println(idNota);
        try{
            dao.deletar(idNota);
        }catch(ExceptionEscola ex){
            JOptionPane.showMessageDialog(frame, "Erro ao deletar falta: " + ex.getMessage());
            Log.gravarMessagem("Erro ao deletar falta: " + ex.getMessage());
        }
    }
    
    private void buscarNome(){
            
        DefaultListModel dm = new DefaultListModel();
         
        if(frame.getNomeJTextField1().getText() != null 
                 && frame.getNomeJTextField1().getText().trim().equals("")){
                    
                    String nome = frame.getNomeJTextField1().getText();
            
              //   for(Nota n : NotaList.getListNota()){
                    for(Aluno a : AlunoList.getListAluno()){
                        if(a.getNomeAluno().matches(".*" + nome + ".*")){
                            dm.addElement(a.getNomeAluno());
                            frame.setIdAluno(a.getIdAluno());
                        }             
                    }   
        }         
         frame.getListaResultadoJList1().setModel(dm);
     }
     
    private void buscarIdAluno(){
        
        setListaAluno();
        
        DefaultListModel dm = new DefaultListModel();        
        int idAluno = -1;       
        
        if(!frame.getIdJTextField2().getText().trim().equals("") && 
                frame.getIdJTextField2().getText() != null){
            
            idAluno = Integer.parseInt(frame.getIdJTextField2().getText());            
        }

        for(Aluno n : AlunoList.getListAluno()){
            if(n.getIdAluno() == idAluno){
                dm.addElement(retornaNomeAluno(n.getIdAluno()));
            } else if(idAluno == -1){
                dm.addElement(retornaNomeAluno(n.getIdAluno()));
            }
        }
        frame.getListaResultadoJList1().setModel(dm);
        // frame.setListaAtual("aluno");
    }
     
    private boolean comparaIdAluno(int id){
       
        boolean comparaId = false;                
        int idAluno = 0;               
        
    
        if(!frame.getIdJTextField2().getText().trim().equals("") && 
                frame.getIdJTextField2().getText() != null){
            
            idAluno = Integer.parseInt(frame.getIdJTextField2().getText());            
            
            if(id == idAluno)
                comparaId = true;    
        } else {
            comparaId = true;
        }
                
        return comparaId;
    }
        
    
     private boolean buscarNomeAluno(int id){
    
        boolean teste = false;
        ArrayList<Aluno>listaAluno = AlunoList.getListAluno();

        for(Aluno a : listaAluno){
            if(a.getIdAluno() == id){
                teste = true;
            }
        }

        return teste;
     }
         
     private String retornaNomeAluno(int id){

         String nome = "Não Encontrado";
         
         for(Aluno a : getListaAluno()){
             if(a.getIdAluno() == id){
                 nome = a.getNomeAluno();
                 return nome;
             }
         }         
         return nome;
     }
    
    private void setListaAluno() {
             
        listaAluno = AlunoList.getListAluno();        
    }          
    private ArrayList<Aluno> getListaAluno() {     
        return listaAluno;
    }          
}
