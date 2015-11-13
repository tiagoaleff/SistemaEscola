/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


  public class Log {

    private static final String arquivo = "SistemaEscola.log";

    private static void arquivoExiste(){
        
        boolean existe = (new File(arquivo).exists());
        if(!existe){
            File filelog = new File(arquivo);
            try {
                filelog.createNewFile();
                gravarMessagem("O arquivo de log foi criado com sucesso");
            } catch (IOException ex) {
                Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
    private static void escrever(String mensagem) throws IOException {
        FileWriter fileWriter = new FileWriter(arquivo, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String data = (new java.util.Date()).toString();
        String msg = data + " : " + mensagem + "\n";
        bufferedWriter.write(msg);
        bufferedWriter.flush();
        bufferedWriter.close(); 
    }
 
    
    public static void gravarMessagem(String mensagem){
        
        arquivoExiste();             
        try {
            escrever(mensagem);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
