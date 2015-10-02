package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.ProfessorJInternalFrame;

/**
 *
 * @author Tiago Aleff
 */
public class ProfessorController implements ActionListener {

    private ProfessorJInternalFrame frame;

    public ProfessorController(ProfessorJInternalFrame frame) {

        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "disciplinaPesquisaJToggleButton":
                JOptionPane.showMessageDialog(null, "Pesquisa de disciplina realizada com sucesso!!!!");
                break;
            case "salvarJButton":
                JOptionPane.showMessageDialog(null, "Salva com sucesso!!!!");
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
}
