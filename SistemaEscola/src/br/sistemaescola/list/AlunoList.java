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

/**
 * 
 * @author Leandro Justin Vieira
 */
public class AlunoList {

    private static ArrayList<Aluno> listAluno = new ArrayList<>();
    // private AlunoDao alunoDao = new AlunoDao();
   
    public static void addAluno(Aluno aluno){ 
       listAluno.add(aluno);
    }
    
    public static ArrayList<Aluno> getListAluno() throws ExceptionEscola{       
        
        listAluno = AlunoDao.selecionarTodos();
        return listAluno;
    }
    
    
    
}
