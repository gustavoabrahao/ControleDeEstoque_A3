package principal;

import visao.FrmListadeProdutos;
import visao.FrmTelaPrincipal;


public class Principal {
    public static void main(String[] args) {
        FrmListadeProdutos telaProdutos = new FrmListadeProdutos();
        telaProdutos.setVisible(true);
        
        FrmTelaPrincipal telaPrincipal = new FrmTelaPrincipal(); 
        telaPrincipal.setVisible(true);
    }
}
