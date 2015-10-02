/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package object;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Nota {
    
    private String nome;
    private String professor;
    private String disciplicina;
    private float peso;
    private float nota;

    public Nota(String nome, String professor, String disciplicina, float peso, float nota) {
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

}
