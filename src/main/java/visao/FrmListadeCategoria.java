package visao;

import modelo.Categoria;
import dao.CategoriaDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmListadeCategoria extends javax.swing.JFrame {

    private JFrame janelaAnterior;
    public FrmListadeCategoria(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
        initComponents();
        carregarTabela();
    }
    public FrmListadeCategoria() {
        initComponents();
        carregarTabela();
    }
    
    public void carregarTabela() {
        
        try {
      
        CategoriaDAO dao = new CategoriaDAO();
        List<Categoria> lista = dao.listarCategorias();
        
        DefaultTableModel modelo = (DefaultTableModel) JTListaCategoria.getModel();
        modelo.setRowCount(0);

        for (Categoria c : lista) {
            modelo.addRow(new Object[]{
                c.getId(), 
                c.getNomeCategoria(),
                c.getTamanho(),
                c.getEmbalagem()               
            });
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erro ao carregar categorias: " + e.getMessage());
    }
    }      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTListaCategoria = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        JBVoltarLC = new javax.swing.JButton();
        JBAdicionar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Categoria");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Lista de Categoria");

        JTListaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Tamanho", "Embalagem"
            }
        ));
        jScrollPane1.setViewportView(JTListaCategoria);

        JBVoltarLC.setText("Voltar");
        JBVoltarLC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarLCActionPerformed(evt);
            }
        });

        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });

        JBEditar.setText("Editar");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        JBExcluir.setBackground(new java.awt.Color(220, 53, 69));
        JBExcluir.setText("Excluir");
        JBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(JBAdicionar)
                        .addGap(42, 42, 42)
                        .addComponent(JBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBVoltarLC)
                        .addGap(42, 42, 42)
                        .addComponent(JBExcluir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(230, 230, 230))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBVoltarLC)
                    .addComponent(JBAdicionar)
                    .addComponent(JBEditar)
                    .addComponent(JBExcluir))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBVoltarLCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarLCActionPerformed
        if (janelaAnterior != null) {
            janelaAnterior.setVisible(true);
        }
        dispose();
    }//GEN-LAST:event_JBVoltarLCActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        FrmCadastroDeCategoria cadastro = new FrmCadastroDeCategoria(this);
        cadastro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        int linhaSelecionada = JTListaCategoria.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria para editar.");
            return;
        }

        int id = (int) JTListaCategoria.getValueAt(linhaSelecionada, 0);
        String nome = (String) JTListaCategoria.getValueAt(linhaSelecionada, 1);
        String tamanho = (String) JTListaCategoria.getValueAt(linhaSelecionada, 2);
        String embalagem = (String) JTListaCategoria.getValueAt(linhaSelecionada, 3);

        Categoria categoria = new Categoria(id, nome, tamanho, embalagem);

        FrmCadastroDeCategoria telaEdicao = new FrmCadastroDeCategoria(this, categoria);
        telaEdicao.setVisible(true);
    }//GEN-LAST:event_JBEditarActionPerformed

    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed
        int linhaSelecionada = JTListaCategoria.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria para excluir.");
            return;
        }

        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir essa categoria?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (confirmacao != JOptionPane.YES_OPTION) {
            return;
        }

        int idCategoria = (int) JTListaCategoria.getValueAt(linhaSelecionada, 0); // ID na coluna 0

        try {
            CategoriaDAO dao = new CategoriaDAO();
            dao.excluir(idCategoria);

            JOptionPane.showMessageDialog(this, "Categoria excluída com sucesso!");
            carregarTabela();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir categoria: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBExcluirActionPerformed

  
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListadeCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JButton JBExcluir;
    private javax.swing.JButton JBVoltarLC;
    private javax.swing.JTable JTListaCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
