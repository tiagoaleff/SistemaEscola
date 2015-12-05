package br.sistemaescola.dao;

import br.sistemaescola.conexao.Conexao;
import br.sistemaescola.exception.ExceptionEscola;
import br.sistemaescola.object.Aluno;
import br.sistemaescola.object.Faltas;
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
public class FaltasDao {
 
        public void inserirFaltas (Faltas faltas) throws ExceptionEscola{
                
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConexao();
            String sql = "INSERT INTO faltas ("
                    + "idAluno,"
                    + "idCurso,"
                    + "idDisciplina,"
                    + "	primeiraAula,"
                    + "segundoAula,"
                    + "terceiraAula,"
                    + "dia,"
                    + "mes,"
                    + "ano"                                        
                    + ") VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            
            ps = conn.prepareStatement(sql);
                        
            ps.setInt(1, faltas.getIdAluno());
            ps.setInt(2, faltas.getIdCurso());
            ps.setInt(3, faltas.getIdDisciplina());
            ps.setBoolean(4, faltas.isPrimeiroPeriodo());
            ps.setBoolean(5, faltas.isSecundoPeriodo());
            ps.setBoolean(6, faltas.isTerceiroPeriodo());
            ps.setString(7, faltas.getDia());
            ps.setString(8, faltas.getMes());
            ps.setString(9, faltas.getAno());
            ps.setBoolean(10, faltas.isQuartoPeriodo());
            
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
        
        public static ArrayList selecionarTodos()throws ExceptionEscola{
        
        Connection conn = null;
        PreparedStatement ps = null;
        ArrayList<Faltas> resultadoLista = new ArrayList<Faltas>();
        try{            
            conn = Conexao.getConexao();
            String sql = "SELECT * FROM faltas";        
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            Faltas faltas;
            
            while(rs.next()){
                faltas = new Faltas();
                faltas.setIdFaltas(rs.getInt(1));
                faltas.setIdAluno(rs.getInt(2));
                faltas.setIdCurso(rs.getInt(3));
                faltas.setIdDisciplina(rs.getInt(4));
                faltas.setPrimeiroPeriodo(rs.getBoolean(5));
                faltas.setSecundoPeriodo(rs.getBoolean(6));
                faltas.setTerceiroPeriodo(rs.getBoolean(7));
                faltas.setDia(rs.getString(8));
                faltas.setMes(rs.getString(9));
                faltas.setAno(rs.getString(10));
                faltas.setQuartoPeriodo(rs.getBoolean(11));
                // configura um novo valor a lista
                resultadoLista.add(faltas);
                
            }
            
        }catch(SQLException ex){
            
            if(conn != null){
                try{
                    conn.rollback();
                }catch(SQLException e){
                    throw new ExceptionEscola(e.getMessage());
                }
            }
            JOptionPane.showMessageDialog(null, ex.getMessage());
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
        return resultadoLista;
    }
    
    /**
     * Este metodo deleta o campo atraves do nome que ele recebe.
     */
    public void deletar(String nome)throws ExceptionEscola{

       Connection conn = null;
       PreparedStatement ps = null;
       try{
           conn = Conexao.getConexao();
           String sql = "DELETE FROM faltas WHERE nome = ?";
           ps = conn.prepareStatement(sql);
           ps.setString(1, nome);
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
}