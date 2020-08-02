package br.edu.iftm.decorator;
/*
 * Classe abstrata do objeto PaodeQueijo que define os m�todos getDescri��o e pre�o 
 */
public abstract class PaoDeQueijo {
	String descricao = "P�o de Queijo";

	public String getDescricao() {
		return descricao;
	}
	
	public abstract double preco();
	
	
}
