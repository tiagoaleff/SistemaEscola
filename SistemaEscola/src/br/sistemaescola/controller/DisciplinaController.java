package br.sistemaescola.controller;

import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Curso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.object.Disciplina;
import br.sistemaescola.object.Professor;
import br.sistemaescola.views.DisciplinasJInternalFrame;
import javax.swing.DefaultListModel;

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
        
        disciplina= frame.atualizar();
        
        switch (e.getActionCommand()) {
            case "disciplinaPesquisar":
                pesquisarDisciplinas();
                break;
            case "professorPesquisar":
                pesquisarProfessor();
                break;
            case "cursoPesquisar":
                pesquisarCursos();
                break;               
            case "salvar":
                try{
                    validarCamposDeDisciplina();
                    JOptionPane.showMessageDialog(frame, "Disciplina Adicionada com Sucesso");
                    br.sistemaescola.log.Log.gravarMessagem("Disciplina Adicionada com Sucesso");
                } catch(ExceptionEscola ex){
                    JOptionPane.showMessageDialog(frame, "Erro ao Salvar : " + ex.getMessage());
                    br.sistemaescola.log.Log.gravarMessagem(ex.getMessage());
                }
                
                break;
            case "cancelar":
                cancelar();
                break;
            case "clear":
                clear();
                break;

        }
    }

    public void salvar(){
              
        br.sistemaescola.list.DisciplinaList.addDisciplina(disciplina);
    }
    
    public boolean validarNomeCurso(){
               
        for(Curso curso : br.sistemaescola.list.CursoList.getListCurso()){
            if(curso.getNome().equals(disciplina.getNomeCurso())){
                return true;
            }
        }
        return false;
    }
    
    public boolean validarNomeDisciplina(){
        
        String nome = disciplina.getNomeDisciplina();        
        boolean validar = nome.matches("\\D{5,}");                
        return validar;
    }
    
    public boolean validarNomeDisciplinaIguais(){
        
        for(Disciplina disciplinas : br.sistemaescola.list.DisciplinaList.getListDisciplina()){
            if(disciplinas.getNomeDisciplina().equals(disciplina.getNomeDisciplina())){
                return false;
            }
        }
        return true;
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
            } else if(totalAlunosInteger > 32){
                
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
        if(!validarNomeCurso()){
            throw new ExceptionEscola("O curso não existe, deve-se informar um curso existente");            
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
            throw new ExceptionEscola("Insira uma quantidade de alunos válida.\nMaxímo: 32 alunos   Mínimo: 10 alunos");            
        }    
        
        if(!validarCamposProfessor()){
            throw new ExceptionEscola("O professor não existe deve-se informar um professor existente");
        }
        
        //verifica se o cruso não existe
        for (Disciplina d : br.sistemaescola.list.DisciplinaList.getListDisciplina()){
            if(disciplina.getNomeDisciplina().equals(d.getNomeDisciplina())){

                int confirma = JOptionPane.showConfirmDialog(frame, "Já existe uma disciplina com esse nome você"
                            + " deseja sobre escrever o curso?");
                switch(confirma){
                    case 0:
                        edit(d);
                        clear();
                        throw new ExceptionEscola("O curso foi editado");
                    default:
                        throw new ExceptionEscola("já existe um curso com esse nome troque o nome do "
                                + "curso ou sobreescreva o mesmo");         
                }     
            }
        }    
        salvar();
        
       
    }
    

    
     private void cancelar() {
         frame.dispose();
    }

    private void clear() {
        frame.getnomeJTextField().setText("");
        frame.getCursoJTextField().setText("");
        frame.getProfessorJTextField().setText("");
        frame.getCreditosJTextField().setText("");
        frame.getTotalHorasJTextField().setText("");
        frame.getTotalAlunosJTextField().setText("");
        frame.getListaResultadoJList().setModel( new DefaultListModel());
    }

    private void edit(Disciplina d) {
       
        d.setNomeCurso(disciplina.getNomeCurso());
        d.setNomeDisciplina(disciplina.getNomeDisciplina());
        d.setNomeProfessor(disciplina.getNomeProfessor());
        d.setCreditoDisciplina(disciplina.getCreditoDisciplina());
        d.setTotalAlunosDisciplina(disciplina.getTotalAlunosDisciplina());
        d.setTotalHorasDisciplina(disciplina.getTotalHorasDisciplina());
        
    }
    
    
    
    
    
    public boolean validarCamposProfessor(){
        
        for(Professor professor : br.sistemaescola.list.ProfessorList.getListProfessor()){
            if(disciplina.getNomeProfessor().equals(professor.getNomeProfessor())){
                return true;
            }     
        }
        return false;
    }       

    private void pesquisarProfessor() {
        
        DefaultListModel dm = new DefaultListModel();

        for( Professor professor :  br.sistemaescola.list.ProfessorList.getListProfessor()){
               if(professor.getNomeProfessor().matches(".*" + disciplina.getNomeDisciplina() + ".*")){
                   dm.addElement(professor.getNomeProfessor());     
               }
        }       
        frame.getListaResultadoJList().setModel(dm);
        frame.setListAtual("professor");
    }

    private void pesquisarCursos() {
        
        DefaultListModel dm = new DefaultListModel();

        for( Curso curso :  br.sistemaescola.list.CursoList.getListCurso()){
               if(curso.getNome().matches(".*" + disciplina.getNomeCurso() + ".*")){
                   dm.addElement(curso.getNome());     
               }
        }       
        frame.getListaResultadoJList().setModel(dm);
        frame.setListAtual("curso");
    }

    private void pesquisarDisciplinas() {
           
        DefaultListModel dm = new DefaultListModel();

        for( Disciplina d :  br.sistemaescola.list.DisciplinaList.getListDisciplina()){
               if(d.getNomeDisciplina().matches(".*" + disciplina.getNomeDisciplina() + ".*")){
                   dm.addElement(d.getNomeDisciplina());     
               }
         }       
         frame.getListaResultadoJList().setModel(dm);
         frame.setListAtual("disciplina");
    }
}
