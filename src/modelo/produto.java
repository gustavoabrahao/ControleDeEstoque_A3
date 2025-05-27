
package modelo;


public class produto {
    private int id;
    private String nome;
    private int unidade;
    private double preço;
    private int min;
    private int max;
    private categoria categoria;
    
    public produto() {

    }

    public produto(int id, String nome, int unidade, double preço, int min, int max, categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.unidade = unidade;
        this.preço = preço;
        this.min = min;
        this.max = max;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }
    
    public String VerificacaoDeQuantidade(){
        if (this.getUnidade()<this.getMin()){
            return "A quantidade do produto está muito baixa.";
            
        }else if(this.getUnidade()>this.getMax()){
            return "A quantidade do produto é muito alta.";
        }else{
            return "produto registrado com sucesso.";
        }
    }
}
