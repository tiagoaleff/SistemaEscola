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

    private static final ArrayList<Professor> listProfessor = new ArrayList<>();
   
    public static void addProfessor(Professor professor){ 
       listProfessor.add(professor);
    }
    
    public static ArrayList<Professor> getListProfessor() {
        return listProfessor;
    }
}
