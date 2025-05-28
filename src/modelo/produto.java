
package modelo;


public class produto {
    private int id;
    private String nome;
    private int unidade;
    private double preço;
    private int min;
    private int max;
    private String categoria;

    public produto() {

    }

    public produto(int id, String nome, int unidade, double preço, int min, int max, String categoria) {
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String VerificacaoDeQuantidade(){
        if (this.getUnidade()<this.getMin()){
            return "A quantidade do produto está muito baixa, a quantidade minima é "+getMin()+" unidades";
            
        }else if(this.getUnidade()>this.getMax()){
            return "A quantidade do produto é muito alta, a quantidade máxima é "+getMax()+" unidades";
        }else{
            return "produto registrado com sucesso. A quantidade é "+getUnidade()+" unidades";
        }
    }
    
}
