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
    private String graduacaoEspecializacao;
    private String especializacao;
    private String mestradoEspecializacao;
    private String doutoradoEspecializacao;

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

    public String getGraduacaoEspecializacao() {
        return graduacaoEspecializacao;
    }

    public void setGraduacaoEspecializacao(String graduacaoEspecializacao) {
        this.graduacaoEspecializacao = graduacaoEspecializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getMestradoEspecializacao() {
        return mestradoEspecializacao;
    }

    public void setMestradoEspecializacao(String mestradoEspecializacao) {
        this.mestradoEspecializacao = mestradoEspecializacao;
    }

    public String getDoutoradoEspecializacao() {
        return doutoradoEspecializacao;
    }

    public void setDoutoradoEspecializacao(String doutoradoEspecializacao) {
        this.doutoradoEspecializacao = doutoradoEspecializacao;
    }            
}
