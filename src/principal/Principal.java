package principal;

import visao.FrmListadeProdutos;
import visao.FrmTelaPrincipal;
import visao.FrmMovimentacaoDeEstoque;
import visao.FrmListadeCategorias;
import visao.FrmRelatorios;
import dao.Conexao;


public class Principal {
    public static void main(String[] args) {

      Conexao connection = new Conexao();
      


        FrmListadeProdutos telaProdutos = new FrmListadeProdutos();
        telaProdutos.setVisible(true);

        FrmTelaPrincipal telaPrincipal = new FrmTelaPrincipal();
        telaPrincipal.setVisible(true);
        
        FrmMovimentacaoDeEstoque telaMovimentacao = new FrmMovimentacaoDeEstoque();
        telaMovimentacao.setVisible(true);
        
        FrmListadeCategorias telaCategorias = new FrmListadeCategorias();
        telaCategorias.setVisible(true);
        
        FrmRelatorios telaRelatorios = new FrmRelatorios();
        telaRelatorios.setVisible(true);
    }
}