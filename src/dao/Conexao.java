package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static Connection connection = null;

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/db_produto?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "TrabalhoA3";

    public static Connection conectar() {
        if (connection != null) {
            return connection;
        }

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC do MySQL não encontrado. Verifique se o connector está no classpath.");
            throw new RuntimeException("Driver JDBC não carregado", e);
        }

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Status: Conectado com sucesso ao banco de dados.");
        } catch (SQLException e) {
            System.err.println("Erro ao tentar conectar ao banco de dados:");
            System.err.println("Mensagem: " + e.getMessage());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Código do erro: " + e.getErrorCode());
            throw new RuntimeException("Falha na conexão com o banco de dados", e);
        }

        return connection;
    }

    public static void desconectar() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexão encerrada.");
            } catch (SQLException e) {
                throw new RuntimeException("Erro ao desconectar do banco de dados", e);
            } finally {
                connection = null;
            }
        }
    }
}