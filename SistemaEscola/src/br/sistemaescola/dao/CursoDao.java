package br.sistemaescola.dao;

import br.sistemaescola.conexao.Conexao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Tiago Aleff
 */
public class CursoDao {
    
    public static ArrayList selecionarTodos() throws ExceptionEscola{
        ArrayList<Curso> cursoList = new ArrayList<Curso>();        
        Curso curso;
        Connection conn = null;
        PreparedStatement ps = null;
        try{            
            conn = Conexao.getConexao();
            String sql = "SELECT * FROM cursos";
            ps = conn.prepareStatement(sql);
            ResultSet r =  ps.executeQuery();
            
            while(r.next()){
               curso = new Curso();
               curso.setId(r.getInt(0));               
               curso.setProfessorResponsavel(r.getString(1));
               curso.setNome(r.getString(2));
               curso.setDuracao(r.getString(3));
               curso.setMatutino(r.getBoolean(4));
               curso.setVespertino(r.getBoolean(5));
               curso.setNoturno(r.getBoolean(6));
               
               cursoList.add(curso);               
            }
        }catch(SQLException ex){
            if(conn != null){
                try{
                    conn.rollback();
                }catch(SQLException exec){
                    throw new ExceptionEscola(exec.getMessage());
                }
            }
            throw new ExceptionEscola(ex.getMessage());            
        }finally{
            if(conn != null){
                try{
                    conn.close();
                }catch(SQLException exec){
                    throw new ExceptionEscola(exec.getMessage());
                }
            }
        }      
        return cursoList;
    }
    
    public void inserirCurso(Curso curso) throws ExceptionEscola{
        
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConexao();
            String sql = "INSET INTO cursos ("                      
                    + "responsavel,"
                    + "nomueCurso,"
                    + "duracao,"
                    + "turno"
                    + ")";   
            ps = conn.prepareStatement(sql);
            // ps.setInt(1, curso.get);
            // ps.setString(parameterIndex, sql);
            ps.execute();
            conn.commit();
        }catch(SQLException ex){
            if(conn != null){
                try{
                    conn.rollback();    
                }catch(SQLException exec){
                    throw new ExceptionEscola(exec.getMessage());        
                }                
            }
            throw new ExceptionEscola(ex.getMessage());
        }finally{
            if(conn != null){
                try{
                    conn.close();
                }catch(SQLException exec){
                    throw new ExceptionEscola(exec.getMessage());
                }
            }            
            if(ps != null){
                try{
                    ps.close();
                }catch(SQLException exec){
                    throw new ExceptionEscola(exec.getMessage());
                }
            }                        
        }
    }
}
