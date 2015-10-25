package controller;

import exception.ExceptionEscola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import object.Disciplina;
import views.DisciplinasJInternalFrame;

/**
 *
 * @author Tiago Aleff
 */
public class DisciplinaController implements ActionListener {

    private DisciplinasJInternalFrame frame;
    private Disciplina disciplina;

    public DisciplinaController(DisciplinasJInternalFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //JOptionPane.showMessageDialog(null, "Entroue");
        switch (e.getActionCommand()) {
            case "disciplinaPesquisaJToggleButton":
                JOptionPane.showMessageDialog(null, "Disciplinas pesquisadas com Sucesso!!!");
                break;
            case "professorPesquisaJToggleButton":
                JOptionPane.showMessageDialog(null, "Professores pesquisados com Sucesso!!!");
                break;
            case "salvarJToggleButton":
                adicionar();
                break;
            case "cancelarJToggleButton":
                JOptionPane.showMessageDialog(null, "Cancelado!!!");
                frame.dispose();
                break;
            case "clearJButton1":
                JOptionPane.showMessageDialog(null, "Limpado!!!");
                break;

        }
    }

    public void adicionar() {

    }

    public void validarDisciplina() throws ExceptionEscola {

        if (disciplina.getNomeDisciplina().trim().equals("") || disciplina.getNomeDisciplina() == null) {

            throw new ExceptionEscola("O campo Nome não pode estar vazio.");
        }

        if (disciplina.getCodigoDisciplina().trim().equals("") || disciplina.getCodigoDisciplina() == null) {

            throw new ExceptionEscola("O campo Nome não pode estar vazio.");
        }
        if (disciplina.getCreditoDisciplina().trim().equals("") || disciplina.getCreditoDisciplina() == null) {

            throw new ExceptionEscola("O campo Nome não pode estar vazio.");
        }

        if (disciplina.getTotalHorasDisciplina().trim().equals("") || disciplina.getTotalHorasDisciplina() == null) {

            throw new ExceptionEscola("O campo Nome não pode estar vazio.");
        }
        
        if (disciplina.getTotalAlunosDisciplina().trim().equals("") || disciplina.getTotalAlunosDisciplina() == null) {

            throw new ExceptionEscola("O campo Nome não pode estar vazio.");
        }
    }
    
    public void validarAdicionarProfessor() throws ExceptionEscola{
        
        if (disciplina.getNomeProfessor().trim().equals("") || disciplina.getNomeProfessor() == null) {

            throw new ExceptionEscola("O campo Nome não pode estar vazio.");
        }

        if (disciplina.getCPF().trim().equals("") || disciplina.getCPF() == null) {

            throw new ExceptionEscola("O campo CPF não pode estar vazio.");
        }

        if (disciplina.getRG().trim().equals("") || disciplina.getRG() == null) {

            throw new ExceptionEscola("O campo RG não pode estar vazio.");
        }

        if (disciplina.getEspecializacao().trim().equals("") || disciplina.getEspecializacao() == null) {

            throw new ExceptionEscola("A compo Data de Nascimento não pode estar vazia.");
        }        
    }
}
