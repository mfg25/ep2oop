package geradorRelatoriosBase.Ordenacao.Criterio;

import geradorRelatoriosBase.Produto;

public interface CriterioComparacao {
	boolean comparar(Produto a, Produto b);
}
