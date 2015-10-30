/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


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
        
        FileOutputStream escritorArquivos = new FileOutputStream(arquivo);
        int tamanho = 0;
        String data = (new java.util.Date()).toString();
        String msg = mensagem + " : " + data + "\n";
        
        while (tamanho < msg.length()) {
            escritorArquivos.write((int)msg.charAt(tamanho++));
        }
        escritorArquivos.flush();
        escritorArquivos.close();
    }
    
    private static String ler(String logFile) throws IOException {
        FileInputStream leitorArquivos = new FileInputStream(logFile);
        
        int lido = leitorArquivos.read();
        String conteudoArquivo = "";
        while (lido != -1) {
            conteudoArquivo += (char)lido;
            lido = leitorArquivos.read();
        }
        
        leitorArquivos.close();
        
        return conteudoArquivo;
    }
    
    public static void gravarMessagem(String mesagem){
        
        arquivoExiste();
        
        String conteudo = "";
        try {
            conteudo = ler(arquivo);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
        conteudo = conteudo + mesagem;
        
        try {
            escrever(conteudo);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
