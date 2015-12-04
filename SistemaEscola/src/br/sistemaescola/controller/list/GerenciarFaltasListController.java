/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controller.list;

import br.sistemaescola.dao.AlunoDao;
import br.sistemaescola.dao.DisciplinaDao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.log.Log;
import br.sistemaescola.object.Aluno;
import br.sistemaescola.object.Disciplina;
import br.sistemaescola.object.Faltas;
import br.sistemaescola.views.GerenciadorFaltasJInternalFrame;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GerenciarFaltasListController implements ListSelectionListener{

    private  GerenciadorFaltasJInternalFrame frame;
    
    public GerenciarFaltasListController(GerenciadorFaltasJInternalFrame frame) {
        this.frame = frame;        
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
                
        
        JList jList = frame.getAlunoJList();
        String nomeSelecionado = (String) jList.getSelectedValue();
        JOptionPane.showMessageDialog(frame, nomeSelecionado);
        ArrayList<Faltas> faltasAluno = new ArrayList<>();
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
                
        listaAlunos = buscarListAlunos();
        
        // metodo alterado pois nao possuo o nome do aulo, mas sim o id
        for (Faltas falta : br.sistemaescola.list.FaltasList.getListFaltas()){
                                                  
            System.out.println("falta: " + falta.getIdAluno());
            
              if(buscarAlunoId(falta.getIdAluno())){
                         faltasAluno.add(falta);
              }
        }
        // fim da alteracao
        
        // abaixo comentado o codigo original
        /*
        for (Faltas falta : br.sistemaescola.list.FaltasList.getListFaltas()){
            if(falta.getAluno().equals(nomeSelecionado)){
               faltasAluno.add(falta);
            }
        }
        */
        alimentarTable(faltasAluno);        
    }
    private boolean buscarAlunoId(int  idAluno){
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos = buscarListAlunos();
        boolean teste = false;
        
        for(Aluno a : listaAlunos){
            System.out.println("aluno: " + a.getIdAluno());
            if(a.getIdAluno() == idAluno){
                teste = true;
            }
        }
                
        return teste;
    }    
    private ArrayList<Aluno> buscarListAlunos(){
        
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
       
        try{
            listaAlunos = AlunoDao.selecionarTodos();
        }catch(ExceptionEscola ex){
            JOptionPane.showMessageDialog(frame, "Erro ao buscar alunos:  " + ex.getMessage());
            Log.gravarMessagem("Erro ao buscar alunos:  " + ex.getMessage());
        }
        return listaAlunos;
    }
    private void alimentarTable(ArrayList<Faltas> faltasAluno){
        
        DefaultTableModel dtm   = (DefaultTableModel) frame.getTabelaJTable().getModel();
        
        while(dtm.getRowCount() >= 1){
            dtm.removeRow(dtm.getRowCount() - 1);    
        }
 
       for(Faltas falta : faltasAluno){
       
            /*String primeiro = "não";
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
            */
            dtm.addRow(new Object[]{falta.getDisciplina(),falta.getDia(),falta.getMes(),falta.getAno(),falta.isPrimeiroPeriodo(),falta.isSecundoPeriodo(), falta.isTerceiroPeriodo(), falta.isQuartoPeriodo()}); 
       } 
    }

       public void buscarNomeDisciplina(int idDisciplina, Faltas falta) throws ExceptionEscola{
           
           ArrayList<Disciplina> listDisciplina;
           listDisciplina = DisciplinaDao.selecionarTodos();
           
           for(Disciplina d : listDisciplina){
               System.out.println();
               if(d.getIdDisciplina() == falta.getIdDisciplina()){
                   falta.setAluno(d.getNomeDisciplina());
                   break;
               }
           }
       }
    
        
}
