package dao;

import modelo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO {
    ArrayList<Produto>minhaLista = new ArrayList();
//Função para cadastrar um novo produto.
    public boolean CadastrarProduto(Produto produto) {
        Conexao conexao = new Conexao();
        try (Connection conn = conexao.conectar()) {
            String sql = "INSERT INTO produto (nome, unidade,quantidade, preco, min, max, categoria) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(sql);

            st.setString(1, produto.getNome());
            st.setString(2, produto.getUnidade());
            st.setInt(3,produto.getQuantidade());
            st.setDouble(4, produto.getPreco());
            st.setInt(5, produto.getMin());
            st.setInt(6, produto.getMax());
            st.setString(7, produto.getCategoria());

            st.execute();
            st.close();

            System.out.println("Produto cadastrado com sucesso!");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
            return false;
        }
    }
//Função para procurar um produto a partir do id
    public Produto ProcurarProdutoID(int id) {
        Conexao conexao = new Conexao();
        Produto produto = new Produto();
        try (Connection conn = conexao.conectar()) {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM produto WHERE id = " + id);

            if (res.next()) {
                produto.setId(res.getInt("id"));
                produto.setNome(res.getString("nome"));
                produto.setUnidade(res.getString("unidade"));
                produto.setQuantidade(res.getInt("quantidade"));
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
//Função para procurar um produto no banco de dados a partir do nome.
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
                produto.setUnidade(res.getString("unidade"));
                produto.setQuantidade(res.getInt("quantidade"));
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
//função para atualizar um produto já existente.
    public boolean AtualizarProduto(Produto produto) {
        String sql = "UPDATE produto SET nome=?, unidade=?, preco=?, min=?, max=?, categoria=? WHERE id=?";
        Conexao conexao = new Conexao();

        try (Connection conn = conexao.conectar()) {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getUnidade());
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
//função para deletar um produto a partir do id dele.
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

    
    public ArrayList<Produto>getMinhaListaProdutos() {
        
        minhaLista.clear();
        Conexao conexao = new Conexao();
        
        try(Connection conn = conexao.conectar()){
            Statement stmt = conn.createStatement();          
            ResultSet res = stmt.executeQuery("SELECT * FROM produto");
            
            while(res.next()){
                int id = res.getInt("id");
                String nome = res.getString("nome");
                String unidade = res.getString("unidade");
                int quantidade = res.getInt("quantidade");
                double preco = res.getDouble("preco");
                int min = res.getInt("min");
                int max = res.getInt("max");
                String categoria = res.getString("categoria");
                
                Produto produto = new Produto(id,nome,unidade,preco,quantidade,min,max,categoria);
                minhaLista.add(produto);
}
                
                res.close();
                stmt.close();

            }catch(SQLException ex){
                    System.out.println("Erro: "+ex);
                    }
            return minhaLista;
    }
 

    public int MaiorID(){
       Conexao conexao = new Conexao();
        int MaiorID = 0;
        
        try(Connection conn = conexao.conectar()){
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id from produto");
            res.next();
            MaiorID = res.getInt("id");
            stmt.close();
                
        
    }catch(SQLException ex){
        System.out.println("Erro: "+ex);
    }
        return MaiorID;
    }
       
}
