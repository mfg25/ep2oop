package geradorRelatoriosBase;

public class InsertionSort implements AlgoritmoOrdenacao{
	
	private CriterioComparacao criterio;
	
	public InsertionSort(String criterio) {
		super();
		if(criterio == CRIT_DESC_CRESC) {
			this.criterio = new CriterioDesc();
		}else if(criterio == CRIT_PRECO_CRESC) {
			this.criterio = new CriterioPreco();
		}
		else if(criterio == CRIT_ESTOQUE_CRESC) {
			this.criterio = new CriterioEstoque();
		}
	}

	@Override
	public Produto[] ordenar(int ini, int fim, Produto[] produtos) {
		
		for(int i = ini; i <= fim; i++){
			
			Produto x = produtos[i];

			int j = (i - 1);

			while(j >= ini){
				if(criterio.comparar(produtos[i], produtos[j])) {
					produtos[j + 1] = produtos[j];
					j--;
				}
			}
			produtos[j + 1] = x;
		}
		
		return produtos;
		
	}

}
