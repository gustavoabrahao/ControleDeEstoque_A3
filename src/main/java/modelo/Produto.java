package modelo;
import java.util.ArrayList;
import dao.ProdutoDAO;


public class Produto{
    private int id;
    private String nome;
    private int unidade;
    private double preco;
    private int quantidade;
    private int min;
    private int max;
    private String categoria;
    private ProdutoDAO dao;

    public Produto() {
        this(0,"",0,0.0,0,0,1000,"");
    }

    public Produto(int id, String nome, int unidade, double preco, int quantidade,int min, int max, String categoria) {
        this.id = id;
        this.nome = nome;
        this.unidade = unidade;
        this.preco = preco;
        this.quantidade = quantidade;
        this.min = min;
        this.max = max;
        this.categoria = categoria;
        dao = new ProdutoDAO();
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
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;  
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
        if (this.getQuantidade()<this.getMin()){
            return "A quantidade do produto: "+getNome()+" /está muito baixa, a quantidade minima é "+getMin()+" unidades";
            
        }else if(this.getQuantidade()>this.getMax()){
            return "A quantidade do produto:"+getNome()+" /é muito alta, a quantidade máxima é "+getMax()+" unidades";
        }else{
            return "produto registrado com sucesso. A quantidade é "+getQuantidade()+" unidades";
        }
    }
     
    public void cadastrarProduto(int id, String nome, int unidade,int quantidade, double preco, int min, int max, String categoria) {
        this.id = id;
        this.nome = nome;
        this.unidade = unidade;
        this.quantidade = quantidade;
        this.preco = preco;
        this.min = min;
        this.max = max;
        this.categoria = categoria;

        System.out.println("Produto cadastrado com sucesso: " + this.nome);
    }
    public void RegistrarEntrada(int quantidade){
        if(quantidade>0){
            this.quantidade += quantidade;
            System.out.println("Entrada registrada: +"+quantidade +"unidades para o produto "+this.nome);
            System.out.println(VerificacaoDeQuantidade());
            
        }else{
            System.out.println("Erro: A quantidade de entrada deve ser maior que zero");
        }
    }
    public void RegistrarSaida(int quantidade){
        if (quantidade > 0){
            if(this.quantidade >= quantidade){
                this.quantidade -= quantidade;
                System.out.println("Saída Registrada: -"+quantidade+" unidades do produto "+this.nome);
                System.out.println(VerificacaoDeQuantidade());
                
            }else{
                System.out.println("Erro: Estoque insuficente para o produto"+this.nome);
            }
        }else{
            System.out.println("Erro: Aa quantidade de saída deve ser maior que zero.");
        }
        
    }
    
    public boolean RegistrarProduto(String nome,int unidade,double preco,int quantidade,int min, int max,String categoria){
        int id = dao.MaiorID()+1;
        
        Produto NovoProduto = new Produto(id,nome,unidade, preco,quantidade,min,max,categoria);
        
        dao.CadastrarProduto(NovoProduto);
        return true;
        
        
    }
    public boolean AtualizarProduto(int id, String nome, double preco,int quantidade, int min, int max, String categoria){
        Produto ProdutoAtualizado = new Produto(id,nome,0,preco,quantidade,min,max,categoria);
        dao.AtualizarProduto(ProdutoAtualizado);
        return true;
    }
    public boolean DeletarProduto(int id){
        return dao.DeletarProdutoID(id);
        
    }
    public Produto ProcurarProdutoId(int id){
        return dao.ProcurarProdutoID(id);
        
    }
    public Produto ProcurarProdutoNome(String nome){
        return dao.ProcurarProdutoNome(nome);
        
    }
    public ArrayList<Produto>getMinhaLista(){
        return dao.getMinhaListaProdutos();
        
    }
            
}

