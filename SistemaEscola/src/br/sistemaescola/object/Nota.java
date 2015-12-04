/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.object;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Nota {
    
    private String nome;
    private String professor;
    private String disciplicina;
    private String peso;
    private String nota;
    
    // variaveis referente ao banco de dados 
    private int idAluno;
    private int idProfessor;
    private int idDisciplina;
    

    public Nota(String nome, String professor, String disciplicina, String peso, String nota,
                                int idAluno, int idProfessor, int idDisciplina) {
        this.nome = nome;
        this.professor = professor;
        this.disciplicina = disciplicina;
        this.peso = peso;
        this.nota = nota;
        // insiridas 
        this.idAluno = idAluno;
        this.idProfessor = idProfessor;
        this.idDisciplina = idDisciplina;
    }
    
    /* public Nota(String nome,String peso, String nota, int idAluno, int idProfessor, int idDisciplina){
        this.nome = nome;
        this.idAluno = idAluno;
        this.idProfessor = idProfessor;
        this.idDisciplina = idDisciplina;
        this.peso = peso;
        this.nota = nota;
    }
    */

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDisciplicina() {
        return disciplicina;
    }

    public void setDisciplicina(String disciplicina) {
        this.disciplicina = disciplicina;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getNota() {
        return nota;
        
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" + "nome=" + nome + ", professor=" + professor + ", disciplicina=" + disciplicina + ", peso=" + peso + ", nota=" + nota + ", idAluno=" + idAluno + ", idProfessor=" + idProfessor + ", idDisciplina=" + idDisciplina + '}';
    }        
}
