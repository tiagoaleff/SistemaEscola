/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemaescola.controller;

import br.sistemaescola.exception.ExceptionAluno;
import br.sistemaescola.exception.ExceptionEscola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.sistemaescola.object.Aluno;

import br.sistemaescola.views.AlunoJInternalFrame;

/**
 *
 * @author comp1
 */

public class AlunoController  implements ActionListener{

    private AlunoJInternalFrame frame;
    private ArrayList<Aluno> cadastroProfessor = new ArrayList<Aluno>();
    private Aluno aluno;
    
    public AlunoController(AlunoJInternalFrame frame){
        this.frame = frame;
    }
    
    public void actionPerformed(ActionEvent e) {
        
        String action = e.getActionCommand();
        
        switch(e.getActionCommand()){
            case "buscarIdJButton":
                  break;
            case "salvar":
                try{
                    salvar();    
                } catch(ExceptionEscola evt){
                    JOptionPane.showMessageDialog(frame, evt.getMessage());
                }
                
                break;
            case "limparJButton":
                JOptionPane.showMessageDialog(null, "Limpo");
                limpar();
                break;
            case "cancelar":
                cancelar();
                break;
            case "buscar_id":
                buscar_id();
                break;
            case "buscar_nome":
                buscar_nome();
                break;
        }
        
    
    }
    
    private void salvar() throws ExceptionEscola{       
        
        aluno = frame.getAluno();                
        validarCamposAluno();
        validarCamposContato();
        validarCamposFiliacao();
        validarCamposEndereco();
        
    }
    
    private void limpar(){
        
        JOptionPane.showMessageDialog(frame, "limpar");
    }
    
    private void cancelar(){
        JOptionPane.showMessageDialog(frame, "cancelar");
        frame.dispose();
    }
    private void buscar_id(){
        JOptionPane.showMessageDialog(frame, "buscar id");
    }
    private void buscar_nome(){
        JOptionPane.showMessageDialog(frame, "buscar_nome");
    }
    
    public void validarCamposAluno() throws ExceptionEscola{
        
        // validação do campo NOME do aluno
        if (aluno.getNomeAluno().trim().equals("") || aluno.getNomeAluno() == null) {
            
            throw new ExceptionEscola("O campo Nome não pode estar vazio.");
        }
        if(!validarNome(aluno.getNomeAluno())){
            throw new ExceptionEscola("Informe um nome válido.");
        }
        
        // validar campo CPF
        if (aluno.getCpfAluno().trim().equals("") || aluno.getCpfAluno() == null) {
            
            throw new ExceptionEscola("O campo cpf não pode estar vazio.");
        }
        if(!validarCPF(aluno.getCpfAluno())){
            throw new ExceptionEscola("O campo cpf não pode estar vazio.");
        }
        
        // validar campo RG 
        if (aluno.getRgAluno().trim().equals("") || aluno.getRgAluno() == null) {
            
            throw new ExceptionEscola("O campo rg não pode estar vazio.");
        }
        if(!validarRG(aluno.getRgAluno())){
            throw new ExceptionEscola("O campo rg não pode estar vazio.");
        }
        
        // validar campo NASCIMENTO
        if (aluno.getNascimentoAluno().trim().equals("") || aluno.getNascimentoAluno() == null) {
            
            throw new ExceptionEscola("O campo data de nascimento não pode estar vazio.");
        }
        if(!validarNascimento(aluno.getNascimentoAluno())){
            throw new ExceptionEscola("O campo data de nascimento não pode estar vazio.");
        }
    }
    
    public void validarCamposContato() throws ExceptionEscola{
                        
        // validação do campo TELEFONE
        if(aluno.getAlunoTelefone().trim().equals("") || aluno.getAlunoTelefone() == null){
            
            throw new ExceptionEscola("O campo Telefone não pode estar vazio.");
        }
        if(! validarTelefone(aluno.getAlunoTelefone())){
            throw new ExceptionEscola("O campo Telefone não pode estar vazio.");
        }

        // validacao do campo CELULAR
        if(aluno.getAlunoCelular().trim().equals("") || aluno.getAlunoCelular() == null) {

            throw new ExceptionEscola("O campo celular não pode estar vazio.");
        }                
        if(! validarTelefone(aluno.getAlunoCelular())){
            throw new ExceptionEscola("O campo telefone não pode estar vazio.");
        }
        
        // validação do campo E-MAIL
        if(aluno.getAlunoEmail().trim().equals("") || aluno.getAlunoEmail() == null){
           
            throw new ExceptionEscola("O campo email não pode estar vazio.");
        } 
        if(! validarEmail(aluno.getAlunoEmail())){
            throw new ExceptionEscola("O campo email não pode estar vazio.");
        }
    }
    
