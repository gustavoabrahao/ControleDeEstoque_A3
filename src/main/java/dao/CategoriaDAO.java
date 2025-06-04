package dao;

import modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    private Connection connection;


    public CategoriaDAO() {
        Conexao connection = new Conexao();
        Connection conn = connection.conectar();

        if (this.connection == null) {
            throw new RuntimeException("Erro ao conectar com o banco de dados");
        }
    }

    public void salvar(Categoria categoria) throws SQLException {
        String sql = "INSERT INTO categoria (nome) VALUES (?)";
        try (
                Connection conn = new Conexao().conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, categoria.getNomeCategoria());
            stmt.executeUpdate();
        }
    }


    public List<Categoria> listar() throws SQLException {
        List<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categoria";

        try (
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ) {
            while (rs.next()) {
                Categoria c = new Categoria(
                        rs.getInt("id"),
                        rs.getString("nome")
                );
                categorias.add(c);
            }
        }

        return categorias;
    }

    public void atualizar(Categoria categoria) throws SQLException {
        String sql = "UPDATE categoria SET nome = ? WHERE id = ?";

        try (
                PreparedStatement stmt = connection.prepareStatement(sql)
        ) {
            stmt.setString(1, categoria.getNomeCategoria());
            stmt.setInt(2, categoria.getId());
            stmt.executeUpdate();
        }
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM categoria WHERE id = ?";

        try (
                PreparedStatement stmt = connection.prepareStatement(sql)
        ) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}