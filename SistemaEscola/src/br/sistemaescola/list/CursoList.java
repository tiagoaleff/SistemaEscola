/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.list;


import br.sistemaescola.dao.CursoDao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Curso;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CursoList {

    private static ArrayList<Curso> listCurso = new ArrayList<>();
   
    public static void addCurso(Curso curso){ 
       // listCurso.add(curso);
    }
    
    public static ArrayList<Curso> getListCurso() {
        try{
            listCurso = CursoDao.selecionarTodos();    
        }catch(ExceptionEscola ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            br.sistemaescola.log.Log.gravarMessagem("Erro :" + ex.getMessage());
        }
        
        return listCurso;
    }
    
}
