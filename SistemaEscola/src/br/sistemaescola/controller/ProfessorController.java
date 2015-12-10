package br.sistemaescola.controller;

import br.sistemaescola.dao.ProfessorDao;
import br.sistemaescola.exception.ExceptionEscola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.object.Professor;
import br.sistemaescola.views.ProfessorJInternalFrame;
import javax.swing.DefaultListModel;

/**
 *
 * @author Tiago Aleff
 */
public class ProfessorController implements ActionListener {

    private ProfessorJInternalFrame frame;
    private Professor professor;
    private ProfessorDao dao;

    public ProfessorController(ProfessorJInternalFrame frame) {

        this.frame = frame;
        dao = new ProfessorDao();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        professor = frame.getProfessor();
        
        switch (e.getActionCommand()) {
            case "pesquisarProfessor":
                pesquisarProfessor();
                break;
            case "salvar":        
                
                try{
                    verificar();
                    JOptionPane.showMessageDialog(frame,"Professor cadastrado com sucesso");
                    br.sistemaescola.log.Log.gravarMessagem("Professor cadastrado com sucesso");
                }catch(ExceptionEscola ex){
                    JOptionPane.showMessageDialog(frame, ex.getMessage());
                    br.sistemaescola.log.Log.gravarMessagem("Erro ao salvar professor: " + ex.getMessage());
                }                                            
                break;
            case "cancelar":
                frame.dispose();
                break;
            case "deletar":
                try{
                    deletar();    
                    br.sistemaescola.log.Log.gravarMessagem("Professor Deletado com Sucesso.");
                }catch(ExceptionEscola ex){
                    JOptionPane.showMessageDialog(frame, ex.getMessage());
                    br.sistemaescola.log.Log.gravarMessagem("Erro ao deletar professor: " + ex.getMessage());
                }
                
            case "clear":
                limpar();
                break;
        }
    }

    public void limpar(){
                            
            frame.getIdProfessor().setText("");
            frame.getNomeJTextField().setText("");
            frame.getCpfJTextField().setText("");
            frame.getRgJTextField().setText("");
            frame.getNascimentoJTextField1().setText("");
            frame.getEmailJTextField().setText("");
            frame.getCelularJTextField().setText("");
            frame.getTelefoneJTextField().setText("");
            frame.getRuaJTextField().setText("");
            frame.getCidadeJTextField().setText("");
            frame.getBairroJTextField().setText("");
            frame.getNumeroJTextField().setText("");
            frame.getEstadoJComboBox().getModel().setSelectedItem("Selecionar");
            frame.getNivelJComboBox().getModel().setSelectedItem("Selecionar");
            frame.getResultadoJList().setModel(new DefaultListModel());
                                  
    }
    
    private void deletar() throws ExceptionEscola{
        
        
        if((frame.getIdProfessor().getText()) != null)
            professor.setIdProfessor(Integer.parseInt(frame.getIdProfessor().getText()));
        
        int opcao = JOptionPane.showConfirmDialog(frame, "Deseja realmente excluir o professor: " + professor.getNomeProfessor() + " dos seus dados?");
        
        if(opcao == 0){
            dao.deletar(professor.getIdProfessor());
        }
        
        
    }
        
    public void pesquisarProfessor(){
    
        DefaultListModel dlm = new DefaultListModel();
        
       for(Professor p : br.sistemaescola.list.ProfessorList.getListProfessor()){
           if(p.getNomeProfessor().matches(".*" + professor.getNomeProfessor() + ".*")){
               dlm.addElement(p.getNomeProfessor());
           }   
       }
       frame.getResultadoJList().setModel(dlm);
       frame.setListAtual("professor");
        
    }
    
    public void verificar() throws ExceptionEscola{
        
        validarInformacoesPessoais(professor);  
        validacaoEspecializacao(professor);
        validarContato(professor);
        validarEndereco(professor);
        
        
        for(Professor p : br.sistemaescola.list.ProfessorList.getListProfessor()){
            if(p.getNomeProfessor().equals(professor.getNomeProfessor())){
               
                int confirma = JOptionPane.showConfirmDialog(frame, "Já existe um professor com esse nome você"
                        + " deseja sobre escrever o professor?");
                
                switch(confirma){
                    case 0:
                        edit(p);
                        limpar();
                        throw new ExceptionEscola("O professor foi editado");
                    default:
                        throw new ExceptionEscola("já existe um professor com esse nome troque o nome do "
                                + "professor ou sobreescreva o mesmo");         
                }  
            }
        }
        salvar(professor);
        limpar();
    }   
    
    private void edit(Professor p) throws ExceptionEscola{
        
        if((frame.getIdProfessor().getText()) != null)
            professor.setIdProfessor(Integer.parseInt(frame.getIdProfessor().getText()));
        
        dao.atualizarTodos(professor);
        
    }
    
    
    private void salvar(Professor p) throws ExceptionEscola{ 
        
        dao.inserirProfessor(professor);
    }
     
