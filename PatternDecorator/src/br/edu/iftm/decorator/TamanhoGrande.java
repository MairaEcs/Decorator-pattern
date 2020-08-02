package br.edu.iftm.decorator;

public class TamanhoGrande extends PaoDeQueijo{

	@Override
	public double preco() {
		return 2.00;
	}
	
	@Override
    public String getDescricao() {
        return descricao + " (tamanho pequeno)";
    }
}
