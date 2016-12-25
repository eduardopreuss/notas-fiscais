/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 0081159
 */
abstract public class NotaFiscal {
    private int numero;
    private Cliente cliente;
    private List<Produto> produtos;
    
    public NotaFiscal(Cliente c, int n){
        this.setCliente(c);
        this.setNumero(n);
        produtos = new ArrayList<Produto>();
    }



    public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public float valorProdutos(){
        float val = 0;
        for (Produto aux : produtos){
            val = val + aux.getPreco();
        }
        return val;
    }
    
    public float valorTotal(){
        return this.valorProdutos()+this.imposto();
    }   
    
    public void incluirProduto(Produto p){
        produtos.add(p);
    }
    
    public List getProdutos(){
        return produtos;
    }
    
    public abstract float imposto();    
}
