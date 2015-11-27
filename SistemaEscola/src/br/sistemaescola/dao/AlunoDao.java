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
    
    public static ArrayList selecionarTodos()throws ExceptionEscola{
        
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
                aluno.setNomeAluno(rs.getString(2));
                aluno.setCpfAluno(rs.getString(3));
                aluno.setRgAluno(rs.getString(4));
                aluno.setNascimentoAluno(rs.getString(5));
                
                // informações contato
                aluno.setAlunoTelefone(rs.getString(6));
                aluno.setAlunoCelular(rs.getString(7));
                aluno.setAlunoEmail(rs.getString(8));
                
                // informações filiação
                aluno.setNomePai(rs.getString(9));
                aluno.setCpfPai(rs.getString(10));
                aluno.setRgPai(rs.getString(11));               
                aluno.setNomeMae(rs.getString(12));
                aluno.setCpfMae(rs.getString(13));
                aluno.setRgMae(rs.getString(14));
                
                // informação endereço
                aluno.setEstado(rs.getString(15));
                aluno.setBairro(rs.getString(16));
                aluno.setCidade(rs.getString(17));
                aluno.setRua(rs.getString(18));
                aluno.setNumero(rs.getString(19));
                                
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
    
    public static void inserirAluno(Aluno aluno) throws ExceptionEscola{
        
        // inserção do aluno na base.
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConexao();
            String sql = "INSERT INTO alunos ("
                    + "nome,"
                    + " cpf,"
                    + " rg,"
                    + " nascimento,"
                    + "telefone,"
                    + " celular,"
                    + " email,"
                    + "pai,"
                    + "cpf_pai,"
                    + "rg_pai,"
                    + "mae,"
                    + "cpf_mae,"
                    + "rg_mae,"                                                            
                    + " rua,"
                    + " bairro,"                    
                    + " cidade,"
                    + " estado,"
                    + " numero"                                                  
                    + ") VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                                    + "?, ?, ?, ?, ?, ?, ?, ?, ? ) ";
            
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, aluno.getNomeAluno());
            ps.setString(2, aluno.getCpfAluno());
            ps.setString(3, aluno.getRgAluno());
            ps.setString(4, aluno.getNascimentoAluno());
            ps.setString(5, aluno.getAlunoTelefone());   
            ps.setString(6, aluno.getAlunoCelular());   
            ps.setString(5, aluno.getAlunoEmail());
            ps.setString(6, aluno.getNomePai());            
            ps.setString(7, aluno.getCpfPai());   
            ps.setString(8, aluno.getRgPai());   
            ps.setString(9, aluno.getNomeMae());
            ps.setString(10, aluno.getCpfMae());   
            ps.setString(11, aluno.getRgMae());   
            ps.setString(12, aluno.getRua());   
            ps.setString(13, aluno.getBairro());   
            ps.setString(14, aluno.getCidade());   
            ps.setString(15, aluno.getEstado());   
            ps.setString(16, aluno.getNumero());   
            
            // executa o sql
            ps.execute(sql);
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