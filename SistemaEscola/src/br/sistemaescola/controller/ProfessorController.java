package br.sistemaescola.controller;

import br.sistemaescola.exception.ExceptionEscola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
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
    private ArrayList<Professor> cadastroProfessor = new ArrayList<Professor>();
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
                JOptionPane.showMessageDialog(null, "Salva com sucesso!!!!");
                adicionar();
                break;
            case "cancelarJToggleButton":
                JOptionPane.showMessageDialog(null, "Cancelado com sucesso!!!!");
                frame.dispose();
                break;
            case "clearJButton1":
                JOptionPane.showMessageDialog(null, "Limpo!!!!");
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
            validarContato(professor);
            validarEndereco(professor);
            validacaoEspecializacao(professor);
            
            cadastroProfessor.add(professor);
            
            /*
            aqui vão os futuros metodos responsáveis pela validação dos formatos
            dos campos.
            
            //validadorDeCampo();        
            */        

        } catch(ExceptionEscola e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }                
    }
    
    public void validar(){
        
        String cpf = professor.getCPF();
        boolean validar = false;
        String expressaoRegular = null;                        
        
    }
    
    public void validarTelefone(){
        
        String cpf = professor.getCPF();
        boolean validar = false;
        String expressaoRegular = null;                        
        
    }
    
    public void validarCelular(){
        
        String cpf = professor.getCPF();
        boolean validar = false;
        String expressaoRegular = null;                        
        
    }
    
    
    public void validarEmail(){
        
        String cpf = professor.getCPF();
        boolean validar = false;
        String expressaoRegular = null;                        
        
    }
    
    public void validarNascimento(){
        
        String cpf = professor.getCPF();
        boolean validar = false;
        String expressaoRegular = null;                        
        
    }
    
    public void validarCPF(){
        
        String cpf = professor.getCPF();
        boolean validar = false;
        String expressaoRegular = null;                        
        
    }
        
    public void validarRG(){
        
        String cpf = professor.getCPF();
        boolean validar = false;
        String expressaoRegular = null;                        
        
    }
        
    // CRIAR UM VALIDADOR DE CPF
    public void validadorDeCampo() throws ExceptionEscola{
        
        throw new ExceptionEscola("CPF incorreto");                
    }
    public void validarInformacoesPessoais(Professor professor) throws ExceptionEscola{

        if (professor.getNomeProfessor().trim().equals("") || professor.getNomeProfessor() == null) {

            throw new ExceptionEscola("O campo Nome não pode estar vazio.");
        }

        if (professor.getCPF().trim().equals("") || professor.getCPF() == null) {

            throw new ExceptionEscola("O campo CPF não pode estar vazio.");
        }

        if (professor.getRG().trim().equals("") || professor.getRG() == null) {

            throw new ExceptionEscola("O campo RG não pode estar vazio.");
        }

        if (professor.getNascimento().trim().equals("") || professor.getNascimento() == null) {

            throw new ExceptionEscola("A compo Data de Nascimento não pode estar vazia.");
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

        if (professor.getEstadoEndereco().trim().equals("") || professor.getEstadoEndereco() == null) {

            throw new ExceptionEscola("O campo Estado não pode estar vazio");
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
