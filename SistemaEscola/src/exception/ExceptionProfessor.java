/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Tiago Aleff
 */
public class ExceptionProfessor extends Exception{
 
    public ExceptionProfessor(){
        super("Erro desconhecido");
    }
    
    public ExceptionProfessor(String mensagem){
        super(mensagem);
    }
}
