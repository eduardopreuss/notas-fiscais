package testes;
import dominio.*;
import java.util.ArrayList;
import java.util.List;

public class TesteNotas {
    
    public static void main(String args[]){
        Cliente c1 = new Cliente ("Joao");
        Cliente c2 = new Cliente ("Jose");
        Cliente c3 = new Cliente ("Maria");
        Cliente c4 = new Cliente ("Paula");
        
        NotaFiscal n1 = new NotaFiscalSimples(c1,1);
        Produto p1 = new Produto("computador", 900);
        Produto p2 = new Produto("teclado", 20);
        Produto p3 = new Produto("mouse", 15);
        n1.incluirProduto(p1);
        n1.incluirProduto(p2);
        n1.incluirProduto(p3);
        
        NotaFiscal n2 = new NotaFiscalSimples(c3,2);
        Produto p4 = new Produto("caderno", 10);
        Produto p5 = new Produto("caneta", 5);
        Produto p6 = new Produto("lapis", 1);
        n2.incluirProduto(p4);
        n2.incluirProduto(p5);
        n2.incluirProduto(p6);
        
        NotaFiscal n3 = new NotaFiscalComplexa(c1,3);
        Produto p7 = new Produto("sensor PH", 1000);
        Produto p8 = new Produto("sensor temperatura", 2000);
        n3.incluirProduto(p7);
        n3.incluirProduto(p8);
        
        NotaFiscal n4 = new NotaFiscalComplexa(c2,4);
        Produto p9 = new Produto("medidor UV", 10500);
        Produto p10 = new Produto("Medidor Solar", 20500);
        n4.incluirProduto(p9);
        n4.incluirProduto(p10);
        
        List<NotaFiscal> notas = new ArrayList<NotaFiscal>();
        notas.add(n1);
        notas.add(n2);
        notas.add(n3);
        notas.add(n4);
        
        for (NotaFiscal nota: notas){
            List<Produto>prods = new ArrayList<Produto>();
            prods = nota.getProdutos();
            System.out.println("Numero:"+nota.getNumero());
            System.out.println("Cliente:"+nota.getCliente().getNome());
            System.out.println("Produtos");
            for (Produto p: prods){
                System.out.println(""+p.getDescricao()+":"+p.getPreco());
            }
            System.out.println("Valor Produtos:"+nota.valorProdutos());
            System.out.println("Valor do Imposto:"+nota.imposto());
            System.out.println("Valor Total:"+nota.valorTotal());
            System.out.println("--------------------");
        }
        
    }
    
}