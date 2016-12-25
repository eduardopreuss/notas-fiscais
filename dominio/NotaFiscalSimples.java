package dominio;

public class NotaFiscalSimples extends NotaFiscal {
    
    public NotaFiscalSimples(Cliente c, int n){
        super (c,n);
    }
    
    public float imposto(){
        return (valorProdutos()*20/100);
    }
}
