package br.sistemaescola.controller;

import br.sistemaescola.exception.ExceptionEscola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.object.Professor;
import br.sistemaescola.views.ProfessorJInternalFrame;
import java.awt.Component;
import javax.swing.JTextField;

/**
 *
 * @author Tiago Aleff
 */
public class ProfessorController implements ActionListener {

    private ProfessorJInternalFrame frame;
    // private ArrayList<Professor> cadastroProfessor = new ArrayList<Professor>();
    private Professor professor;

    public ProfessorController(ProfessorJInternalFrame frame) {

        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "disciplinaPesquisaJToggleButton":
                pesquisar();
                break;
            case "salvarJButton":        
                
                try{
                    adicionar();
                }catch(ExceptionEscola exc){
                    JOptionPane.showMessageDialog(frame, exc.getMessage());
                }                                            
                break;
            case "cancelarJToggleButton":
                JOptionPane.showMessageDialog(null, "Cancelado com sucesso!!!!");
                frame.dispose();
                break;
            case "clearJButton1":
                limpar();
                break;
        }
    }

    public void limpar(){
                                   
        Component[] comps = frame.getComponents();
        
        for(Component c : comps){
                       
            if (c instanceof JTextField){                                
               ((JTextField)c).setText("");
            }                                        
        }
        
        /* alterar o codigo abaixo para que funcione o acima*/                        
    }
    
    /*
       ESTE MÉTODO NÃO ESTÁ PRONTO, PORQUE NÃO FOI DEFINIDO O MODO QUE SERÁ GRAVADO AS INFORMAÇÕES 
       NO BANCO DE DADOS. TAMBÉM NÃO FOI DEFINICO COMO A FORMAS DE VALIDAÇÃO
    */     
    public void pesquisar(){
        
        
        //alterar a inicialização da variavel professor
        frame.getProfessor();
        professor = frame.getProfessor();
        
        String name = professor.getNomeProfessor();
        String cpf = professor.getCPF();
        String rg = professor.getRG();
        
        // receberia os dados
        // validaria os dados antes da pesquisas        
        // veria quem esta com os campos corretos
        
        if(name == null && name.trim().equals("")){
            name = null;
        } 
        
        if(cpf == null && cpf.trim().equals("")){
            cpf = null;
        }
        
        if(rg == null && rg.trim().equals("")){
            rg = null;
        }
                
        JOptionPane.showMessageDialog(null, "Pesquisando.. Espere alguns segundos, não esqueça de criar aquele método para inserir no banco de dados, aqueles que os valores viram vetores");                
    }
    
    public void adicionar() throws ExceptionEscola{
        
        professor = frame.getProfessor();

        // este try/catch tem a grande possibilidade de não ficar aqui
        
            
        validarInformacoesPessoais(professor);            
        validarContato(professor);
        validarEndereco(professor);
        validacaoEspecializacao(professor);

        /*
        método responsável por validar os campos
        */                                

        validarCampos();        
        br.sistemaescola.list.ProfessorList.addProfessor(professor);


    }    
    
    public void validarCampos() throws ExceptionEscola{
        
        
        /* validação de INFORMAÇÕES PESSOAIS do professor*/

        if(! validarCPF(professor.getCPF()) ){
            throw new ExceptionEscola("Insira um numero de CPF válido");            
        }        
        if(! validarRG(professor.getRG()) ){
            throw new ExceptionEscola("Insira um numero de RG válido");            
        }
        if(! validarNascimento(professor.getNascimento())){
            throw new ExceptionEscola("Insira uma data de nascimento válida");            
        }
                        
        /* validação de CONTATO do professor*/        
        if(! validarEmail(professor.getEmailContato())){
            throw new ExceptionEscola("Insira um endereço de e-mail válido");            
        } 
        if(! validarTelefone(professor.getTelefoneContato()) ){
            throw new ExceptionEscola("Insira um número de telefone válido");            
        }
     
        if(! validarTelefone(professor.getCelularContato()) ){
            throw new ExceptionEscola("Insira um número de celular válido");            
        }
    }
    
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
    
    /*public boolean validarCelular(){
        
        String celular = professor.getCelularContato();
        boolean validar = celular.matches("\\d{8,9}");
        return validar;
    }*/
    
    
    public boolean validarEmail(String email){
        boolean validar = email.matches("\\w{5,}@\\w{5,}.\\w{3}");                        
        return validar;
        
    }
    
    
   
    public void validarInformacoesPessoais(Professor professor) throws ExceptionEscola{

        // verificar o campo NOME 
        if (professor.getNomeProfessor().trim().equals("") || professor.getNomeProfessor() == null) {

            throw new ExceptionEscola("O campo Nome não pode estar vazio.");
        }
        if(! validarNome(professor.getNomeProfessor()) ){
            throw new ExceptionEscola("Insira um nome válido");            
        }        

        // validar campo CPF
        if (professor.getCPF().trim().equals("") || professor.getCPF() == null) {

             throw new ExceptionEscola("O campo CPF não pode estar vazio.");
        }
        if(! validarCPF(professor.getCPF()) ){
            throw new ExceptionEscola("Insira um numero de CPF válido");            
        }        

        // validar campo RG
        if (professor.getRG().trim().equals("") || professor.getRG() == null) {

            throw new ExceptionEscola("O campo RG não pode estar vazio.");
        }
        if(! validarRG(professor.getRG()) ){
            throw new ExceptionEscola("Insira um numero de RG válido");            
        }

         // validar campo NASCIMENTO
        if (professor.getNascimento().trim().equals("") || professor.getNascimento() == null) {

             throw new ExceptionEscola("A compo Data de Nascimento não pode estar vazia.");
        }        
    }

    public void validarContato(Professor professor) throws ExceptionEscola {

        // validar campo E-MAIL
        if (professor.getEmailContato().trim().equals("") || professor.getEmailContato() == null) {

            throw new ExceptionEscola("O campo E-mail não pode estar vazio");
        }
        if(!validarEmail(professor.getEmailContato())){
            throw new ExceptionEscola("Insira um campo válido para o E-mail");
        }

        // validar campo CELULAR
        if (professor.getCelularContato().trim().equals("") || professor.getCelularContato() == null) {

            throw new ExceptionEscola("O campo Celular não pode estar vazio");
        }
        if(!validarTelefone(professor.getCelularContato())){
            throw new ExceptionEscola("Insira um campo válido para o Celular");
        }

        // validar campo TELEFONE
        if (professor.getTelefoneContato().trim().equals("") || professor.getTelefoneContato() == null) {

            throw new ExceptionEscola("O campo Telefone não pode estar vazio");
        }                
        if(!validarTelefone(professor.getCelularContato())){
            throw new ExceptionEscola("Insira um campo válido para o Telefone");
        }
                        
    }

    public void validarEndereco(Professor professor) throws ExceptionEscola{

        // validar campo ENDERECO
        if (professor.getRuaEndereco().trim().equals("") || professor.getRuaEndereco() == null) {

            throw new ExceptionEscola("O campo Rua não pode estar vazio");
        }
        if(!validarNome(professor.getRuaEndereco())){
            
        }
        
        // validar campo CIDADE
        if (professor.getCidadeEndereco().trim().equals("") || professor.getCidadeEndereco() == null) {

            throw new ExceptionEscola("O campo Cidade não pode estar vazio");
        }
        
        // validar campo BAIRRO
        if (professor.getBairroEndereco().trim().equals("") || professor.getBairroEndereco() == null) {

            throw new ExceptionEscola("O campo Bairro não pode estar vazio");
        }

        // validar campo NUMERO
        if (professor.getNumeroEndereco().trim().equals("") || professor.getNumeroEndereco() == null) {

            throw new ExceptionEscola("O campo Número não pode estar vazio");
        }       
    }

    public void validacaoEspecializacao(Professor professor) throws ExceptionEscola{

        // validar campo GRADUACAO
        if (professor.getGraduacaoEspecializacao().trim().equals("") || professor.getGraduacaoEspecializacao() == null) {

            throw new ExceptionEscola("O campo Graduação não pode estar vazio");
        }
        
        // validar campo ESPECIALIZACAO
        if (professor.getEspecializacao().trim().equals("") || professor.getEspecializacao() == null) {

            throw new ExceptionEscola("Ocampo Especialização não pode estar vazio");
        }
    }
}