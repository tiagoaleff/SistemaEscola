/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.list;

import br.sistemaescola.object.Aluno;
import java.util.ArrayList;

/**
 * 
 * @author Leandro Justin Vieira
 */
public class AlunoList {

    private static final ArrayList<Aluno> listAluno = new ArrayList<>();
   
    public static void addCurso(Aluno aluno){ 
       listAluno.add(aluno);
    }
    
    public static ArrayList<Aluno> getListAluno() {
        return listAluno;
    }
    
    
    
}
