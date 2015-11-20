package br.sistemaescola.dao;

import br.sistemaescola.conexao.Conexao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Professor;
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
        ArrayList<Professor> resultadoLista = new ArrayList<Professor>();
        try{
            Professor professor = new Professor();
            conn = Conexao.getConexao();
            String sql = "SELECT * FROM professores"; // arrumar a string para a instrução sql            
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                // informações pessoais
                professor.setNomeProfessor(rs.getString(1));
                professor.setCPF(rs.getString(2));
                professor.setRG(rs.getString(3));
                professor.setNascimento(rs.getString(4));
                
                // infornações de contato
                professor.setEmailContato(rs.getString(5));
                professor.setCelularContato(rs.getString(6));
                professor.setTelefoneContato(rs.getString(7));
                
                // informações de endereço
                professor.setRuaEndereco(rs.getString(8));
                professor.setCidadeEndereco(rs.getString(9));
                professor.setBairroEndereco(rs.getString(10));
                professor.setNumeroEndereco(rs.getString(12));
                professor.setEstadoEndereco(rs.getString(13));
                
                // informação de especialização
                professor.setNivelDeEscolaridade(rs.getString(13));                
                
                // configura um novo valor a lista
                resultadoLista.add(professor);
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
