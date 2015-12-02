/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.list;

import br.sistemaescola.dao.AlunoDao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Aluno;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * 
 * @author Leandro Justin Vieira
 */
public class AlunoList {

    private static ArrayList<Aluno> listAluno = new ArrayList<>();    
   
    public static void addAluno(Aluno aluno){ 
       listAluno.add(aluno);
    }
    
    public static ArrayList<Aluno> getListAluno(){                               
        try {
            listAluno = AlunoDao.selecionarTodos();
        } catch (ExceptionEscola ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            br.sistemaescola.log.Log.gravarMessagem("Erro ao buscar alunos :" + ex.getMessage());                    
        }
        return listAluno;
    }            
}
