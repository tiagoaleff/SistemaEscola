/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.controllerlist;

import br.sistemaescola.object.Aluno;
import br.sistemaescola.views.AlunoJInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AlunoListController implements ListSelectionListener{

    private AlunoJInternalFrame frame;

    public AlunoListController(AlunoJInternalFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        
        String nomeSelecionado = (String) frame.getResultadoJList().getSelectedValue();        

        if(frame.getListaAtual().equals("aluno")){
            buscarAluno(nomeSelecionado);
        }
    }

    private void buscarAluno(String nome) {
         
        boolean alunoEncontrado = false;
        Aluno aluno = null;
        
        for(Aluno a : br.sistemaescola.list.AlunoList.getListAluno()){
            if(a.getNomeAluno().equals(nome)){
                alunoEncontrado = true;
                aluno = a;
            }
        }
    
        if(alunoEncontrado){
            frame.getNomealunoTextField().setText(aluno.getNomeAluno());
            frame.getCpfTextField().setText(aluno.getCpfAluno());
            frame.getRgalunoTextField().setText(aluno.getRgAluno());
            frame.getNascimentoJTextField1().setText(aluno.getNascimentoAluno());
            frame.getTelTextField().setText(aluno.getAlunoTelefone());
            frame.getCelTextField().setText(aluno.getAlunoCelular());
            frame.getEmailTextField().setText(aluno.getAlunoEmail());
            frame.getNomepaiTextField().setText(aluno.getNomePai());
            frame.getRgpaiTextField().setText(aluno.getRgPai());
            frame.getCpfPaiTextField().setText(aluno.getCpfPai());
            frame.getNomemaeTextField().setText(aluno.getNomeMae());
            frame.getRgmaeTextField().setText(aluno.getRgMae());
            frame.getCpfmaeTextField().setText(aluno.getCpfMae());
            frame.getEstadoJComboBox().getModel().setSelectedItem(aluno.getEstado());
            frame.getBairroTextField().setText(aluno.getBairro());
            frame.getCidadeTextField().setText(aluno.getCidade());
            frame.getRuaTextField().setText(aluno.getRua());
            frame.getNumeroCasaJTextField().setText(aluno.getNumero());
            
        }
    
    }
    
    
    

}
