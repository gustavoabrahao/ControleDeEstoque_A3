package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
   
    
     

    public  Connection conectar() {
        
        Connection connection = null;
        try{
            String server = "localhost";
            String database = "db_produto";
            String DRIVER = "com.mysql.cj.jdbc.Driver";
            String URL = "jdbc:mysql://localhost:3306/db_produto?useTimezone=true&serverTimezone=UTC";
            String USER = "root";
            String PASSWORD = "TrabalhoA3";
            
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
    
            if (connection != null) {
                System.out.println("Status: Conectado!");
                
            }else{
                System.out.println("Status: Não Conectado!");
                
            }
            
            return connection;

//        }catch (ClassNotFoundException e) {
//            System.out.println("Driver JDBC do MySQL não encontrado..");
//            e.printStackTrace();
//            return null;
            
        }catch(SQLException e){
            System.out.println("Não foi possivel conectar");
            
            return null;
            
        }
        
    }
   

        
      
    }

 