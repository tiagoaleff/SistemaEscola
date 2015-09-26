package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.ProfessorJInternalFrame;

/**
 *
 * @author Tiago Aleff
 */
public class ProfessorController implements ActionListener{
    
    
    private ProfessorJInternalFrame frame;
    
    public ProfessorController(ProfessorJInternalFrame frame){
        
        this.frame = frame;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){

        JOptionPane.showMessageDialog(null, "Entrouuu!!!");
    }
}
