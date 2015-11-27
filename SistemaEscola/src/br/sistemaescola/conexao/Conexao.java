package br.sistemaescola.conexao;

import br.sistemaescola.exception.ExceptionEscola;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tiago Aleff
 */
public class Conexao {
    
    public static Connection getConexao() throws ExceptionEscola{
        Connection conn = null;
        try{            
            Class.forName("org.hsqldb.jdbcDriver");
            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/escoladb", "sa", "");            
        }catch(SQLException ex){
            throw new ExceptionEscola("Problemas ao conectar ao Banco de Dados");
        }catch(ClassNotFoundException e){
            throw new ExceptionEscola("Problemas ao conectar ao Banco de Dados");
        }
        return conn;
    }
}

