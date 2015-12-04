package br.sistemaescola.dao;

import br.sistemaescola.conexao.Conexao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Curso;
import br.sistemaescola.object.Disciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Tiago Aleff
 */
public class DisciplinaDao {
    
    
    public void deletar(Disciplina disciplina) throws ExceptionEscola{
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConexao();
            String sql = "DELETE FROM disciplinas WHERE id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(disciplina.getCodigoDisciplina()));
            ps.execute();
            conn.commit();                
        }catch(SQLException ex){        
            if(conn != null){
                try{
                    conn.rollback();
                }catch(SQLException e){
                    br.sistemaescola.log.Log.gravarMessagem(e.getMessage());
                    throw new ExceptionEscola(e.getMessage());
                }
            }
            throw new ExceptionEscola(ex.getMessage());
        } finally{
            if(conn != null){
                try{
                    conn.close();
                }catch(SQLException ex){
                    throw new ExceptionEscola(ex.getMessage());
                }
            }
            if(ps != null){                
                try{
                    ps.close();
                }catch(SQLException ex){
                    throw new ExceptionEscola(ex.getMessage());
                }
            }
        }        
    }            
            
    public static ArrayList selecionarTodos() throws ExceptionEscola{
        ArrayList<Disciplina> disciplinaList = new ArrayList<Disciplina>();        
        Disciplina disciplina;
        Connection conn = null;
        PreparedStatement ps = null;
        try{            
            conn = Conexao.getConexao();
            String sql = "SELECT * FROM disciplinas";
            ps = conn.prepareStatement(sql);
            ResultSet r =  ps.executeQuery();
            
            while(r.next()){
               disciplina = new Disciplina();
               
               disciplina.setIdDisciplina(r.getInt(1));
               disciplina.setNomeDisciplina(r.getString(2));
               disciplina.setIdCurso(r.getInt(3));
               disciplina.setCreditoDisciplina(String.valueOf(r.getInt(4)));
               disciplina.setTotalHorasDisciplina(String.valueOf(r.getInt(5)));
               disciplina.setTotalAlunosDisciplina(String.valueOf(r.getInt(6)));
               disciplina.setIdProfessor(r.getInt(7));
               
               disciplinaList.add(disciplina);               
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
        return disciplinaList;
    }
    
    public void inserirDisciplina(Disciplina disciplina) throws ExceptionEscola{
                
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConexao();
            String sql = "INSERT INTO disciplinas ("
                    + "nomeDisciplina,"
                    + "idCurso,"
                    + "credito,"
                    + "totalHoras,"
                    + "totalAlunos,"
                    + "idProfessor"                            
                    + ") VALUES(?, ?, ?, ?, ?, ?) ";
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, disciplina.getNomeDisciplina());
            ps.setInt(2, disciplina.getIdCurso());
            ps.setInt(3, Integer.parseInt(disciplina.getCreditoDisciplina()));
            ps.setInt(4, Integer.parseInt(disciplina.getTotalHorasDisciplina()));
            ps.setInt(5, Integer.parseInt(disciplina.getTotalAlunosDisciplina()));
            ps.setInt(6, disciplina.getIdProfessor());
                        
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
    
    public void atualizarDisciplina(Disciplina disciplina) throws ExceptionEscola{
        
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConexao();
            String sql = "U,PDATE disciplinas SET "
                    + "nomeDisciplina = ?,"
                    + "idCurso = ?,"
                    + "credito = ?,"
                    + "totalHoras = ?,"
                    + "totalAlunos = ?,"
                    + "idProfessor = ?"                    
                    + "WHERE nomeDisciplina = ?" ;
                        
            ps = conn.prepareStatement(sql);            
            
            ps.setString(1, disciplina.getNomeDisciplina());
            ps.setInt(2, disciplina.getIdCurso());
            ps.setInt(3, Integer.parseInt(disciplina.getCreditoDisciplina()));
            ps.setInt(4, Integer.parseInt(disciplina.getTotalHorasDisciplina()));
            ps.setInt(5, Integer.parseInt(disciplina.getTotalAlunosDisciplina()));
            ps.setInt(6, disciplina.getIdProfessor());
            ps.setString(7, disciplina.getNomeDisciplina());
            
            ps.execute();
            conn.commit();            
            
        } catch(SQLException ex){
            
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
