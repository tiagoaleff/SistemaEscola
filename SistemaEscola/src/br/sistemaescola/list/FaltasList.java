/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.list;

import br.sistemaescola.dao.FaltasDao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.log.Log;
import br.sistemaescola.object.Faltas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FaltasList {

    private static ArrayList<Faltas> listFaltas = new ArrayList<>();
   
    public static void addFaltas(Faltas falta){ 
       listFaltas.add(falta);
    }
    
    public static ArrayList<Faltas> getListFaltas() {
        try{
            listFaltas = FaltasDao.selecionarTodos();                
        }catch(ExceptionEscola ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Log.gravarMessagem(ex.getMessage());
        }
        return  listFaltas;
    }    
    
}
