/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemaescola.controller;

import br.sistemaescola.exception.ExceptionEscola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.sistemaescola.object.Aluno;

import br.sistemaescola.views.AlunoJInternalFrame;
import javax.swing.DefaultListModel;

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
                    JOptionPane.showMessageDialog(frame, "Aluno cadastrado com sucesso");
                    br.sistemaescola.log.Log.gravarMessagem("Aluno cadastrado com sucesso");
                } catch(ExceptionEscola ex){
                    JOptionPane.showMessageDialog(frame, ex.getMessage());
                    br.sistemaescola.log.Log.gravarMessagem("Erro ao salvar aluno :" + ex.getMessage());
                    
                }
                
                break;
            case "limparJButton":
                limpar();
                break;
            case "cancelar":
                cancelar();
                break;
            case "buscarNome":
                buscarNome();
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
        frame.dispose();
    }

    private void buscarNome(){
    

            DefaultListModel dm = new DefaultListModel();

            for( Aluno aluno :  br.sistemaescola.list.AlunoList.getListAluno()){
                   if(aluno.getNomeAluno().matches(".*" + aluno.getNomeAluno() + ".*")){
                       dm.addElement(aluno.getNomeAluno());     
                   }
             }       
        frame.getjList1().setModel(dm);
    }
    
    
    public void validarCamposAluno() throws ExceptionEscola{
        
        /** Validação do nome do aluno
        *  verifica se não é vazio
        *  verifica se nome é composto somente de letras e se é maior do que cinco
        *  verifica se exite um aluno com esse nome 
        */
        if (aluno.getNomeAluno().trim().equals("")) {   
            throw new ExceptionEscola("O nome do Aluno é obrigatório.");
        }
        if(!nomeMinimo(aluno.getNomeAluno())){
            throw new ExceptionEscola("O nome do Aluno deve ter pelo menos 5 letras");
        }
        if(nomeDoAlunoJaExiste(aluno.getNomeAluno())){
            throw new ExceptionEscola("Já existe um Aluno com esse nome");
        }
        
        /** Validação do numero de CPF do aluno
        *  verifica se não é vazio
        *  verifica se o formato do CPF é valido 
        */
        if (aluno.getCpfAluno().trim().equals("")) {
            throw new ExceptionEscola("O CPF é obrigatório.");
        }
        if(!validarCPF(aluno.getCpfAluno())){
            throw new ExceptionEscola("O formato do cpf do Aluno é inválido, deve ser informado um cpf no seguinte formato: 000.000.000-00");
        }
        
        /** Validação do RG do aluno
        *  verifica se não é vazio
        *  verifica se o formato do RG é valido 
        */
        if (aluno.getRgAluno().trim().equals("")) { 
            throw new ExceptionEscola("O RG é obrigatório.");
        }
        if(!validarRG(aluno.getRgAluno())){
            throw new ExceptionEscola("O formato do RG é inválido, deve ser informado um RG com 9 digítos. EX: 000000000 ");
        }
        
        /** Validação da data de nascimento do aluno
        *  verifica se não é vazio
        *  verifica se o formato da data de nascimento é válida 
        */
        if (aluno.getNascimentoAluno().trim().equals("")) {
            throw new ExceptionEscola("A data de nascimento é obrigatória");
        }
        if(!validarDataNascimento(aluno.getNascimentoAluno())){
            throw new ExceptionEscola("O formato da data de nascimento é inválido, deve ser informado uma data com o seguinte padrão dd/mm/aaaa");
        }
    }
    
    public void validarCamposContato() throws ExceptionEscola{
                        
        /** Validação do numero de telefone do aluno
        *  verifica se não é vazio
        *  verifica se o formato do numero é valido 
        */
        if(aluno.getAlunoTelefone().trim().equals("")){           
            throw new ExceptionEscola("O Telefone é obrigatório");
        }
        if(! validarTelefone(aluno.getAlunoTelefone())){
            throw new ExceptionEscola("O formato para o Telefone é inválido, deve ser informado um telefone com o seguinte padrão 00000000");
        }

        /** Validação do numero de celular do aluno
        *  verifica se não é vazio
        *  verifica se o formato do numero é valido 
        */
        if(aluno.getAlunoCelular().trim().equals("")) {
            throw new ExceptionEscola("O celular é obrigatório");
        }                
        if(! validarTelefone(aluno.getAlunoCelular())){
            throw new ExceptionEscola("O formato para o Celular é inválido, deve ser informado um telefone com o seguinte padrão 00000000");
        }
        
        /** Validação do e-mail do aluno
        *  verifica se não é vazio
        *  verifica se o formato do e-mail é válido 
        */
        if(aluno.getAlunoEmail().trim().equals("") || aluno.getAlunoEmail() == null){           
            throw new ExceptionEscola("O email é obrigatório");
        } 
        if(! validarEmail(aluno.getAlunoEmail())){
            throw new ExceptionEscola("O formato do email esta inválido, por favor insira um email válido");
        }
    }
    
    public void validarCamposFiliacao() throws ExceptionEscola{
                        
        /** Validação do nome do pai
        *  verifica se não é vazio
        *  verifica se exite somente letras e se o nome possui ao menos 5 letras 
        */
        if(aluno.getNomePai().trim().equals("")){
            
            throw new ExceptionEscola("O nome do pai do aluno é obrigatório");
        }
        if(! nomeMinimo(aluno.getNomePai())){
            throw new ExceptionEscola("O nome do pai do aluno deve teve pelo menos 5 letras");
        }
        
        /** Validação da campo CPF pai
        *  verifica se não é vazio
        *  verifica se  foi informado um CPF válido
        */ 
        if(aluno.getCpfPai().trim().equals("")){
            
            throw new ExceptionEscola("O CPF do pai do aluno é obrigatório");
        }
        if(!validarCPF(aluno.getCpfPai())){
            throw new ExceptionEscola("O formato do CPF do pai do aluno é inválido, deve ser informado um cpf no seguinte formato: 000.000.000-00");
        }
        
        /** Validação da campo RG pai
        *  verifica se não é vazio
        *  verifica se foi informado um RG válido com 9 dígitos 
        */
        if(aluno.getRgPai().trim().equals("")){
            
            throw new ExceptionEscola("O RG do pai do aluno é obrigatório");
        }   
        if(!validarRG(aluno.getRgPai())){
            throw new ExceptionEscola("O formato do RG do pai do aluno é invalido, deve ser informado um RG com 9 digítos. EX: 000000000");
        }
        
        /** Validação do nome da mãe
        *  verifica se não é vazio
        *  verifica se exite somente letras e se o nome possui ao menos 5 letras 
        */
        if(aluno.getNomeMae().trim().equals("")){
            
            throw new ExceptionEscola("O nome da mãe do aluno é obrigatório");
        }        
        if(!nomeMinimo(aluno.getNomeMae())){
            throw new ExceptionEscola("O nome da mãe do aluno deve teve pelo menos 5 letras");
        }
        
        /** Validação da campo CPF mãe
        *  verifica se não é vazio
        *  verifica se  foi informado um CPF válido
        */ 
        if(aluno.getCpfMae().trim().equals("")){
            
            throw new ExceptionEscola("O CPF da mae é obrigatório");
        }        
        if(!validarCPF(aluno.getCpfMae())){
            throw new ExceptionEscola("O formato do CPF da mãe do aluno é inválido, deve ser informado um cpf no seguinte formato: 000.000.000-00");
        }
        
        
        /** Validação da campo RG mãe
        *  verifica se não é vazio
        *  verifica se foi informado um RG válido com 9 dígitos 
        */ 
        if(aluno.getRgMae().trim().equals("")){
            throw new ExceptionEscola("O RG do mãe do aluno é obrigatório");
        }                        
        if(!validarRG(aluno.getRgMae())){
            throw new ExceptionEscola("O formato do RG da mãe do aluno é invalido, deve ser informado um RG com 9 digítos. EX: 000000000");
        }
    }
    
    public void validarCamposEndereco() throws ExceptionEscola{
                        
        /** Validação da campo Estado
        *  verifica se o estado selecionado no ComboBox não é o selecione, pois se for não foi selecionado um estado valido 
        */
        if(!validaEstado(aluno.getEstado())){
           throw new ExceptionEscola("Deve ser selecionado um estado na secção endereço");
        }
        
        /** Validação da campo bairro
        *  verifica se não é vazio
        *  verifica se exite somente letras e se o nome possui ao menos 5 letras 
        */
        if(aluno.getBairro().trim().equals("")){
            throw new ExceptionEscola("O bairro na secção endereço é obrigatório");
        }
        if(!nomeMinimo(aluno.getBairro())){
            throw new ExceptionEscola("O bairro na secção endereço é invalido por favor insira um bairro válido");
        }
        
        /** Validação da campo Cidade
        *  verifica se não é vazio
        *  verifica se exite somente letras e se o nome possui ao menos 5 letras 
        */
        if(aluno.getCidade().trim().equals("")){
            throw new ExceptionEscola("A cidade na secção endereço é obrigatório");
        }
        if(!nomeMinimo(aluno.getCidade())){
            throw new ExceptionEscola("A cidade na secção endereço é invalido por favor insira um cidade válida");
        }
        
        /** Validação da campo Rua
        *  verifica se não é vazio
        *  verifica se exite somente letras e se o nome possui ao menos 5 letras 
        */
        if(aluno.getRua().trim().equals("")){
            throw new ExceptionEscola("A Rua na secção endereço é obrigatório");
        }
        if(!nomeMinimo(aluno.getRua())){
            throw new ExceptionEscola("A Rua na secção endereço é invalido por favor insira um rua válida");
        }
        
        /** Validação da campo número da casa
        *  verifica se não é vazio
        *  verifica se exite somente numeros e se existe mais que um digito 
        */
        if(aluno.getNumero().trim().equals("")){
            
            throw new ExceptionEscola("O campo numero da casa é obrigatório");
        }                
        if(!validarNumeroCasa(aluno.getNumero())){
            throw new ExceptionEscola("O campo numero da casa é inválido por favor insirta um numero válido.");   
        }
        
        br.sistemaescola.list.AlunoList.addAluno(aluno);
    }
    
    /* Os metodos a seguir são referentes a validação valores dos campos */ 
    private boolean nomeMinimo(String nome){        
        return nome.matches("\\D{5,}");                
    }
    
    private boolean validarCPF(String cpf){
        return cpf.matches("^[0-9]{3}.?[0-9]{3}.?[0-9]{3}-?[0-9]{2}");                                              
    }
    
    private boolean validarRG(String rg){
        return rg.matches("^[0-9]{1}.?[0-9]{3}.?[0-9]{3}");                                                       
    }
    
    private boolean validarDataNascimento(String nascimento){
        return nascimento.matches("^\\d{2}/?-?\\d{2}/?-?\\d{4}");
    }
    
    private boolean validarTelefone(String telefone){
        return telefone.matches("\\d{8}");
    }
    
    private boolean validarEmail(String email){
        return email.matches("\\w{5,}@\\w{5,}.\\w{3}");                        
    }
    
    private boolean validaEstado(String endereco){  
        if(endereco.equals("Selecionar")){
            return false;
        } 
        return true;
    }
    
    private boolean validarNumeroCasa(String rua){        
        return rua.matches("\\d{1,}");
    }
    
    private boolean nomeDoAlunoJaExiste(String nome){        
        for(Aluno a : br.sistemaescola.list.AlunoList.getListAluno()){
         if(a.getNomeAluno().equals(nome)){
             return true;
         }            
        }
        return false;
    }
}
