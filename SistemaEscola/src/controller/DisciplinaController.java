package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import views.DisciplinasJInternalFrame;

/**
 *
 * @author Tiago Aleff
 */
public class DisciplinaController implements ActionListener {

    private DisciplinasJInternalFrame frame;

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
                JOptionPane.showMessageDialog(null, "Salva com sucesso!!!");
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
}
