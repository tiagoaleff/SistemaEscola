package br.sistemaescola.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.views.FaltasJInternalFrame;

public class FaltasController implements ActionListener {

    private final FaltasJInternalFrame frame;

    public FaltasController(FaltasJInternalFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {

            /*Botoes de pesquisar*/
            case "procurarjToggleButton4":
                JOptionPane.showMessageDialog(null, "Curso pesquisado com sucesso!");
                break;
            case "procurarDisciplinaToggleButton5":
                JOptionPane.showMessageDialog(null, "Disciplina pesquisada com sucesso!");
                break;
            /* fim -- pesquisar*/
                
            /*Botoes de Salvar e concelar*/
            case "salvarjButton1":
                JOptionPane.showMessageDialog(null, "Salva com sucesso!");
                break;
            case "cancelarjButton2":
                JOptionPane.showMessageDialog(null, "Cancelado com sucesso!");
                frame.dispose();
                break;
            case "clearJButton1":
                JOptionPane.showMessageDialog(null, "Limpo!");
                break;
            /*fim de Salvar e concelar*/
                
        }
    }

}
