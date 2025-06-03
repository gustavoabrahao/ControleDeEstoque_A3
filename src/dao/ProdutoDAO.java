package dao;

import modelo.Produto;
import java.sql.*;

public class ProdutoDAO {

    public boolean CadastrarProduto(Produto produto) {
        Conexao conexao = new Conexao();
        try (Connection conn = conexao.conectar()) {
            String sql = "INSERT INTO produto (nome, unidade, preco, min, max, categoria) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(sql);

            st.setString(1, produto.getNome());
            st.setInt(2, produto.getUnidade());
            st.setDouble(3, produto.getPreco());
            st.setInt(4, produto.getMin());
            st.setInt(5, produto.getMax());
            st.setString(6, produto.getCategoria());

            st.execute();
            st.close();

            System.out.println("Produto cadastrado com sucesso!");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
            return false;
        }
    }

    public Produto ProcurarProdutoID(int id) {
        Conexao conexao = new Conexao();
        Produto produto = new Produto();
        try (Connection conn = conexao.conectar()) {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM produto WHERE id = " + id);

            if (res.next()) {
                produto.setId(res.getInt("id"));
                produto.setNome(res.getString("nome"));
                produto.setUnidade(res.getInt("unidade"));
                produto.setPreco(res.getDouble("preco"));
                produto.setMin(res.getInt("min"));
                produto.setMax(res.getInt("max"));
                produto.setCategoria(res.getString("categoria"));
            }

            res.close();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }

        return produto;
    }

    public Produto ProcurarProdutoNome(String nome) {
        Conexao conexao = new Conexao();
        Produto produto = new Produto();
        try (Connection conn = conexao.conectar()) {
            String sql = "SELECT * FROM produto WHERE nome = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet res = stmt.executeQuery();

            if (res.next()) {
                produto.setId(res.getInt("id"));
                produto.setNome(res.getString("nome"));
                produto.setUnidade(res.getInt("unidade"));
                produto.setPreco(res.getDouble("preco"));
                produto.setMin(res.getInt("min"));
                produto.setMax(res.getInt("max"));
                produto.setCategoria(res.getString("categoria"));
            }

            res.close();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }

        return produto;
    }

    public boolean AtualizarProduto(Produto produto) {
        String sql = "UPDATE produto SET nome=?, unidade=?, preco=?, min=?, max=?, categoria=? WHERE id=?";
        Conexao conexao = new Conexao();

        try (Connection conn = conexao.conectar()) {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getUnidade());
            stmt.setDouble(3, produto.getPreco());
            stmt.setInt(4, produto.getMin());
            stmt.setInt(5, produto.getMax());
            stmt.setString(6, produto.getCategoria());
            stmt.setInt(7, produto.getId());

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Produto atualizado com sucesso!");
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro.getMessage());
            return false;
        }
    }

    public boolean DeletarProdutoID(int id) {
        Conexao conexao = new Conexao();

        try (Connection conn = conexao.conectar()) {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM produto WHERE id = " + id);
            stmt.close();

            System.out.println("Produto deletado com sucesso!");
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro.getMessage());
            return false;
        }
    }

    
    public boolean RetornarListaProdutos() {
        return true;
    }

    public boolean RetornarListaCategoria() {
        return true;
    }
}
