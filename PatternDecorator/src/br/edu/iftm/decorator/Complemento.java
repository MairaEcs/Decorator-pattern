package br.edu.iftm.decorator;
/*
 * Classe abstrata que será utilizada para padronizar os objetos decoradores
 */
public abstract class Complemento extends PaoDeQueijo{
	public PaoDeQueijo paoDeQueijo;
	
	/* 
	 * 	O método (getDescricao) passou a ser abstrato pois irá 
	 *  ser usado por todas subclasses de - PaodeQueijo -
	 */
	public abstract String getDescricao();
	
	public abstract double preco();

}
