/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.exception;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ExceptionAluno extends Exception {
    public ExceptionAluno(){
        
    super("Erro desconhecido");
    }
    
    public ExceptionAluno(String mensagem){
        super(mensagem);
    }
}
