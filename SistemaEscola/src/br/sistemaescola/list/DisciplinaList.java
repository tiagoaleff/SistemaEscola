/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.list;

import br.sistemaescola.object.Disciplina;
import java.util.ArrayList;

/**
 * 
 * @author Leandro Justin vieira
 */
public class DisciplinaList {
    private static final ArrayList<Disciplina> listDisciplina = new ArrayList<>();
   
    public static void addDisciplina(Disciplina disciplina){ 
       listDisciplina.add(disciplina);
    }
    
    public static ArrayList<Disciplina> getListDisciplina() {
        return listDisciplina;
    }
    
}
