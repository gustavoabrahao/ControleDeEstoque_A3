package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String SERVER = "localhost";
    private static final String DATABASE = "db_produto";
    private static final String URL = "jdbc:mysql://" + SERVER + ":3306/" + DATABASE + "?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "TrabalhoA3";

    public Connection conectar() {
        try {
            Class.forName(DRIVER);

            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Status: Conectado!");
            return connection;

        } catch (ClassNotFoundException e) {
            System.err.println("Erro: Driver JDBC não encontrado: " + e.getMessage());
            //System.exit(1);

        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            //System.exit(1);
        }
        return null;
    }
}
