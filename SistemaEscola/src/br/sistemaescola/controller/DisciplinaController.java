package br.sistemaescola.controller;

import br.sistemaescola.exception.ExceptionEscola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.object.Disciplina;
import br.sistemaescola.views.DisciplinasJInternalFrame;

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
        switch (e.getActionCommand()) {
            case "disciplinaPesquisaJToggleButton":
                JOptionPane.showMessageDialog(null, "Disciplinas pesquisadas com Sucesso!!!");
                break;
            case "professorPesquisaJToggleButton":
                JOptionPane.showMessageDialog(null, "Professores pesquisados com Sucesso!!!");
                break;
            case "salvarJToggleButton":
                try{
                    adicionar();    
                } catch(ExceptionEscola evt){
                    JOptionPane.showMessageDialog(frame, evt.getMessage());
                }
                
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

    public void adicionar() throws ExceptionEscola{
        disciplina = frame.getDisciplina();        
        validarCamposDeDisciplina();
        //validarCamposProfessor();
        validarFormatos();
    }
    
    /*verificando formatação dos valores dos campos*/
    public void validarFormatos() throws ExceptionEscola{
        
        /*verificando informações de DISCIPLINAS*/
        /*if(! validarNomeDisciplina()){
            throw new ExceptionEscola("Insira um nome válido");            
        }
        if(! validarCodigoDisciplina()){
            throw new ExceptionEscola("Insira um código válido.\nQue seja maior que zero");            
        }
        if(! validarTotalDeAlunos()){
            throw new ExceptionEscola("Insira um código válido.\nQue seja maior que zero");            
        }        
        if(! validarTotalDeHoras()){
            throw new ExceptionEscola("Insira um valor válido.\nMenor ou igual a 70 horas");            
        }
        */
        
        // parei aqui
        if(! validarTotalDeAlunos()){
            throw new ExceptionEscola("Insira um valor válido.\nMaxímo: 22 alunos   Mínimo: 10 alunos");            
        }
    }
    
    public boolean validarNomeDisciplina(){
        
        String nome = disciplina.getNomeDisciplina();        
        boolean validar = nome.matches("\\D{5,}");                
        return validar;
    }
    
    public boolean validarCodigoDisciplina(){
                
        String codigo = disciplina.getCodigoDisciplina();                
        boolean validar = codigo.matches("\\d{1,}"); 
        return validar;
    }
    
    public boolean validarTotalDeHoras(){
        
        String totalDeHoras = disciplina.getTotalHorasDisciplina();                
        boolean validar = totalDeHoras.matches("\\d{1,}"); 
        
        if(validar){
            
            int horasInt = Integer.parseInt(totalDeHoras);
            
            if(horasInt <= 70){
                
                return validar;        
            }
        }
        
        return false;
    }
    
    public boolean validarTotalDeAlunos(){
        
        String totalDeAlunos = disciplina.getTotalAlunosDisciplina();                
        boolean validar = totalDeAlunos.matches("\\d"); 
        
        
        // PAREI AQUI
        if( validar ){
            
            int totalAlunosInteger = Integer.parseInt(totalDeAlunos);
            
            if(totalAlunosInteger < 11){
                
                return false; 
            } else if(totalAlunosInteger > 22){
                
                return false;
            }
        }
        
        return validar;
    }
    
    public void validarCamposDeDisciplina() throws ExceptionEscola {

        if (disciplina.getNomeDisciplina().trim().equals("") || disciplina.getNomeDisciplina() == null) {

            throw new ExceptionEscola("O campo Nome não pode estar vazio.");
        }

        /*if (disciplina.getCodigoDisciplina().trim().equals("") || disciplina.getCodigoDisciplina() == null) {

            throw new ExceptionEscola("O código da disciplina não pode estar vazio.");
        }
        if (disciplina.getCreditoDisciplina().trim().equals("") || disciplina.getCreditoDisciplina() == null) {

            throw new ExceptionEscola("Informe a quantidade de créditos.");
        }

        if (disciplina.getTotalHorasDisciplina().trim().equals("") || disciplina.getTotalHorasDisciplina() == null) {

            throw new ExceptionEscola("Informe a quantidade de horas.");
        }
        
        if (disciplina.getTotalAlunosDisciplina().trim().equals("") || disciplina.getTotalAlunosDisciplina() == null) {

            throw new ExceptionEscola("Informe o total de alunos por turma.");
        }*/
    }
    
    public void validarCamposProfessor() throws ExceptionEscola{
        
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

            throw new ExceptionEscola("Informe a especialização do professor.");
        }        
    }        
}