    public void validarCamposFiliacao() throws ExceptionEscola{
                        
        // validação do campo PAI
        if(aluno.getNomePai().trim().equals("") || aluno.getNomePai() == null){
            
            throw new ExceptionEscola("O campo nome não pode estar vazio.");
        }
        if(! validarNome(aluno.getNomePai())){
            throw new ExceptionEscola("O campo nome não pode estar vazio.");
        }
        
        // validação do campo CPF
        if(aluno.getCpfPai().trim().equals("") || aluno.getCpfPai() == null){
            
            throw new ExceptionEscola("O campo cpf não pode estar vazio.");
        }
        if(!validarCPF(aluno.getCpfPai())){
            throw new ExceptionEscola("O campo cpf não pode estar vazio.");
        }
        
        // validação do campo RG
        if(aluno.getRgPai().trim().equals("") || aluno.getRgPai() == null){
            
            throw new ExceptionEscola("O campo rg não pode estar vazio.");
        }   
        if(!validarRG(aluno.getRgPai())){
            throw new ExceptionEscola("O campo rg não pode estar vazio.");
        }
        
        // validação do campo MAE NOME
        if(aluno.getNomeMae().trim().equals("") || aluno.getNomeMae() == null){
            
            throw new ExceptionEscola("O campo nome não pode estar vazio.");
        }        
        if(!validarNome(aluno.getNomeMae())){
            throw new ExceptionEscola("O campo nome não pode estar vazio.");
        }
        
        // validação do campo MAE CPF 
        if(aluno.getCpfMae().trim().equals("") || aluno.getCpfMae() == null){
            
            throw new ExceptionEscola("O campo cpf não pode estar vazio.");
        }        
        if(!validarCPF(aluno.getCpfMae())){
            throw new ExceptionEscola("O campo cpf não pode estar vazio.");
        }
        
        
        // validação do campo MAE RG  
        if(aluno.getRgMae().trim().equals("") || aluno.getRgMae()== null){
            
            throw new ExceptionEscola("O campo rg não pode estar vazio.");
        }                        
        if(!validarRG(aluno.getRgMae())){
            throw new ExceptionEscola("O campo rg não pode estar vazio.");
        }
    }
    
    public void validarCamposEndereco() throws ExceptionEscola{
                        
        // validação do campo ESTADO
        if(aluno.getEstado().trim().equals("") || aluno.getEstado() == null){
            
            throw new ExceptionEscola("O campo estado não pode estar vazio.");
        }
        if(! validaEndereco(aluno.getEstado())){
            throw new ExceptionEscola("O campo endereço não pode estar vazio.");
        }
        
        // validação do campo BAIRRO
        if(aluno.getBairro().trim().equals("") || aluno.getBairro() == null){
            
            throw new ExceptionEscola("O campo bairro não pode estar vazio.");
        }
        if(!validarNome(aluno.getBairro())){
            throw new ExceptionEscola("O campo nome não pode estar vazio.");
        }
        
        // validação do campo CIDADE
        if(aluno.getCidade().trim().equals("") || aluno.getCidade() == null){
            
            throw new ExceptionEscola("O campo cidade não pode estar vazio.");
        }
        if(!validarNome(aluno.getCidade())){
            throw new ExceptionEscola("O campo nome não pode estar vazio.");
        }
        
        // validação da compo RUA
        if(aluno.getRua().trim().equals("") || aluno.getRua() == null){
            
            throw new ExceptionEscola("O campo rua não pode estar vazio.");
        }
        if(!validarNome(aluno.getRua())){
            throw new ExceptionEscola("O campo nome não pode estar vazio.");
        }
        
        // validação da compo NUMERO
        if(aluno.getNumero().trim().equals("") || aluno.getNumero() == null){
            
            throw new ExceptionEscola("O campo numero não pode estar vazio.");
        }                
        if(!validarRua(aluno.getNumero())){
            throw new ExceptionEscola("O campo rua não pode estar vazio.");   
        }
        
        br.sistemaescola.list.AlunoList.addAluno(aluno);
    }
    
    // os metodos a seguir são referentes a validação valores dos campos 
    public boolean validarNome(String nome){        
        boolean validar = nome.matches("\\D{5,}");                
        return validar;
    }
    
    public boolean validarCPF(String cpf){
        boolean validar = cpf.matches("^[0-9]{3}.?[0-9]{3}.?[0-9]{3}-?[0-9]{2}");                
        return validar;                                
    }
    
    public boolean validarRG(String rg){
        boolean validar = rg.matches("^[0-9]{1}.?[0-9]{3}.?[0-9]{3}");                
        return validar;                                        
    }
    
    public boolean validarNascimento(String nascimento){
        boolean validar = nascimento.matches("^\\d{1,2}/?-?\\d{1,2}/?-?\\d{2,4}");
        return validar;
    }
    
    public boolean validarTelefone(String telefone){
        boolean validar = telefone.matches("\\d{8,9}");
        return validar;
    }
    
    public boolean validarEmail(String email){
        boolean validar = email.matches("\\w{5,}@\\w{5,}.\\w{3}");                        
        return validar;
    }
    
    public boolean validaEndereco(String endereco){
        
        if(endereco.equals("Selecionar")){
            return false;
        }
        
        return true;
    }
    
    public boolean validarRua(String rua){
        
        boolean validar = rua.matches("\\d{1,}");
        return validar;
    }
}
