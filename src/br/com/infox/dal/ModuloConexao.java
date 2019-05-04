/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;
import java.sql.*;

/**
 *
 * @author leoca
 */
public class ModuloConexao {
    //metodo responsavel por estabelecer conexao com o banco
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // alinha abaixo chama o driver importado 
        
        String driver = "com.mysql.jdbc.Driver";
        // Arnazenando informaçoes referentes ao banco de dados
        
        String url= "jdbc:mysql://localhost:3306/dbinfox";
        String user="root";
        String password="";
        
        //Estavelcendo a conexao com o banco de dados
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
        
            
    }
}
