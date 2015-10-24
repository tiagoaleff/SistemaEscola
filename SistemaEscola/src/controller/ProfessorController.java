package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

    public ProfessorController(ProfessorJInternalFrame frame) {

        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "disciplinaPesquisaJToggleButton":
                adicionar();
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
    
    public void adicionar(){
        
        Professor professor;        
        professor = frame.getProfessor();
        
        
    }
    
    public boolean validarInformacoesPessoais(Professor professor){
             
        if(professor.getNomeProfessor().trim().equals("") || professor.getNomeProfessor() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }        
        if(professor.getCPF().trim().equals("") || professor.getCPF()== null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        if(professor.getRG().trim().equals("") || professor.getRG() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        if(professor.getNascimento().trim().equals("") || professor.getNascimento() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        return true;
    }            
    
    public boolean validarContato(Professor professor){
        
        if(professor.getEmailContato().trim().equals("") || professor.getEmailContato() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        if(professor.getCelularContato().trim().equals("") || professor.getCelularContato() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        if(professor.getTelefoneContato().trim().equals("") || professor.getTelefoneContato() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        return true;
    }
    
    public boolean validarEndereco(Professor professor){
        
        if(professor.getRuaEndereco().trim().equals("") || professor.getRuaEndereco() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        if(professor.getCidadeEndereco().trim().equals("") || professor.getCidadeEndereco() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        if(professor.getBairroEndereco().trim().equals("") || professor.getBairroEndereco() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        if(professor.getNumeroEndereco().trim().equals("") || professor.getNumeroEndereco() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        if(professor.getEstadoEndereco().trim().equals("") || professor.getEstadoEndereco() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        return true;
    }
    
    public boolean validacaoEspecializacao(Professor professor){
            
        if(professor.getCidadeEndereco().trim().equals("") || professor.getCidadeEndereco() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        if(professor.getBairroEndereco().trim().equals("") || professor.getBairroEndereco() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        if(professor.getNumeroEndereco().trim().equals("") || professor.getNumeroEndereco() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        if(professor.getEstadoEndereco().trim().equals("") || professor.getEstadoEndereco() == null){
            
            JOptionPane.showMessageDialog(null, "nome incorreto");
            return false;
        }
        
        return true;
    }
}
