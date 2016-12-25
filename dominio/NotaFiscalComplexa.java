package dominio;

public class NotaFiscalComplexa extends NotaFiscal {
    public NotaFiscalComplexa(Cliente c, int n){
        super (c,n);
    }
    
    public float imposto(){
        return 100;
    }
}
