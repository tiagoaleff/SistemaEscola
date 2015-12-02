/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sistemaescola.object;

/**
 * 
 * @author Leandro Justin Vieira
 */
public class Curso {

    private int id;
    private String nome;
    private String professorResponsavel;
    private String duracao;
    private String descricao;
    private boolean noturno;
    private boolean vespertino;
    private boolean matutino;

    public Curso(String nome, String professorResponsavel, String duracao, String descricao, boolean noturno, boolean vespertino, boolean matutino) {
        this.nome = nome;
        this.professorResponsavel = professorResponsavel;
        this.duracao = duracao;
        this.descricao = descricao;
        this.noturno = noturno;
        this.vespertino = vespertino;
        this.matutino = matutino;
    }
    
    public Curso(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isNoturno() {
        return noturno;
    }

    public void setNoturno(boolean noturno) {
        this.noturno = noturno;
    }

    public boolean isVespertino() {
        return vespertino;
    }

    public void setVespertino(boolean vespertino) {
        this.vespertino = vespertino;
    }

    public boolean isMatutino() {
        return matutino;
    }

    public void setMatutino(boolean matutino) {
        this.matutino = matutino;
    }
    
    
    
    
}
