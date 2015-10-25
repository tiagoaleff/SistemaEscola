package controller;

import exception.ExceptionProfessor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;
import object.Professor;
import views.ProfessorJInternalFrame;

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
                break;
        }
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
            
            /*
            aqui vão os futuros metodos responsáveis pela validação dos formatos
            dos campos.
            */
        } catch(ExceptionProfessor e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

    public void validarInformacoesPessoais(Professor professor) throws ExceptionProfessor{

        if (professor.getNomeProfessor().trim().equals("") || professor.getNomeProfessor() == null) {

            throw new ExceptionProfessor("O campo Nome não pode estar vazio.");
        }

        if (professor.getCPF().trim().equals("") || professor.getCPF() == null) {

            throw new ExceptionProfessor("O campo CPF não pode estar vazio.");
        }

        if (professor.getRG().trim().equals("") || professor.getRG() == null) {

            throw new ExceptionProfessor("O campo RG não pode estar vazio.");
        }

        if (professor.getNascimento().trim().equals("") || professor.getNascimento() == null) {

            throw new ExceptionProfessor("A compo Data de Nascimento não pode estar vazia.");
        }        
    }

    public void validarContato(Professor professor) throws ExceptionProfessor {

        if (professor.getEmailContato().trim().equals("") || professor.getEmailContato() == null) {

            throw new ExceptionProfessor("O campo E-mail não pode estar vazio");
        }

        if (professor.getCelularContato().trim().equals("") || professor.getCelularContato() == null) {

            throw new ExceptionProfessor("O campo Celular não pode estar vazio");
        }

        if (professor.getTelefoneContato().trim().equals("") || professor.getTelefoneContato() == null) {

            throw new ExceptionProfessor("O campo Telefone não pode estar vazio");
        }        
    }

    public void validarEndereco(Professor professor) throws ExceptionProfessor{

        if (professor.getRuaEndereco().trim().equals("") || professor.getRuaEndereco() == null) {

            throw new ExceptionProfessor("O campo Rua não pode estar vazio");
        }

        if (professor.getCidadeEndereco().trim().equals("") || professor.getCidadeEndereco() == null) {

            throw new ExceptionProfessor("O campo Cidade não pode estar vazio");
        }

        if (professor.getBairroEndereco().trim().equals("") || professor.getBairroEndereco() == null) {

            throw new ExceptionProfessor("O campo Bairro não pode estar vazio");
        }

        if (professor.getNumeroEndereco().trim().equals("") || professor.getNumeroEndereco() == null) {

            throw new ExceptionProfessor("O campo Número não pode estar vazio");
        }

        if (professor.getEstadoEndereco().trim().equals("") || professor.getEstadoEndereco() == null) {

            throw new ExceptionProfessor("O campo Estado não pode estar vazio");
        }        
    }

    public void validacaoEspecializacao(Professor professor) throws ExceptionProfessor{

        if (professor.getGraduacaoEspecializacao().trim().equals("") || professor.getGraduacaoEspecializacao() == null) {

            throw new ExceptionProfessor("O campo Graduação não pode estar vazio");
        }

        if (professor.getEspecializacao().trim().equals("") || professor.getEspecializacao() == null) {

            throw new ExceptionProfessor("Ocampo Especialização não pode estar vazio");
        }
    }
}
