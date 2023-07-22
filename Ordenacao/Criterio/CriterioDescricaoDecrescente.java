package geradorRelatoriosBase.Ordenacao.Criterio;

import geradorRelatoriosBase.Produto;

public class CriterioDescricaoDecrescente implements CriterioComparacao{

	@Override
	public boolean comparar(Produto a, Produto b) {
		return a.getDescricao().compareToIgnoreCase(b.getDescricao()) > 0;
	}

}