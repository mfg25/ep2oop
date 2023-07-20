package geradorRelatoriosBase;

public interface CriterioComparacao {
	
	public static final String CRIT_DESC_CRESC = "descricao_c";
	public static final String CRIT_PRECO_CRESC = "preco_c";
	public static final String CRIT_ESTOQUE_CRESC = "estoque_c";
	
	boolean comparar(Produto a, Produto b);
}
