package geradorRelatoriosBase;

public class ContextoOrdenacao {
	public static final String ALG_INSERTIONSORT = "quick";
	public static final String ALG_QUICKSORT = "insertion";
	
	private AlgoritmoOrdenacao algoritmo;
	private int ini;
	private int fim;
	private Produto[] produtos;
	private String criterio;
	
	public ContextoOrdenacao(String algoritmo, int ini, int fim, Produto[] produtos, String criterio) {
		super();
		if(algoritmo == ALG_QUICKSORT) this.algoritmo = new QuickSort();
		else if(algoritmo == ALG_INSERTIONSORT) this.algoritmo = new InsertionSort();
		this.ini = ini;
		this.fim = fim;
		this.produtos = produtos;
		this.criterio = criterio;
	}

	public void setAlgoritmo(AlgoritmoOrdenacao algoritmo) {
        this.algoritmo = algoritmo;
    }
	
	public Produto[] executarOrdenacao() {
		Produto[] vetorProdutos = algoritmo.ordenar(ini, fim, produtos, criterio);
        return vetorProdutos;
    }
}
