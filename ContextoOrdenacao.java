package geradorRelatoriosBase;

import java.util.List;

public class ContextoOrdenacao {
	public static final String ALG_INSERTIONSORT = "quick";
	public static final String ALG_QUICKSORT = "insertion";
	
	private AlgoritmoOrdenacao algoritmo;
	private int ini;
	private int fim;
	//C�digo antigo para caso de algum erro
	//private Produto[] produtos;
	private List<Produto> produtos;
	
	public ContextoOrdenacao(String algoritmo, int ini, int fim, List<Produto> produtos, String criterio) {
        super();
        if (algoritmo.equals(ALG_QUICKSORT)) this.algoritmo = new QuickSort(criterio);
        else if (algoritmo.equals(ALG_INSERTIONSORT)) this.algoritmo = new InsertionSort(criterio);
        this.ini = ini;
        this.fim = fim;
        this.produtos = produtos;
    }

	public void setAlgoritmo(AlgoritmoOrdenacao algoritmo) {
        this.algoritmo = algoritmo;
    }

	public List<Produto> executarOrdenacao() {
		List<Produto> listaProdutos = algoritmo.ordenar(ini, fim, produtos);
        return listaProdutos;
    }
}
