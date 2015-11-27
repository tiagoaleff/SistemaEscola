package br.sistemaescola.dao;

import br.sistemaescola.conexao.Conexao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Tiago Aleff
 */
public class AlunoDao {
    
    public ArrayList selectAll()throws ExceptionEscola{
        
        Connection conn = null;
        PreparedStatement ps = null;
        ArrayList<Aluno> resultadoLista = new ArrayList<Aluno>();
        try{
            Aluno aluno;
            conn = Conexao.getConexao();
            String sql = "SELECT * FROM alunos";        
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                aluno = new Aluno();
                // informações pessoais
                aluno.setNomeAluno(rs.getString(1));
                aluno.setCpfAluno(rs.getString(2));
                aluno.setRgAluno(rs.getString(3));
                aluno.setNascimentoAluno(rs.getString(4));
                
                // informações contato
                aluno.setAlunoTelefone(rs.getString(5));
                aluno.setAlunoCelular(rs.getString(6));
                aluno.setAlunoEmail(rs.getString(7));
                
                // informações filiação
                aluno.setNomePai(rs.getString(8));
                aluno.setCpfPai(rs.getString(9));
                aluno.setRgPai(rs.getString(10));               
                aluno.setNomeMae(rs.getString(11));
                aluno.setCpfMae(rs.getString(12));
                aluno.setRgMae(rs.getString(13));
                
                // informação endereço
                aluno.setEstado(rs.getString(14));
                aluno.setBairro(rs.getString(15));
                aluno.setCidade(rs.getString(16));
                aluno.setRua(rs.getString(17));
                aluno.setNumero(rs.getString(18));
                                
                // configura um novo valor a lista
                resultadoLista.add(aluno);
            }
            
        }catch(SQLException ex){
            
            if(conn != null){
                try{
                    conn.rollback();
                }catch(SQLException e){
                    throw new ExceptionEscola(e.getMessage());
                }
            }
        }finally{
            if(conn != null){
                try{
                    conn.close();
                }catch(SQLException e){
                    throw new ExceptionEscola(e.getMessage());
                }
            }          
            if(ps != null){
                try{
                    ps.close();
                }catch(SQLException e){
                    throw new ExceptionEscola(e.getMessage());
                }
            }       
        }
        
        return resultadoLista;
    }
}
