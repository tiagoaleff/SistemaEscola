package br.sistemaescola.dao;

import br.sistemaescola.conexao.Conexao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
               curso.setId(r.getInt(1));               
               curso.setProfessorResponsavel(r.getString(2));
               curso.setNome(r.getString(3));
               curso.setDuracao(r.getString(4));
               curso.setMatutino(r.getBoolean(5));
               curso.setVespertino(r.getBoolean(6));
               curso.setNoturno(r.getBoolean(7));
               curso.setDescricao(r.getString(8));
               
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
            String sql = "INSERT INTO cursos ("                      
                            + "responsavel,"
                            + "nomeCurso,"
                            + "duracao,"
                            + "matutino,"
                            + "vespertino,"
                            + "noturno,"
                            + "descricao"
                        + ") VALUES (?, ?, ?, ?, ?, ?, ?)";   
            
            ps = conn.prepareStatement(sql);
            
            ps.setInt(1, curso.getIdResponsavel());
            ps.setString(2, curso.getNome());
            ps.setInt(3, Integer.parseInt((curso.getDuracao())));
            ps.setBoolean(4, curso.isMatutino());
            ps.setBoolean(5, curso.isVespertino());
            ps.setBoolean(6, curso.isNoturno());
            ps.setString(7, curso.getDescricao());
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
    public void atualizarTodos(Curso curso) throws ExceptionEscola{
        
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConexao();
            String sql = "UPDATE cursos SET "
                            + "responsavel = ?,"
                            + "nomeCurso = ?,"
                            + "duracao = ?,"
                            + "matutino = ?,"
                            + "vespertino = ?,"
                            + "noturno = ?,"
                            + "descricao = ?"
                        + "WHERE id = ?";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, curso.getIdResponsavel());
            ps.setString(2, curso.getNome());
            ps.setInt(3, Integer.parseInt(curso.getDuracao()));
            ps.setBoolean(4, curso.isMatutino());
            ps.setBoolean(5, curso.isVespertino());
            ps.setBoolean(6, curso.isNoturno());
            ps.setString(7, curso.getDescricao());
            ps.setInt(8, curso.getId());
           
            ps.execute();
            conn.commit();   
            JOptionPane.showMessageDialog(null, curso.toString());
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
    
    public void deletar(Curso curso) throws ExceptionEscola{
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConexao();
            String sql = "DELETE FROM cursos WHERE id = ?";
            ps = conn.prepareStatement(sql);            
            ps.setInt(1, curso.getId());
            ps.execute();
            conn.commit();
            JOptionPane.showMessageDialog(null, curso.toString());
            
        }catch(SQLException ex){
            if(conn != null){
                try{
                    conn.rollback();
                }catch(SQLException exc){
                    throw new ExceptionEscola(exc.getMessage());        
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
