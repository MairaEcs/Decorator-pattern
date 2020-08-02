package br.edu.iftm.decorator;

/*
 * Classe decoradora utilizada para implementa��o de um decorador 
 */
public class Presunto extends Complemento {
	
	/*
	 * M�todo construtor
	 */
	public Presunto(PaoDeQueijo paoDeQueijo) {
		this.paoDeQueijo = paoDeQueijo;
	}
	
	/*
	 * Os m�todos na classe decoradora s�o os mesmos da inst�ncia de PaoDeQueijo
	 */
	
	@Override
	public String getDescricao() {
		return paoDeQueijo.getDescricao() + " Presunto|";
	}

	@Override
	public double preco() {
		return paoDeQueijo.preco() + 1.00;
	}
	
}
