/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.list;

import br.sistemaescola.dao.NotaDao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.log.Log;
import br.sistemaescola.object.Nota;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 
 * @author Leandro Justin vieira
 */
public class NotaList {
    
    private static ArrayList<Nota> listNota = new ArrayList<>();
   
    public static void addNota(Nota nota){ 
       listNota.add(nota);
    }
    
    public static ArrayList<Nota> getListNota() {
        
        try{
            listNota = NotaDao.selecionarTodasNotas();
        }catch(ExceptionEscola ex){
            JOptionPane.showMessageDialog(null, "Erro ao obter os elementos da base de dados");
            Log.gravarMessagem("Erro ao acessar a base de dados: " + ex.getMessage());
        }
        return listNota;
    }
    
}
