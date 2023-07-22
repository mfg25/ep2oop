package geradorRelatoriosBase;

import java.util.List;

public interface AlgoritmoOrdenacao {
	
	public static final String CRIT_DESC_CRESC = "descricao_c";
	public static final String CRIT_PRECO_CRESC = "preco_c";
	public static final String CRIT_ESTOQUE_CRESC = "estoque_c";
	
	//C�digo antigo para caso de algum erro
	//Produto[] ordenar(int ini, int fim, Produto[] produtos);
	
	//C�digo novo do commit
	List<Produto> ordenar(int ini, int fim, List<Produto> produtos);
	
}
