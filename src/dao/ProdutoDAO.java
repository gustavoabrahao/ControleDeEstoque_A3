package dao;

import java.lang.RuntimeException;
import java.text.ParseException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import modelo.Produto;
import visao.FrmListadeProdutos;
import visao.FrmTelaPrincipal;

public class ProdutoDAO {

    Produto produto = new Produto();

    public void CadastrarProduto() {
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = Conexao.conectar();

            st = conn.prepareStatement(
                    "INSERT INTO produto " +
                            "(nome, unidade, preco, min, max, categoria) " +
                            "VALUES (?, ?, ?, ?, ?, ?)"
            );

            st.setString(1, produto.getNome());
            st.setInt(2, produto.getUnidade());
            st.setDouble(3, produto.getPreco());
            st.setInt(4, produto.getMin());
            st.setInt(5, produto.getMax());
            st.setString(6, produto.getCategoria());

            st.executeUpdate();

            System.out.println("Produto cadastrado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                Conexao.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void ProcurarProdutoID() {
        // A implementar
    }

    public void ProcurarProdutoNome() {
        // A implementar
    }

    public void AtualizarProduto() {
        Connection conn = null;
        PreparedStatement st = null;

        // A implementar
//        try {
//            conn = Conexao.conectar();
//            st = conn.prepareStatement(
//                "UPDATE produto SET ..."
//            );
    }

    public void DeletarProdutoID() {
        // A implementar
    }
}