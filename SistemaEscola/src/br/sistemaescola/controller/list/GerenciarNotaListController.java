package br.sistemaescola.controller.list;

import br.sistemaescola.list.AlunoList;
import br.sistemaescola.list.DisciplinaList;
import br.sistemaescola.list.NotaList;
import br.sistemaescola.object.Aluno;
import br.sistemaescola.object.Disciplina;
import br.sistemaescola.object.Nota;
import br.sistemaescola.views.GerenciarNotasJInternalFrame;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tiago Aleff
 */
public class GerenciarNotaListController implements ListSelectionListener{
    
    GerenciarNotasJInternalFrame frame;
    
    
    public GerenciarNotaListController(GerenciarNotasJInternalFrame frame){
        this.frame = frame;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e){
                 

        JList jList = frame.getListaResultadoJList1();       
        String nomeSelecionado = (String) 
        jList.getSelectedValue();ArrayList<Nota>listaNota = new ArrayList<Nota>();
        
        
        if(nomeSelecionado != null){
            
            // é nota pois possuo o id especifico do aluno
            for(Nota n : NotaList.getListNota()){

                String nomeAluno = retornaNomeAluno(n.getIdAluno());
                String nomeDisciplina = retornaNomeDisciplina(n.getIdDisciplina());

                if(nomeSelecionado.equals(nomeAluno)){
                    n.setNome(nomeAluno);
                    n.setDisciplicina(nomeDisciplina);
                    listaNota.add(n);
                }
            }        
        }
        
        alimentarTable(listaNota);
    }
            
    private String retornaNomeDisciplina(int id){
        
        String nomeDisciplina = "Não Encontrado";

        for(Disciplina d : DisciplinaList.getListDisciplina()){
            if(d.getIdDisciplina() == id){
                nomeDisciplina = d.getNomeDisciplina();
                return nomeDisciplina;
            }
        }         
        return nomeDisciplina;
    }
    
    private String retornaNomeAluno(int id){

    String nome = "Não Encontrado";

    for(Aluno a : AlunoList.getListAluno()){
        if(a.getIdAluno() == id){
            nome = a.getNomeAluno();
            return nome;
        }
    }         
    return nome;
    }
        
    private void alimentarTable(ArrayList<Nota> nota){
                
        DefaultTableModel dtm   = (DefaultTableModel) frame.getTabelaJTable1().getModel();
        
        while(dtm.getRowCount() >= 1){
            dtm.removeRow(dtm.getRowCount() - 1);    
        }

       for(Nota n : nota){           
            dtm.addRow(new Object[]{n.getIdNota(), n.getNome(),n.getDisciplicina(),n.getPeso(),n.getNota()}); 
       }                     
    }
}
