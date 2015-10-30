package br.sistemaescola.object;

/**
 *
 * @author Tiago Aleff
 */
public class Disciplina {
    
    /*dados da disciplina*/
    private String nomeDisciplina;
    private String codigoDisciplina;
    private String creditoDisciplina;
    private String totalAlunosDisciplina;
    private String totalHorasDisciplina;
    
    /*dados do professor que irá lecionar a disciplina*/
    private String nomeProfessor;
    private String CPF;
    private String RG;
    private String especializacao;    

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getCreditoDisciplina() {
        return creditoDisciplina;
    }

    public void setCreditoDisciplina(String creditoDisciplina) {
        this.creditoDisciplina = creditoDisciplina;
    }

    public String getTotalAlunosDisciplina() {
        return totalAlunosDisciplina;
    }

    public void setTotalAlunosDisciplina(String totalAlunosDisciplina) {
        this.totalAlunosDisciplina = totalAlunosDisciplina;
    }

    public String getTotalHorasDisciplina() {
        return totalHorasDisciplina;
    }

    public void setTotalHorasDisciplina(String totalHorasDisciplina) {
        this.totalHorasDisciplina = totalHorasDisciplina;
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

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }        
}
