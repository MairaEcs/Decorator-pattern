package br.edu.iftm.decorator;
/*
 * Classe utilizada para implemenção específica do PaodeQueijo
 */
public class TamanhoPequeno extends PaoDeQueijo{

	@Override
	public double preco() {
		return 1.00;
	}
	
	@Override
    public String getDescricao() {
		return descricao + " (tamanho pequeno)";
    }
	
		
}
