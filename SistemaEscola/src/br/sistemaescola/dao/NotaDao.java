package br.sistemaescola.dao;

import br.sistemaescola.conexao.Conexao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Disciplina;
import br.sistemaescola.object.Nota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Tiago Aleff
 */
public class NotaDao {
    
    public void inserirNota(Nota nota) throws ExceptionEscola{
                
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConexao();
            String sql = "INSERT INTO notas ("
                    + "idAluno,"
                    + "idProfessor,"
                    + "idDisciplina,"
                    + "peso,"
                    + "nota"                    
                    + ") VALUES(?, ?, ?, ?, ?) ";
            
            ps = conn.prepareStatement(sql);
                                    
            ps.setInt(1, nota.getIdAluno());
            ps.setInt(2, nota.getIdProfessor());
            ps.setInt(3, nota.getIdDisciplina());
            ps.setInt(4, Integer.parseInt(nota.getPeso()));
            ps.setDouble(5, Double.parseDouble(nota.getNota()));
            
            // executa o sql
            ps.execute();
            conn.commit();            
        }catch(SQLException ex){
            
            if(conn != null){                
                try{
                    conn.rollback();    
                }catch(SQLException e){
                    throw new ExceptionEscola(e.getMessage());
                }                
            }
            throw new ExceptionEscola(ex.getMessage());
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
    }        
        
}
