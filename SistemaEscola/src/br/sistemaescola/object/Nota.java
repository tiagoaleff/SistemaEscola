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

    public Nota(String nome, String professor, String disciplicina, String peso, String nota) {
        this.nome = nome;
        this.professor = professor;
        this.disciplicina = disciplicina;
        this.peso = peso;
        this.nota = nota;
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

}
