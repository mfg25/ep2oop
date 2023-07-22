package geradorRelatoriosBase.Ordenacao;

import java.util.List;

import geradorRelatoriosBase.Produto;

public interface AlgoritmoOrdenacao {
	
	public static final String CRIT_DESC_CRESC = "descricao_c";
	public static final String CRIT_PRECO_CRESC = "preco_c";
	public static final String CRIT_ESTOQUE_CRESC = "estoque_c";
	public static final String CRIT_DESC_DEC = "descricao_d";
	public static final String CRIT_PRECO_DEC = "preco_d";
	public static final String CRIT_ESTOQUE_DEC = "estoque_d";
	
	List<Produto> ordenar(int ini, int fim, List<Produto> produtos);
	
}
