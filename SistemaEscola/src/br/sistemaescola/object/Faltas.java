package br.sistemaescola.object;

import java.util.ArrayList;

/**
 *
 * @author Tiago Aleff
 */
public class Faltas {
       
    // variaveis para a base de dados
    private int idFaltas;
    private int idAluno;
    private int idCurso;
    private int idDisciplina;    
    
    private String dia = "1";
    private String mes = "1";
    private String ano = "2001";
    
    private String curso;
    private String disciplina;
    private String aluno;
            
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
    
    public Faltas(){        
    }

    public int getIdFaltas() {
        return idFaltas;
    }

    public void setIdFaltas(int idFaltas) {
        this.idFaltas = idFaltas;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
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

    @Override
    public String toString() {
        return "Faltas{" + "idFaltas=" + idFaltas + ", idAluno=" + idAluno + ", idCurso=" + idCurso + ", idDisciplina=" + idDisciplina + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", curso=" + curso + ", disciplina=" + disciplina + ", aluno=" + aluno + ", primeiroPeriodo=" + primeiroPeriodo + ", secundoPeriodo=" + secundoPeriodo + ", terceiroPeriodo=" + terceiroPeriodo + ", quartoPeriodo=" + quartoPeriodo + '}';
    }
    
    
}

   