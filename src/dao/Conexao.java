package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar() {
        Connection connection = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "db_produto";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "TrabalhoA3";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: Não conectado!");
            }

            return connection;

        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar ao banco de dados");
            e.printStackTrace();
            return null;
        }
    }
}
