package br.edu.iftm.decorator;
/*
 * Classe abstrata que ser� utilizada para padronizar os objetos decoradores
 */
public abstract class Complemento extends PaoDeQueijo{
	public PaoDeQueijo paoDeQueijo;
	
	/* 
	 * 	O m�todo (getDescricao) passou a ser abstrato pois ir� 
	 *  ser usado por todas subclasses de - PaodeQueijo -
	 */
	public abstract String getDescricao();
	
	public abstract double preco();

}
