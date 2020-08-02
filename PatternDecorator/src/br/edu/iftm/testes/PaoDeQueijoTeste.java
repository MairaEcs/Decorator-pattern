package br.edu.iftm.testes;

import br.edu.iftm.decorator.Goiabada;
import br.edu.iftm.decorator.PaoDeQueijo;
import br.edu.iftm.decorator.Presunto;
import br.edu.iftm.decorator.Requeijao;
import br.edu.iftm.decorator.TamanhoGrande;
import br.edu.iftm.decorator.TamanhoPequeno;

public class PaoDeQueijoTeste {

	public static void main(String[] args) {
		System.out.println("Pães de Queijo - Recheados");
		System.out.println("--------------------------");
		
		PaoDeQueijo paoDeQueijoA = new TamanhoGrande();
		paoDeQueijoA = new Presunto(paoDeQueijoA);
		System.out.println(paoDeQueijoA.getDescricao() + " -> R$ " + paoDeQueijoA.preco());
		
		PaoDeQueijo paoDeQueijoB = new TamanhoPequeno();
		paoDeQueijoB = new Requeijao(paoDeQueijoB);
		System.out.println(paoDeQueijoB.getDescricao() + " -> R$ " + paoDeQueijoB.preco());
		
		PaoDeQueijo paoDeQueijoC = new TamanhoGrande();
		paoDeQueijoC = new Requeijao(paoDeQueijoC);
		paoDeQueijoC = new Presunto(paoDeQueijoC);
		System.out.println(paoDeQueijoC.getDescricao() + " -> R$ " + paoDeQueijoC.preco());
		
		PaoDeQueijo paoDeQueijoD = new TamanhoGrande();
		paoDeQueijoD = new Goiabada(paoDeQueijoD);
		paoDeQueijoD = new Requeijao(paoDeQueijoD);
		System.out.println(paoDeQueijoD.getDescricao() + " -> R$ " + paoDeQueijoD.preco());
		
		PaoDeQueijo paoDeQueijoE = new TamanhoPequeno();
		paoDeQueijoE = new Goiabada(paoDeQueijoE);
		System.out.println(paoDeQueijoE.getDescricao() + " -> R$ " + paoDeQueijoE.preco());
		
		System.out.println("--------------------------");

	}

}
