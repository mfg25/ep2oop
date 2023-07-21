package geradorRelatoriosBase;

public class ContextoOrdenacao {
	public static final String ALG_INSERTIONSORT = "quick";
	public static final String ALG_QUICKSORT = "insertion";
	
	private AlgoritmoOrdenacao algoritmo;
	private int ini;
	private int fim;
	private Produto[] produtos;

	
	public ContextoOrdenacao(String algoritmo, int ini, int fim, Produto[] produtos, String criterio) {
		super();
		if(algoritmo.equals(ALG_QUICKSORT)) this.algoritmo = new QuickSort(criterio);
		else if(algoritmo.equals(ALG_INSERTIONSORT)) this.algoritmo = new InsertionSort(criterio);
		this.ini = ini;
		this.fim = fim;
		for(int i = 0; i < produtos.length; i++){
			this.produtos[i] = produtos[i];
		}
	}

	public void setAlgoritmo(AlgoritmoOrdenacao algoritmo) {
        this.algoritmo = algoritmo;
    }
	
	public Produto[] executarOrdenacao() {
		Produto[] vetorProdutos = algoritmo.ordenar(ini, fim, produtos);
        return vetorProdutos;
    }
}
