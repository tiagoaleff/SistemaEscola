package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.FaltasJInternalFrame;

public class FaltasController implements ActionListener{
 
    private final FaltasJInternalFrame frame;
    
    public FaltasController(FaltasJInternalFrame frame){
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        JOptionPane.showMessageDialog(null,"deu certo");
    }
    
}
