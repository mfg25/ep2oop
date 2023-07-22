 package geradorRelatoriosBase.Ordenacao.Criterio;

import geradorRelatoriosBase.Ordenacao.AlgoritmoOrdenacao;

public class SelecionarEstrategiaCriterio {
	public static CriterioComparacao criarEstrategia(String criterio) {
        if (criterio.equals(AlgoritmoOrdenacao.CRIT_DESC_CRESC)) {
            return new CriterioDescricao();
        } else if (criterio.equals(AlgoritmoOrdenacao.CRIT_PRECO_CRESC)) {
            return new CriterioPreco();
        } else if (criterio.equals(AlgoritmoOrdenacao.CRIT_ESTOQUE_CRESC)) {
            return new CriterioEstoque();
        }else if (criterio.equals(AlgoritmoOrdenacao.CRIT_DESC_DEC)) {
            return new CriterioDescricaoDecrescente();
        }else if (criterio.equals(AlgoritmoOrdenacao.CRIT_PRECO_DEC)) {
            return new CriterioPrecoDecrescente();
        }else if (criterio.equals(AlgoritmoOrdenacao.CRIT_ESTOQUE_DEC)) {
            return new CriterioEstoqueDecrescente();
        }
        else {
            throw new IllegalArgumentException("Criterio invalido!");
        }
    }
}
