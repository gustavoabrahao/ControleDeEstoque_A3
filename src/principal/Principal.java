package principal;

import visao.FrmListadeProduto;
import visao.FrmTelaPrincipal;
import visao.FrmMovimentacaoDeEstoque;
import visao.FrmListadeCategoria;
import visao.FrmRelatorio;
import dao.Conexao;


public class Principal {
    public static void main(String[] args) {

      Conexao connection = new Conexao();
      
        FrmTelaPrincipal telaPrincipal = new FrmTelaPrincipal();
        telaPrincipal.setVisible(true);
        
       
        
       
    }
}