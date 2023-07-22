package geradorRelatoriosBase;

import java.util.List;

public class InsertionSort implements AlgoritmoOrdenacao{
	
	private CriterioComparacao criterio;
		
	public InsertionSort(String criterio) {
		this.criterio = SelecionarEstrategiaCriterio.criarEstrategia(criterio);
	}

	@Override
	public List<Produto> ordenar(int ini, int fim, List<Produto> produtos) {
	    for (int i = ini; i <= fim; i++) {
	        Produto x = produtos.get(i);

	        int j = i - 1;

	        while (j >= ini && criterio.comparar(x, produtos.get(j))) {
	            produtos.set(j + 1, produtos.get(j));
	            j--;
	        }

	        produtos.set(j + 1, x);
	    }

	    return produtos;
	}


}
