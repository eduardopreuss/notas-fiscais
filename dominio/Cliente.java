package dominio;

public class Cliente {
    private String nome;

    public Cliente(String pnome){
        this.setNome(pnome);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
