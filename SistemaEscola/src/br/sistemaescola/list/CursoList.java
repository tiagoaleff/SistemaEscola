/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.list;


import br.sistemaescola.object.Curso;
import java.util.ArrayList;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CursoList {

    private static final ArrayList<Curso> listCurso = new ArrayList<>();
   
    public static void addCurso(Curso curso){ 
       listCurso.add(curso);
    }
    
    public static ArrayList<Curso> getListCurso() {
        return listCurso;
    }
    
}
