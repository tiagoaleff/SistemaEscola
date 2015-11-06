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
        validarCamposProfessor();
        br.sistemaescola.list.DisciplinaList.addDisciplina(disciplina);
    }
    
    public boolean validarNomeCurso(){
        
        String curso = disciplina.getNomeCurso();        
        boolean validar = curso.matches("\\D{5,}");                
        return validar;
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
    
    public boolean validarNomeProfessor(){
        
        String nome = disciplina.getNomeProfessor();                                
        boolean validar = nome.matches("\\D{1,25}");                        
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
        boolean validar = totalDeAlunos.matches("\\d{2}"); 

        if( validar ){
            
            int totalAlunosInteger = Integer.parseInt(totalDeAlunos);
            
            if(totalAlunosInteger < 10){
                
                return false; 
            } else if(totalAlunosInteger > 22){
                
                return false;
            }
        }
        
        return validar;
    }
    
    public void validarCamposDeDisciplina() throws ExceptionEscola {               
        
        // validando o campo nome disciplina
        if (disciplina.getNomeDisciplina().trim().equals("") || disciplina.getNomeDisciplina() == null) {
            
            throw new ExceptionEscola("O campo Nome não pode estar vazio.");
        }
        if(! validarNomeDisciplina()){
            throw new ExceptionEscola("Insira um nome de disciplina válido");            
        }
        
        // validando o campo curso 
        if (disciplina.getNomeCurso().trim().equals("") || disciplina.getNomeCurso()== null) {
            
            throw new ExceptionEscola("O campo Nome do Curso não pode estar vazio.");
        } 
        if(! validarNomeCurso()){
            throw new ExceptionEscola("Insira um nome de disciplina válido");            
        }
        
        // validando campo codigo
        if (disciplina.getCodigoDisciplina().trim().equals("") || disciplina.getCodigoDisciplina() == null) {

            throw new ExceptionEscola("O código da disciplina não pode estar vazio.");
        }
        if(! validarCodigoDisciplina()){
            throw new ExceptionEscola("Insira um código válido.\nQue seja maior que zero");            
        }
        
        // validando campo creditos da disciplina
        if (disciplina.getCreditoDisciplina().trim().equals("") || disciplina.getCreditoDisciplina() == null) {

            throw new ExceptionEscola("Informe a quantidade de créditos.");
        }

        // validando campo total de horas da disciplina
        if (disciplina.getTotalHorasDisciplina().trim().equals("") || disciplina.getTotalHorasDisciplina() == null) {

            throw new ExceptionEscola("Informe a quantidade de horas.");
        }
        if(! validarTotalDeHoras()){
            throw new ExceptionEscola("Insira um valor válido.\nMenor ou igual a 70 horas");            
        }                        
        
        // validando total de alunos da disciplina
        if (disciplina.getTotalAlunosDisciplina().trim().equals("") || disciplina.getTotalAlunosDisciplina() == null) {

            throw new ExceptionEscola("Informe o total de alunos por turma.");
        }
        if(! validarTotalDeAlunos()){
            throw new ExceptionEscola("Insira uma quantidade de alunos válida.\nMaxímo: 22 alunos   Mínimo: 10 alunos");            
        }                
    }
    
    public void validarCamposProfessor() throws ExceptionEscola{
        
        if (disciplina.getNomeProfessor().trim().equals("") || disciplina.getNomeProfessor() == null) {                                              
            throw new ExceptionEscola("O campo Nome não pode estar vazio.");
        }
        if(! validarNomeProfessor()){
            throw new ExceptionEscola("Insira um nome válido para o professor");            
        }
    }        
}
