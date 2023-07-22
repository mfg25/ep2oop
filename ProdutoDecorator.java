package geradorRelatoriosBase;

public abstract class ProdutoDecorator implements Produto {
    protected Produto produtoDecorado;

    public ProdutoDecorator(Produto produtoDecorado) {
        this.produtoDecorado = produtoDecorado;
    }
    
    @Override
    public String formataParaImpressao() {
		return produtoDecorado.formataParaImpressao();
	}
}