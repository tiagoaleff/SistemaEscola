package br.sistemaescola.object;

import java.util.ArrayList;

/**
 *
 * @author Tiago Aleff
 */
public class Faltas {
    
    
    
    private String curso;
    private String disciplina;
    private String aluno;
    private String dia;
    private String mes;
    private String ano;
    private boolean primeiroPeriodo;
    private boolean secundoPeriodo;
    private boolean terceiroPeriodo;
    private boolean quartoPeriodo;

    public Faltas(String curso, String disciplina, String aluno, String dia, String mes, String ano, boolean primeiroPeriodo, boolean secundoPeriodo, boolean terceiroPeriodo, boolean quartoPeriodo) {
        this.curso = curso;
        this.disciplina = disciplina;
        this.aluno = aluno;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.primeiroPeriodo = primeiroPeriodo;
        this.secundoPeriodo = secundoPeriodo;
        this.terceiroPeriodo = terceiroPeriodo;
        this.quartoPeriodo = quartoPeriodo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public boolean isPrimeiroPeriodo() {
        return primeiroPeriodo;
    }

    public void setPrimeiroPeriodo(boolean primeiroPeriodo) {
        this.primeiroPeriodo = primeiroPeriodo;
    }

    public boolean isSecundoPeriodo() {
        return secundoPeriodo;
    }

    public void setSecundoPeriodo(boolean secundoPeriodo) {
        this.secundoPeriodo = secundoPeriodo;
    }

    public boolean isTerceiroPeriodo() {
        return terceiroPeriodo;
    }

    public void setTerceiroPeriodo(boolean terceiroPeriodo) {
        this.terceiroPeriodo = terceiroPeriodo;
    }

    public boolean isQuartoPeriodo() {
        return quartoPeriodo;
    }

    public void setQuartoPeriodo(boolean quartoPeriodo) {
        this.quartoPeriodo = quartoPeriodo;
    }
    


}

   