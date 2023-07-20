package geradorRelatoriosBase;

public class CriterioEstoque implements CriterioComparacao{

	@Override
	public boolean comparar(Produto a, Produto b) {
		return a.getQtdEstoque() < b.getQtdEstoque();
	}

}
