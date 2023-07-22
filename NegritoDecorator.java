package geradorRelatoriosBase;

public class NegritoDecorator extends ProdutoFormatadoPadrao{
	
    public NegritoDecorator(Produto produto) {
        super(produto);
    }

    @Override
    public String formataParaImpressao() {
        return "<b>" + super.formataParaImpressao() + "</b>";
    }

}
