package principal;

import visao.FrmListadeProdutos;
import visao.FrmTelaPrincipal;
import dao.Conexao;


public class Principal {
    public static void main(String[] args) {

       // Conexao.conectar(); esperando o kaduzinho terminar a parte dele


        FrmListadeProdutos telaProdutos = new FrmListadeProdutos();
        telaProdutos.setVisible(true);

        FrmTelaPrincipal telaPrincipal = new FrmTelaPrincipal();
        telaPrincipal.setVisible(true);
    }
}