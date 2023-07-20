package geradorRelatoriosBase;

public class QuickSort implements AlgoritmoOrdenacao {

	private CriterioComparacao criterio;

	public QuickSort(String criterio) {
		super();
		if (criterio == CRIT_DESC_CRESC) {
			this.criterio = new CriterioDesc();
		} else if (criterio == CRIT_PRECO_CRESC) {
			this.criterio = new CriterioPreco();
		} else if (criterio == CRIT_ESTOQUE_CRESC) {
			this.criterio = new CriterioEstoque();
		}
	}

	private int particiona(int ini, int fim, Produto[] produtos) {
		Produto x = produtos[ini];
		int i = (ini - 1);
		int j = (fim + 1);

		while (true) {

			do {
				j--;

			} while (!(criterio.comparar(produtos[j], x)));

			do {
				i++;

			} while (criterio.comparar(produtos[i], x));

			if (i < j) {
				Produto temp = produtos[i];
				produtos[i] = produtos[j];
				produtos[j] = temp;
			} else {
				return j;
			}

		}
	}

	@Override
	public Produto[] ordenar(int ini, int fim, Produto[] produtos) {

		if (ini < fim) {

			int q = particiona(ini, fim, produtos);

			ordenar(ini, q, produtos);
			ordenar(q + 1, fim, produtos);

		}
		return produtos;
	}
}
