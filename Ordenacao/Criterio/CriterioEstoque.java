package geradorRelatoriosBase.Ordenacao.Criterio;

import geradorRelatoriosBase.Produto;

public class CriterioEstoque implements CriterioComparacao{

	@Override
	public boolean comparar(Produto a, Produto b) {
		return a.getQtdEstoque() < b.getQtdEstoque();
	}

}
