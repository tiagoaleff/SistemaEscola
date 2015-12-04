package br.sistemaescola.controller;

import br.sistemaescola.dao.FaltasDao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.log.Log;
import br.sistemaescola.object.Aluno;
import br.sistemaescola.object.Curso;
import br.sistemaescola.object.Disciplina;
import br.sistemaescola.object.Faltas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.views.FaltasJInternalFrame;
import javax.swing.DefaultListModel;

public class FaltasController implements ActionListener {

    private final FaltasJInternalFrame frame;
    private Faltas falta = null;
    private FaltasDao dao;

    public FaltasController(FaltasJInternalFrame frame) {
        this.frame = frame;
        dao = new FaltasDao();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        falta = frame.atualizar();
        
        switch (e.getActionCommand()) {

            /*Botoes de pesquisar*/
            case "procurarCursos":
                procurarCursos();
                break;
            case "procurarDisciplina":
                procurarDisciplina();
                break;
            case "procurarAlunos":
                procurarAlunos();
                break;
            /* fim -- pesquisar*/
                
            /*Botoes de Salvar e concelar*/
            case "salvar":
                try {
                    verificar();
                    clear();
                    JOptionPane.showMessageDialog(frame, "Falta salva com sucesso");
                    br.sistemaescola.log.Log.gravarMessagem("Falta salva com sucesso");
                } catch (ExceptionEscola ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage());
                    br.sistemaescola.log.Log.gravarMessagem("Erro ao salvar falta : " + ex.getMessage() );
                }
                break;
            case "cancelar":
                cancelar();
                frame.dispose();
                break;
            case "clear":
                clear();
                break;
            /*fim de Salvar e concelar*/
                
        }
    }

    private void procurarCursos() {
         
    DefaultListModel dm = new DefaultListModel();

            for( Curso curso :  br.sistemaescola.list.CursoList.getListCurso()){
                   if(curso.getNome().matches(".*" + falta.getCurso() + ".*")){
                       dm.addElement(curso.getNome());     
                   }
            }  
            
    frame.getResultadoJList().setModel(dm);
    frame.setListaAtual("curso");
    }

    private void procurarDisciplina() {
        
        DefaultListModel dm = new DefaultListModel();

            for( Disciplina disciplina :  br.sistemaescola.list.DisciplinaList.getListDisciplina()){
                   if(disciplina.getNomeDisciplina().matches(".*" + falta.getDisciplina() + ".*")){
                       dm.addElement(disciplina.getNomeDisciplina());     
                   }
             }       
        frame.getResultadoJList().setModel(dm); 
        frame.setListaAtual("disciplina");
     }
 
    private void procurarAlunos() {
   
        DefaultListModel dm = new DefaultListModel();

            for( Aluno aluno :  br.sistemaescola.list.AlunoList.getListAluno()){
                   if(aluno.getNomeAluno().matches(".*" + falta.getAluno() + ".*")){
                       dm.addElement(aluno.getNomeAluno());     
                   }
             }       
        frame.getResultadoJList().setModel(dm);
        frame.setListaAtual("aluno");
    }

    private void verificar() throws ExceptionEscola{
        
        /*verificar se o aluno é existente*/
        boolean  alunoVerificado = false;
        for(Aluno aluno : br.sistemaescola.list.AlunoList.getListAluno()){
            if(aluno.getNomeAluno().equals(falta.getAluno())){
                alunoVerificado = true;
            }
        }
        if(!alunoVerificado){
            throw new ExceptionEscola("O aluno deve ser valido");
        }
        
        /*Verificar se o curso é existente*/
        boolean cursoVerificado = false;
        for(Curso curso : br.sistemaescola.list.CursoList.getListCurso()){
            if(curso.getNome().equals(falta.getCurso())){
                cursoVerificado = true;
            }
        }
        if (!cursoVerificado){
            throw new ExceptionEscola("O curso deve ser valido");
        }
        
        /*Verificar se a disciplina é existente*/
        boolean disciplinaVerificada = false;
        for(Disciplina disciplina : br.sistemaescola.list.DisciplinaList.getListDisciplina()){
            if(disciplina.getNomeDisciplina().equals(falta.getDisciplina())){
                disciplinaVerificada = true;
            }
        }
        /*verificar se a disciplina é valida*/
        if(!disciplinaVerificada){
            throw new ExceptionEscola("A disciplina deve ser valido");
        }
        
        
        /*Verificar se a disciplina pertence ao curso informado*/
        boolean DisciplinaPertenceCurso = false;
        for(Disciplina disciplina : br.sistemaescola.list.DisciplinaList.getListDisciplina()){            
            
            System.out.println("disciplina: " + disciplina.getIdCurso());
            System.out.println("curso " + frame.getIdCurso());
            
            if(disciplina.getIdCurso() ==  frame.getIdCurso()){ 
                    
               DisciplinaPertenceCurso = true; 
            }
        }
        if(!DisciplinaPertenceCurso){
            throw new ExceptionEscola("Disciplina inserida não pertence a esse curso");
        }
        
        
        /*verificar se o formato do dia é válido*/
        if(!falta.getDia().matches("^\\d\\d$")){
            throw new ExceptionEscola("O formato do dia é invalida");
        }
        
        /*Verificar se o formato do ano é valido*/
        if(!falta.getAno().matches("^\\d\\d\\d\\d$")){
            throw new ExceptionEscola("O formato do ano é invalido");
        }
        
        if(!(falta.isPrimeiroPeriodo() || falta.isSecundoPeriodo()
                || falta.isTerceiroPeriodo() || falta.isQuartoPeriodo())){
            
            throw new ExceptionEscola("O aluno deve ter faltado ao menos um periodo de aula");
        }
        
        for(Faltas f : br.sistemaescola.list.FaltasList.getListFaltas()){
            
            
            JOptionPane.showMessageDialog(frame, falta.toString());
            
             if(f.getIdAluno() == frame.getIdAluno()){
                 if(f.getIdDisciplina() == frame.getIdDisciplina()){
                    if(f.getDia().equals(falta.getDia())){
                        if(f.getMes().equals(falta.getMes())){
                            if(f.getAno().equals(falta.getAno())){
                                int confirma = JOptionPane.showConfirmDialog(frame, "Já existe uma falta nesse data para esse aluno"
                                + " deseja sobre escrever a falta?");
                
                                switch(confirma){
                                    case 0:
                                        edit(f);
                                        clear();
                                        throw new ExceptionEscola("O falta foi editado");
                                    default:
                                        throw new ExceptionEscola("já existe um falta com nessa data para esse aluno nessa materia"
                                                + " troque as informações ou sobreescreva a falta");         
                                }
                            }
                        }
                    }
                }
            }
        }
        salvar();
        
    }

    private void cancelar() {
       frame.dispose();
    }

    private void clear() {
        frame.getAlunoJTextField().setText("");
        frame.getCursoJTextField().setText("");
        frame.getDiaJTextField().setText("");
        frame.getDisciplinaJTextField().setText("");
        frame.getMesesJComboBox().getModel().setSelectedItem("Janeiro");
        frame.getAnoJTextField().setText("");
        frame.getPrimeiraAulaJCheckBox().setSelected(false);
        frame.getSegundaAulaJCheckBox().setSelected(false);
        frame.getTerceiraAulajCheckBox().setSelected(false);
        frame.getQuartaAulaJCheckBox().setSelected(false);
        frame.getResultadoJList().setModel(new DefaultListModel());
      
        
    
    }    

    private void edit(Faltas f) {
        f.setAluno(falta.getAluno());
        f.setCurso(falta.getCurso());
        f.setDisciplina(falta.getDisciplina());
        f.setDia(falta.getDia());
        f.setMes(falta.getMes());
        f.setAno(falta.getAno());
        f.setPrimeiroPeriodo(falta.isPrimeiroPeriodo());
        f.setSecundoPeriodo(falta.isSecundoPeriodo());
        f.setTerceiroPeriodo(falta.isTerceiroPeriodo());
        f.setQuartoPeriodo(falta.isQuartoPeriodo()); 
    }

    private void salvar() throws ExceptionEscola{
        try{
            falta.toString();
            dao.inserirFaltas(falta);
            
        }catch(ExceptionEscola ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Log.gravarMessagem(ex.getMessage());
        }
    }

}
