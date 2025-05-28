/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane; 
/**
 *
 * @author chicl
 */
public class ProdutoDAO {
    
    public Connection getConexao(){
        
        Connection connection = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            
            String server = "localhost";
            String database = "db_produto";
            String url = "jdbc:mysql://"+server+":3306/"+
                    database+"?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "TrabalhoA3";
            
            connection = DriverManager.getConnection(url,user,password);
            
            if (connection != null){
                System.out.println("Status: Conectado!");
            }else{
                System.out.println("Status: Não conectado!");
            }
            return connection;
            
            
                
        }catch(ClassNotFoundException e){
            System.out.println("Drive não encontrado");
            return null;
        }catch (SQLException e){
            System.out.println("Nao foi possivel conectar");
            return null;
        }
        
           
    }
  
  
    public void criarProduto(){
     
    }
    public void LerProduto(){
        
    }
    public void AtualizarProduto(){
        
    }
    public void DeletarProduto(){
        
    }
}