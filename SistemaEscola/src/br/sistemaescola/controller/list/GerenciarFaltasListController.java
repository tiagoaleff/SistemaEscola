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
        ArrayList<Faltas> faltasAluno = new ArrayList<>();
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
                
        listaAlunos = buscarListAlunos();
        
       //metodo alterado pois nao possuo o nome do aulo na tabela, mas sim o id
       for (Faltas falta : br.sistemaescola.list.FaltasList.getListFaltas()){
                                                             
              if(buscarAlunoId(falta.getIdAluno(), nomeSelecionado)){     
                        
                    falta.setDisciplina(buscarNomeDisciplina(falta.getIdDisciplina()));
                    faltasAluno.add(falta);                         
              }
        }
        //fim da alteracao
        
        // abaixo comentado o codigo original
        
        /*for (Faltas falta : br.sistemaescola.list.FaltasList.getListFaltas()){
            if(falta.getAluno().equals(nomeSelecionado)){
               faltasAluno.add(falta);
            }
        }*/
        
         alimentarTable(faltasAluno);        
    }
    
    private boolean buscarAlunoId(int  idAluno, String nomeSelecionado){
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos = buscarListAlunos();
        boolean teste = false;
        
        for(Aluno a : listaAlunos){
            if(a.getIdAluno() == idAluno && nomeSelecionado == a.getNomeAluno()){
                teste = true;                
            }
        }
                
        return teste;
    }    
    
    private String buscarNomeDisciplina(int idDisciplina){
        ArrayList<Disciplina>listaDisciplina = new ArrayList<Disciplina>();
        String nomeDisciplina = "Não encontrado";
        try{
            listaDisciplina = DisciplinaDao.selecionarTodos();
        }catch(ExceptionEscola ex){
            JOptionPane.showMessageDialog(frame, "Erro ao buscar alunos:  " + ex.getMessage());
            Log.gravarMessagem("Erro ao buscar alunos:  " + ex.getMessage());
        }
        
        for(Disciplina d : listaDisciplina){
            if(d.getIdDisciplina() == idDisciplina){
                nomeDisciplina = d.getNomeDisciplina();
                break;
            }
        }
        
        return nomeDisciplina;
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
        String primerio = "Falta";
        String segundo = "Falta";
        String terceiro = "Falta";
        String quarta = "Falta";
        
        while(dtm.getRowCount() >= 1){
            dtm.removeRow(dtm.getRowCount() - 1);    
        }
 
       for(Faltas falta : faltasAluno){
            
            if(falta.isPrimeiroPeriodo())
               primerio = "Presença";
           
            if(falta.isSecundoPeriodo())
               segundo = "Presença";
           
            if(falta.isTerceiroPeriodo())
               terceiro = "Presença";
           
            if(falta.isQuartoPeriodo())
               quarta = "Presença";
                   
            dtm.addRow(new Object[]{falta.getIdFaltas(),falta.getDisciplina(),falta.getDia(),falta.getMes(),falta.getAno(),primerio ,segundo , terceiro, quarta}); 
            
            primerio = "Falta";
            segundo = "Falta";
            terceiro = "Falta";
            quarta = "Falta";
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
