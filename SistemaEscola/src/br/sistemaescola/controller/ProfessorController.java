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
        
                adicionar();
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
        frame.setProfessor();
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
    public void adicionar() {

        frame.setProfessor();
        professor = frame.getProfessor();

        // este try/catch tem a grande possibilidade de não ficar aqui
        try {
            
            validarInformacoesPessoais(professor);            
            //validarContato(professor);
            //validarEndereco(professor);
            //validacaoEspecializacao(professor);

            /*
            aqui vão os futuros metodos responsáveis pela validação dos formatos
            dos campos.
            
            
            */                                
            validarCampos();        
            br.sistemaescola.list.ProfessorList.addProfessor(professor);
            
        } catch(ExceptionEscola e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }                
    }    
    
    public void validarCampos() throws ExceptionEscola{
        
        
        /* validação de INFORMAÇÕES PESSOAIS do professor*/
        /*if(! validarNome() ){
            throw new ExceptionEscola("Insira um nome válido");            
        }        
        if(! validarCPF() ){
            throw new ExceptionEscola("Insira um numero de CPF válido");            
        }        
        if(! validarRG() ){
            throw new ExceptionEscola("Insira um numero de RG válido");            
        }
        */        
                
        /* validação de CONTATO do professor*/
        /*
        if(! validarEmail()){
            throw new ExceptionEscola("Insira um endereço de e-mail válido");            
        } 
        if(! validarTelefone() ){
            throw new ExceptionEscola("Insira um número de telefone válido");            
        }
     
        if(! validarCelular() ){
            throw new ExceptionEscola("Insira um número de celular válido");            
        }
        */        
    }
    
    public boolean validarNome(){
            
        String nome = professor.getNomeProfessor();                
        System.out.println(nome);
        boolean validar = nome.matches("\\D{5,}");
        return validar;
    }
    
    public boolean validarCPF(){
        
        String cpf = professor.getCPF();
        boolean validar = cpf.matches("^[0-9]{3}.?[0-9]{3}.?[0-9]{3}-?[0-9]{2}");                
        return validar;                                
    }
        
    public boolean validarRG(){
        
        String rg = professor.getRG();
        boolean validar = rg.matches("^[0-9]{1}.?[0-9]{3}.?[0-9]{3}");                
        return validar;                                        
    }
    
    public boolean validarNascimento(){
        
        String nascimento = professor.getNascimento();        
        boolean validar = nascimento.matches("\\d{8,9}");
        return validar;
    }
    
    public boolean validarTelefone(){
        
        String nome = professor.getTelefoneContato();                
        boolean validar = nome.matches("\\d{8,9}");
        return validar;
    }
    
    public boolean validarCelular(){
        
        String celular = professor.getCelularContato();
        boolean validar = celular.matches("\\d{8,9}");
        return validar;
    }
    
    
    public boolean validarEmail(){
        
        String email = professor.getEmailContato();                
        
        boolean validar = email.matches("\\w{5,}@\\w{5,}.\\w{3}");
        
        JOptionPane.showMessageDialog(frame, validar);
        
        
        return validar;
        
    }
    
    
   
    public void validarInformacoesPessoais(Professor professor) throws ExceptionEscola{

        if (professor.getNomeProfessor().trim().equals("") || professor.getNomeProfessor() == null) {

            throw new ExceptionEscola("O campo Nome não pode estar vazio.");
        }

        if (professor.getCPF().trim().equals("") || professor.getCPF() == null) {

            // throw new ExceptionEscola("O campo CPF não pode estar vazio.");
        }

        if (professor.getRG().trim().equals("") || professor.getRG() == null) {

            //throw new ExceptionEscola("O campo RG não pode estar vazio.");
        }

        if (professor.getNascimento().trim().equals("") || professor.getNascimento() == null) {

            // throw new ExceptionEscola("A compo Data de Nascimento não pode estar vazia.");
        }        
    }

    public void validarContato(Professor professor) throws ExceptionEscola {

        if (professor.getEmailContato().trim().equals("") || professor.getEmailContato() == null) {

            throw new ExceptionEscola("O campo E-mail não pode estar vazio");
        }

        if (professor.getCelularContato().trim().equals("") || professor.getCelularContato() == null) {

            throw new ExceptionEscola("O campo Celular não pode estar vazio");
        }

        if (professor.getTelefoneContato().trim().equals("") || professor.getTelefoneContato() == null) {

            throw new ExceptionEscola("O campo Telefone não pode estar vazio");
        }        
    }

    public void validarEndereco(Professor professor) throws ExceptionEscola{

        if (professor.getRuaEndereco().trim().equals("") || professor.getRuaEndereco() == null) {

            throw new ExceptionEscola("O campo Rua não pode estar vazio");
        }

        if (professor.getCidadeEndereco().trim().equals("") || professor.getCidadeEndereco() == null) {

            throw new ExceptionEscola("O campo Cidade não pode estar vazio");
        }

        if (professor.getBairroEndereco().trim().equals("") || professor.getBairroEndereco() == null) {

            throw new ExceptionEscola("O campo Bairro não pode estar vazio");
        }

        if (professor.getNumeroEndereco().trim().equals("") || professor.getNumeroEndereco() == null) {

            throw new ExceptionEscola("O campo Número não pode estar vazio");
        }       
    }

    public void validacaoEspecializacao(Professor professor) throws ExceptionEscola{

        if (professor.getGraduacaoEspecializacao().trim().equals("") || professor.getGraduacaoEspecializacao() == null) {

            throw new ExceptionEscola("O campo Graduação não pode estar vazio");
        }

        if (professor.getEspecializacao().trim().equals("") || professor.getEspecializacao() == null) {

            throw new ExceptionEscola("Ocampo Especialização não pode estar vazio");
        }
    }
}