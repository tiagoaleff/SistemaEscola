/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.list;

import br.sistemaescola.object.Faltas;
import java.util.ArrayList;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FaltasList {

    private static final ArrayList<Faltas> listFaltas = new ArrayList<>();
   
    public static void addFaltas(Faltas falta){ 
       listFaltas.add(falta);
    }
    
    public static ArrayList<Faltas> getListFaltas() {
        return listFaltas;
    }    
    
}
