package geradorRelatoriosBase.Filtro;

import geradorRelatoriosBase.Produto;

public interface FiltroComparacao {
	
	public static final String FILTRO_TODOS = "todos";
	public static final String FILTRO_ESTOQUE_MENOR_OU_IQUAL_A = "estoque_menor_igual";
	public static final String FILTRO_CATEGORIA_IGUAL_A = "categoria_igual";
	public static final String FILTRO_DESCRICAO_CONTEM = "descricao_contem";
	public static final String FILTRO_PRECO_INTERVALO = "filtro_intervalo";
	
	boolean filtrar(Produto x);
}
