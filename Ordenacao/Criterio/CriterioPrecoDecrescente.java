package geradorRelatoriosBase.Ordenacao.Criterio;

import geradorRelatoriosBase.Produto;

public class CriterioPrecoDecrescente implements CriterioComparacao{

	@Override
	public boolean comparar(Produto a, Produto b) {
		return a.getPreco() > b.getPreco();
	}

}
