package geradorRelatoriosBase;

public class NegritoDecorator extends ProdutoDecorator{
	
    public NegritoDecorator(Produto produto) {
        super(produto);
    }

    @Override
    public String formataParaImpressao() {
        return "<b>" + super.formataParaImpressao() + "</b>";
    }

    //////////////////////////////////////////////////////////////
    
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
