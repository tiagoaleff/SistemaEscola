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
public class DisciplinaController implements ActionListener{
    
    private DisciplinasJInternalFrame frame;
    
    public DisciplinaController(DisciplinasJInternalFrame frame){
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Entroue");
    }
}
