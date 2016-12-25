package dominio;


public class Produto {
    private String descricao;
    private float preco;
    
    public Produto(String pdescricao, float ppreco){
        this.setDescricao(pdescricao);
        this.setPreco(ppreco);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
