package br.sistemaescola.controller;

import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Aluno;
import br.sistemaescola.object.Curso;
import br.sistemaescola.object.Disciplina;
import br.sistemaescola.object.Faltas;
import br.sistemaescola.object.Professor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.sistemaescola.views.FaltasJInternalFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class FaltasController implements ActionListener {

    private final FaltasJInternalFrame frame;

    public FaltasController(FaltasJInternalFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

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
                    salvar();
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
         JOptionPane.showMessageDialog(frame, "A função não está completa você ainda "
                + "nao consegue editar o que voce informou mas nao fique triste você"
                + "pode ver os cursos que você informou até o momento no "
                + "campo abaixo");
    
        String nomeCursoPesquisa = frame.getCursoPesquisa();
            DefaultListModel dm = new DefaultListModel();

            for( Curso curso :  br.sistemaescola.list.CursoList.getListCurso()){
                   if(curso.getNome().matches(".*" + nomeCursoPesquisa + ".*")){
                       dm.addElement(curso.getNome());     
                   }
            }       
        frame.getCursoResultadoJList().setModel(dm);  
    }

    private void procurarDisciplina() {
        
        JOptionPane.showMessageDialog(frame, "A função não está completa você ainda "
                + "nao consegue editar o que voce informou mas nao fique triste você "
                + "pode ver as disciplinas que você informou até o momento no "
                + "campo abaixo");
    
        String nomeDisciplinaPesquisa = frame.getDisciplinaPesquisa();
            DefaultListModel dm = new DefaultListModel();

            for( Disciplina disciplina :  br.sistemaescola.list.DisciplinaList.getListDisciplina()){
                   if(disciplina.getNomeDisciplina().matches(".*" + nomeDisciplinaPesquisa + ".*")){
                       dm.addElement(disciplina.getNomeDisciplina());     
                   }
             }       
         frame.getDisciplinaResultadoJList().setModel(dm);  
     }
 
    private void procurarAlunos() {
    JOptionPane.showMessageDialog(frame, "A função não está completa você ainda "
                + "nao consegue editar o que voce informou mas nao fique triste "
                + " você pode ver os alunos que você informou até o momento no "
                + "campo abaixo");
    
        String nomeAlunoPesquisa = frame.getAlunoPesquisa();
            DefaultListModel dm = new DefaultListModel();

            for( Aluno aluno :  br.sistemaescola.list.AlunoList.getListAluno()){
                   if(aluno.getNomeAluno().matches(".*" + nomeAlunoPesquisa + ".*")){
                       dm.addElement(aluno.getNomeAluno());     
                   }
             }       
        frame.getAlunoResultadoJList().setModel(dm);
    }

    private void salvar() throws ExceptionEscola{
       
        Faltas falta = frame.atualizar();       
        
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
        
        for(Faltas faltas : br.sistemaescola.list.FaltasList.getListFaltas()){
            if(faltas.getAluno().equals(falta.getAluno())){
                if(faltas.getDisciplina().equals(falta.getDisciplina())){
                    if(faltas.getDia().equals(falta.getDia())){
                        if(faltas.getMes().equals(falta.getMes())){
                            if(faltas.getAno().equals(falta.getAno())){
                                throw new ExceptionEscola("O aluno já possui uma falta desta disciplina nesse mesmo dia");
                            }
                        }
                    }
                }
            }
        }
        
        br.sistemaescola.list.FaltasList.addFaltas(falta);
    }

    private void cancelar() {
       frame.dispose();
    }

    private void clear() {
        JOptionPane.showMessageDialog(frame, "Essa função ainda não foi implementada :(");
    
    }    

}
