/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.list;

import br.sistemaescola.object.Professor;
import java.util.ArrayList;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ProfessorList {

    private ArrayList<Professor> listProfessor = new ArrayList<>();

    /*Defini professores pára teste*/
    public ProfessorList() {
       
        Professor professor  = new Professor();
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();
         
        professor.setNomeProfessor ("Gilberto Vieira");
        professor1.setNomeProfessor("Sergio Coral");
        professor2.setNomeProfessor("Ana Claudia");
        
        listProfessor.add(professor);
        listProfessor.add(professor1);
        listProfessor.add(professor2);
        
    }
   
    
    public void addProfessor(Professor professor){
        
       listProfessor.add(professor);
    }

   
    public ArrayList<Professor> getListProfessor() {
        return listProfessor;
    }
}
