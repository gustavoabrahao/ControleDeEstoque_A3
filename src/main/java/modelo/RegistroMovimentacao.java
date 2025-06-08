/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author chicl
 */
public class RegistroMovimentacao {
    private int id;
    private int produtoId;
    private String tipoMovimentacao;
    private int quantidade;
    private String observacao;

    public RegistroMovimentacao() {
    }

    public RegistroMovimentacao(int id, int produtoId, String tipoMovimentacao, int quantidade, String observacao) {
        this.id = id;
        this.produtoId = produtoId;
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    @Override
    public String toString(){
        return "RegistroMovimentacao{"+
                "id ="+id+
                ",produto id ="+ produtoId+
                ",tipoMovimentacao="+ tipoMovimentacao +'\''+
                "quantidade ="+quantidade+
                "observacao="+observacao+ '\''+
                "}";
    }
    
}
