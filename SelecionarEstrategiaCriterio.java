package geradorRelatoriosBase;

public class SelecionarEstrategiaCriterio {
	public static CriterioComparacao criarEstrategia(String criterio) {
        if (criterio.equals(AlgoritmoOrdenacao.CRIT_DESC_CRESC)) {
            return new CriterioDesc();
        } else if (criterio.equals(AlgoritmoOrdenacao.CRIT_PRECO_CRESC)) {
            return new CriterioPreco();
        } else if (criterio.equals(AlgoritmoOrdenacao.CRIT_ESTOQUE_CRESC)) {
            return new CriterioEstoque();
        } else {
            throw new IllegalArgumentException("Criterio invalido!");
        }
    }
}
