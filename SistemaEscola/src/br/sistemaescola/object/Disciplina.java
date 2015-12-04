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
    private String nomeCurso;    
    private int idDisciplina;
    private int idCurso;
    private int idProfessor;
    /*dados do professor que irá lecionar a disciplina*/
    private String nomeProfessor;    

    public Disciplina(){}
    
    public Disciplina(String nomeDisciplina, String codigoDisciplina, String creditoDisciplina, String totalAlunosDisciplina, String totalHorasDisciplina, String nomeCurso, String nomeProfessor) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        this.creditoDisciplina = creditoDisciplina;
        this.totalAlunosDisciplina = totalAlunosDisciplina;
        this.totalHorasDisciplina = totalHorasDisciplina;
        this.nomeCurso = nomeCurso;
        this.nomeProfessor = nomeProfessor;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
            
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
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

    @Override
    public String toString() {
        return "Disciplina{" + "nomeDisciplina=" + nomeDisciplina + ", codigoDisciplina=" + codigoDisciplina + ", creditoDisciplina=" + creditoDisciplina + ", totalAlunosDisciplina=" + totalAlunosDisciplina + ", totalHorasDisciplina=" + totalHorasDisciplina + ", nomeCurso=" + nomeCurso + ", idDisciplina=" + idDisciplina + ", idCurso=" + idCurso + ", idProfessor=" + idProfessor + ", nomeProfessor=" + nomeProfessor + '}';
    }
    
    
}
