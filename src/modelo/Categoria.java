package modelo;

public class Categoria {
    private int id;
    private String nomeCategoria;

    public Categoria(int id, String nomeCategoria) {
        this.id = id;
        this.nomeCategoria = nomeCategoria;
    }

    public Categoria(String nome) {
        this(0, nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nome) {
        this.nomeCategoria = nome;
    }

    @Override
    public String toString() {
        return nomeCategoria;
    }
}
