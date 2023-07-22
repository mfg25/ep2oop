package geradorRelatoriosBase;

public class ItalicoDecorator extends ProdutoFormatadoPadrao{

	public ItalicoDecorator(Produto produto) {
		super(produto);
	}
	
	@Override
	public String formataParaImpressao() {
	    return "<i>" + super.formataParaImpressao() + "</i>";
	}

}
