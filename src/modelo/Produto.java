package modelo;


public class Produto{
    private int id;
    private String nome;
    private int unidade;
    private double preco;
    private int min;
    private int max;
    private String categoria;

    public Produto() {
    }

    public Produto(int id, String nome, int unidade, double preco, int min, int max, String categoria) {
        this.id = id;
        this.nome = nome;
        this.unidade = unidade;
        this.preco = preco;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
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

    public void setCategoria(String nomeCategoria) {
        this.categoria = categoria;
    }
    
    public String VerificacaoDeQuantidade(){
        if (this.getUnidade()<this.getMin()){
            return "A quantidade do produto: "+getNome()+" /está muito baixa, a quantidade minima é "+getMin()+" unidades";
            
        }else if(this.getUnidade()>this.getMax()){
            return "A quantidade do produto:"+getNome()+" /é muito alta, a quantidade máxima é "+getMax()+" unidades";
        }else{
            return "produto registrado com sucesso. A quantidade é "+getUnidade()+" unidades";
        }
    }
     
    public void cadastrarProduto(int id, String nome, int unidade, double preco, int min, int max, String categoria) {
        this.id = id;
        this.nome = nome;
        this.unidade = unidade;
        this.preco = preco;
        this.min = min;
        this.max = max;
        this.categoria = categoria;

        System.out.println("Produto cadastrado com sucesso: " + this.nome);
    }
    public void RegistrarEntrada(int quantidade){
        if(quantidade>0){
            this.unidade += quantidade;
            System.out.println("Entrada registrada: +"+quantidade +"unidades para o produto "+this.nome);
            System.out.println(VerificacaoDeQuantidade());
            
        }else{
            System.out.println("Erro: A quantidade de entrada deve ser maior que zero");
        }
    }
    public void RegistrarSaida(int quantidade){
        if (quantidade > 0){
            if(this.unidade >= quantidade){
                this.unidade -= quantidade;
                System.out.println("Saída Registrada: -"+quantidade+" unidades do produto "+this.nome);
                System.out.println(VerificacaoDeQuantidade());
                
            }else{
                System.out.println("Erro: Estoque insuficente para o produto"+this.nome);
            }
        }else{
            System.out.println("Erro: Aa quantidade de saída deve ser maior que zero.");
        }
        
    }
}

