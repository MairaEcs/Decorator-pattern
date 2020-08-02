package br.edu.iftm.decorator;

public class Requeijao extends Complemento {

	public Requeijao(PaoDeQueijo paoDeQueijo) {
		this.paoDeQueijo = paoDeQueijo;
	}
	@Override
	public String getDescricao() {
		return paoDeQueijo.getDescricao() + " Requeijao|";
	}

	@Override
	public double preco() {
		return paoDeQueijo.preco() + 0.25;
	}
	



}
