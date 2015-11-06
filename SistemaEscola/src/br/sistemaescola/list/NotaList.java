/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.list;

import br.sistemaescola.object.Nota;
import java.util.ArrayList;

/**
 * 
 * @author Leandro Justin vieira
 */
public class NotaList {
    
    private static final ArrayList<Nota> listNota = new ArrayList<>();
   
    public static void addNota(Nota nota){ 
       listNota.add(nota);
    }
    
    public static ArrayList<Nota> getListNota() {
        return listNota;
    }
    

}
