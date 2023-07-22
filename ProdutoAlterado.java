package geradorRelatoriosBase;

public class ProdutoAlterado extends ProdutoPadrao{
	
	private boolean italico;
	private boolean negrito;
	private String cor;

	public ProdutoAlterado(int id, String descricao, String categoria, int qtdEstoque, double preco, boolean italico, boolean negrito, String cor) {
		super(id, descricao, categoria, qtdEstoque, preco);
		// TODO Auto-generated constructor stub
	}

}
