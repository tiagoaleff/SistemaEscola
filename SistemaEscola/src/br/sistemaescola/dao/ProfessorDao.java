package br.sistemaescola.dao;

import br.sistemaescola.conexao.Conexao;
import br.sistemaescola.exception.ExceptionEscola;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfessorDao {
    
    public void insert() throws ExceptionEscola{
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConexao();            
            String sql = "INSERT INT professores () VALUES("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + ");";
            ps = conn.prepareStatement(sql);  
            //setar respectivos valores da base de dados;
            ps.execute();
            conn.commit();
        }catch(SQLException ex){
            throw new ExceptionEscola(ex.getMessage());
        }
        
    }
    
    public void select()throws ExceptionEscola{
        
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConexao();
            String sql = "SELECT INTO professores () ..."; // arrumar a string para a instrução sql            
            ps = conn.prepareStatement(sql);
            // setar os valores básicos referentes a os elmenteos que faltam
            conn.commit();
        }catch(SQLException ex){
            throw new ExceptionEscola(ex.getMessage());
        }
    }
    
    public void deleteElement(int codigo) throws ExceptionEscola{
        
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConexao();
            String sql = "DELETE FROM professores WHERE = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
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
            // throw new ExceptionEscola(ex.getMessage());            
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
        
        //throw new EscolaException();
    }        
}
