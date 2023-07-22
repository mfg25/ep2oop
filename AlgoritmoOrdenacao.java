package geradorRelatoriosBase;

public interface AlgoritmoOrdenacao {
	
	public static final String CRIT_DESC_CRESC = "descricao_c";
	public static final String CRIT_PRECO_CRESC = "preco_c";
	public static final String CRIT_ESTOQUE_CRESC = "estoque_c";
	
	//Código antigo para caso de algum erro
	//Produto[] ordenar(int ini, int fim, Produto[] produtos);
	
	//Código novo do commit
	List<Produto> ordenar(int ini, int fim, List<Produto> produtos);
	
}