    public void validarInformacoesPessoais(Professor professor) throws ExceptionEscola{

        // verificar o campo NOME 
        if (professor.getNomeProfessor().trim().equals("")) {
            throw new ExceptionEscola("O nome do professor é obrigatório");
        }
        if(! validarTamanhoMinimo(professor.getNomeProfessor()) ){
            throw new ExceptionEscola("O nome do prodfessor é inválido, o nome deve ter ao menos 5 letras");            
        }        
         
        if (professor.getCPF().trim().equals("")) {
             throw new ExceptionEscola("O CPF é obrigatório");
        }
        
        if(! validarCPF(professor.getCPF())){
            throw new ExceptionEscola("O CPF é inválido, deve ser informado um CPF com o seguinte padrão, 000.000.000-00");            
        }        

        // validar campo RG
        if (professor.getRG().trim().equals("")) {

            throw new ExceptionEscola("O RG é obrigatório");
        }
        if(! validarRG(professor.getRG()) ){
            throw new ExceptionEscola("O RG é inválido, deve ser informado um RG com o seguinte padrão, 123456789");            
        }

         // validar campo NASCIMENTO
        if (professor.getNascimento().trim().equals("")) {
             throw new ExceptionEscola("A data de nascimento é obrigatória");
        } 
        if (!validarNascimento(professor.getNascimento())){
            throw new ExceptionEscola("A data de nascimento é inválida, a data deve seguir o seguinte padrão dd/mm/aaaa");
        }
    }

    public void validarContato(Professor professor) throws ExceptionEscola {

        // validar campo E-MAIL
        if (professor.getEmailContato().trim().equals("")) {
            throw new ExceptionEscola("O email é obrigatório");
        }
        
        if(!validarEmail(professor.getEmailContato())){
            throw new ExceptionEscola("o email informado é inválido, deve ser uinformado um email válido");
        }

        // validar campo CELULAR
        if (professor.getCelularContato().trim().equals("")) {
            throw new ExceptionEscola("O Celular é obrigatório");
        }
        if(!validarTelefone(professor.getCelularContato())){
            throw new ExceptionEscola("O celular é inválido, deve ser informado um numero de celular válido EX: 12345678");
        }

        // validar campo TELEFONE
        if (professor.getTelefoneContato().trim().equals("")) {

            throw new ExceptionEscola("O telefone é obrigatório");
        }                
        if(!validarTelefone(professor.getCelularContato())){
            throw new ExceptionEscola("O telefone é inválido, deve ser informado um telefone válido EX: 12345678 ");
        }
                        
    }

    public void validarEndereco(Professor professor) throws ExceptionEscola{

        // validar campo ENDERECO
        
        if(professor.getEstadoEndereco().equals("Selecionar")){
            throw new ExceptionEscola("Deve ser selecionado um estado");
        }
  
        if (professor.getRuaEndereco().trim().equals("")) {
            throw new ExceptionEscola("A rua é obrigatória");
        }
        if(!validarTamanhoMinimo(professor.getRuaEndereco())){
            throw new ExceptionEscola("A rua é inválida, deve ser informado uma rua com no minímo 5 letras");
        }
        
        // validar campo CIDADE
        if (professor.getCidadeEndereco().trim().equals("")) {
            throw new ExceptionEscola("A cidade é obrigatória");
        }
        if(!validarTamanhoMinimo(professor.getCidadeEndereco())){
            throw new ExceptionEscola("A cidade é inválida, deve ser informado uma cidade com no minino 5 letras");
        }
        // validar campo BAIRRO
        if (professor.getBairroEndereco().trim().equals("")) {
            throw new ExceptionEscola("O Bairro é obrigatório");
        }
        
        if(!validarTamanhoMinimo(professor.getBairroEndereco())){
            throw new ExceptionEscola("O Bairro é inválido, deve ser informado um bairro com no minimo 5 letras");
        }

        // validar campo NUMERO
        if (professor.getNumeroEndereco().trim().equals("")) {
            throw new ExceptionEscola("O número da casa é obrigatório");
        }
        
        if (!validarNumeroCasa(professor.getNumeroEndereco())){
            throw new ExceptionEscola("O número da casa é inválido, deve ser informado um número válido");
        }
    }

    private void validacaoEspecializacao(Professor professor) throws ExceptionEscola{
        
        if (professor.getNivelDeEscolaridade().equals("Selecionar")){
            throw new ExceptionEscola("Deve ser selecionado o nível de formação");
        }
    }

    private boolean validarTamanhoMinimo(String nome){                            
        return nome.matches("\\D{5,}");
    }
    
    private boolean validarCPF(String cpf){                
        return cpf.matches("^[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}");                                                
    }
        
    private boolean validarNumeroCasa(String rua){        
        return rua.matches("\\d{1,}");
    }
    
    private boolean validarRG(String rg){        
        return rg.matches("^[0-9]{1}.?[0-9]{3}.?[0-9]{3}");                                                        
    }
    
    private boolean validarNascimento(String nascimento){        
        return nascimento.matches("^\\d{2}/?-?\\d{2}/?-?\\d{4}");
    }
    
    private boolean validarTelefone(String telefone){
        return telefone.matches("\\d{8,9}");
    }
    
    private boolean validarEmail(String email){
        return email.matches("\\w{5,}@\\w{5,}.\\w{3}");                        
    }   
}