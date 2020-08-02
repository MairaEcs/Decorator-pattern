package br.edu.iftm.decorator;

public class Goiabada extends Complemento {

	public Goiabada(PaoDeQueijo paoDeQueijo) {
		this.paoDeQueijo = paoDeQueijo;
	}
	
	@Override
	public String getDescricao() {
		return paoDeQueijo.getDescricao() + " Goiabada|";
	}

	@Override
	public double preco() {
		return paoDeQueijo.preco() + 0.50;
	}

}
