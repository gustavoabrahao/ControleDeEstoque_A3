/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import visao.FrmListadeProdutos;
import visao.FrmTelaPrincipal;


public class principal {
    public static void main(String[] args) {
        FrmListadeProdutos telaProdutos = new FrmListadeProdutos();
        telaProdutos.setVisible(true);
        
        FrmTelaPrincipal telaPrincipal = new FrmTelaPrincipal(); 
        telaPrincipal.setVisible(true);
    }
}

