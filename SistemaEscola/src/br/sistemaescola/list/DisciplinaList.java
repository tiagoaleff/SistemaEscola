/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.list;

import br.sistemaescola.dao.DisciplinaDao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.log.Log;
import br.sistemaescola.object.Disciplina;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 
 * @author Leandro Justin vieira
 */
public class DisciplinaList {
    private static ArrayList<Disciplina> listDisciplina = new ArrayList<>();
   
    public static void addDisciplina(Disciplina disciplina){ 
       listDisciplina.add(disciplina);
    }
    
    public static ArrayList<Disciplina> getListDisciplina(){
        try{
            listDisciplina = DisciplinaDao.selecionarTodos();
        }catch(ExceptionEscola ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Log.gravarMessagem("Erro ao buscar disciplinas: " + ex.getMessage());
        }
        return listDisciplina;
    }
    
}
