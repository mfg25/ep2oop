package geradorRelatoriosBase;

public class ProdutoFormatadoPadrao implements ProdutoFormatado{
	private Produto produto;

    public ProdutoFormatadoPadrao(Produto produto) {
        this.produto = produto;
    }
    
    @Override
    public String formataParaImpressao() {
        return produto.formataParaImpressao();
    }
    
	@Override
	public String formataParaImpressaoFormatada(EstrategiaFormatacao estrategia) {
		String textoFormatado = estrategia.aplicarFormatacao(produto.formataParaImpressao());
        return textoFormatado;
	}
	
	////////////////////////////////////////////
	
	@Override
	public void setQtdEstoque(int qtdEstoque) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPreco(double preco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getQtdEstoque() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
