package br.sistemaescola.object;

/**
 *
 * @author Tiago Aleff
 */
public class Professor {
   
    
    /*informações do professor*/
    private String nomeProfessor;
    private String CPF;
    private String RG;
    private String nascimento;
    
    /*informações de contado*/
    private String emailContato;
    private String celularContato;
    private String telefoneContato;
    
    /*informações de endereço*/
    private String ruaEndereco;
    private String cidadeEndereco;
    private String bairroEndereco;
    private String numeroEndereco;
    private String estadoEndereco;
    
    /*informações de especialização*/
    private String nivelDeEscolaridade;


    
    public Professor(){}
        
    public Professor(String nomeProfessor, String CPF, String RG, String nascimento, String emailContato, String celularContato, String telefoneContato, String ruaEndereco, String cidadeEndereco, String bairroEndereco, String numeroEndereco, String estadoEndereco, String nivelDeEscolaridade) {
        this.nomeProfessor = nomeProfessor;
        this.CPF = CPF;
        this.RG = RG;
        this.nascimento = nascimento;
        this.emailContato = emailContato;
        this.celularContato = celularContato;
        this.telefoneContato = telefoneContato;
        this.ruaEndereco = ruaEndereco;
        this.cidadeEndereco = cidadeEndereco;
        this.bairroEndereco = bairroEndereco;
        this.numeroEndereco = numeroEndereco;
        this.estadoEndereco = estadoEndereco;
        this.nivelDeEscolaridade = nivelDeEscolaridade;
    }

    public String getNivelDeEscolaridade() {
        return nivelDeEscolaridade;
    }

    public void setNivelDeEscolaridade(String nivelDeEscolaridade) {
        this.nivelDeEscolaridade = nivelDeEscolaridade;
    }

    
    
    
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getCelularContato() {
        return celularContato;
    }

    public void setCelularContato(String celularContato) {
        this.celularContato = celularContato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getRuaEndereco() {
        return ruaEndereco;
    }

    public void setRuaEndereco(String ruaEndereco) {
        this.ruaEndereco = ruaEndereco;
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public void setBairroEndereco(String bairroEndereco) {
        this.bairroEndereco = bairroEndereco;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getEstadoEndereco() {
        return estadoEndereco;
    }

    public void setEstadoEndereco(String estadoEndereco) {
        this.estadoEndereco = estadoEndereco;
    }
           
}
