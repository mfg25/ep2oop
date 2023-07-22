package geradorRelatoriosBase;

public interface ProdutoFormatado extends Produto{
	String formataParaImpressaoFormatada(EstrategiaFormatacao estrategia);
}
