/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.list;

import br.sistemaescola.dao.ProfessorDao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Professor;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ProfessorList {

    private static ArrayList<Professor> listProfessor = new ArrayList<>();
   
    public static void addProfessor(Professor professor){ 
       listProfessor.add(professor);
    }
    
    public static ArrayList<Professor> getListProfessor(){        
                
        try {
            listProfessor = ProfessorDao.selecionarTodos();
        } catch (ExceptionEscola ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
                
        return listProfessor;
    }
}
