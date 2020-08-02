package br.edu.iftm.decorator;
/*
 * Classe abstrata do objeto PaodeQueijo que define os métodos getDescrição e preço 
 */
public abstract class PaoDeQueijo {
	String descricao = "Pão de Queijo";

	public String getDescricao() {
		return descricao;
	}
	
	public abstract double preco();
	
	
}
