package testte;

import dao.Conexao;
import java.sql.Connection;

public class TesteConexao {
    public static void main(String[] args) {
        Connection conn = Conexao.conectar();

        if (conn != null) {
            System.out.println("Conexão realizada com sucesso!");
            try {
                conn.close(); // Boa prática: fechar a conexão após o uso
                System.out.println("Conexão encerrada.");
            } catch (Exception e) {
                System.out.println("Erro ao encerrar a conexão.");
                e.printStackTrace();
            }
        } else {
            System.out.println("Erro na conexão com o banco de dados.");
        }
    }
}

