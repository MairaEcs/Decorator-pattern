package br.edu.iftm.decorator;

/*
 * Classe decoradora utilizada para implementação de um decorador 
 */
public class Presunto extends Complemento {
	
	/*
	 * Método construtor
	 */
	public Presunto(PaoDeQueijo paoDeQueijo) {
		this.paoDeQueijo = paoDeQueijo;
	}
	
	/*
	 * Os métodos na classe decoradora são os mesmos da instância de PaoDeQueijo
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
