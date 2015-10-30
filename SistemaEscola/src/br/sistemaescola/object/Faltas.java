package br.sistemaescola.object;

import java.util.ArrayList;

/**
 *
 * @author Tiago Aleff
 */
public class Faltas {
    
    
    /*informações do curso*/
    private String cursoNome;
    private ArrayList<String> cursoProcura  = new ArrayList();
    /*fim de informações do curso*/
    
    /*informações do professor*/
    private String cursoProfessor;
    private ArrayList<String> professorProcura  = new ArrayList();
    /*fim de informações do professor*/
    
    /*informações do resultado Alunos*/    
    private ArrayList<String> resultadoAlunos  = new ArrayList();
    /*fim de informações do resultado Alunos*/

    public String getCursoNome() {
        return cursoNome;
    }

    public void setCursoNome(String cursoNome) {
        this.cursoNome = cursoNome;
    }

    public ArrayList<String> getCursoProcura() {
        return cursoProcura;
    }

    public void setCursoProcura(ArrayList<String> cursoProcura) {
        this.cursoProcura = cursoProcura;
    }

    public String getCursoProfessor() {
        return cursoProfessor;
    }

    public void setCursoProfessor(String cursoProfessor) {
        this.cursoProfessor = cursoProfessor;
    }

    public ArrayList<String> getProfessorProcura() {
        return professorProcura;
    }

    public void setProfessorProcura(ArrayList<String> professorProcura) {
        this.professorProcura = professorProcura;
    }

    public ArrayList<String> getResultadoAlunos() {
        return resultadoAlunos;
    }

    public void setResultadoAlunos(ArrayList<String> resultadoAlunos) {
        this.resultadoAlunos = resultadoAlunos;
    }
    
    
    
    
    
}
