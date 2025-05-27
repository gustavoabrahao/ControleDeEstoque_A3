
package modelo;


public class categoria {
    private String nome;
    private String tamanho;
    private String embalagem;
    
    public categoria () {}
    
    public categoria(String nome, String tamanho, String embalagem) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
    }
    public String getNome() {
        return nome;
    }
    
    
   public void setNome(String nome) {
       this.nome = nome;
   }
   
   public String getTamanho() {
       return tamanho;
   }
   
   public void setTamanho(String tamanho) {
       this.tamanho = tamanho;
   }
   
   public String getEmbalagem() {
       return embalagem;
   }
   
   public void setEmbalagem(String embalagem) {
       this.embalagem = embalagem;
   }
}

