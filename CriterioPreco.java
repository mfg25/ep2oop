package geradorRelatoriosBase;

public class CriterioPreco implements CriterioComparacao{

	@Override
	public boolean comparar(Produto a, Produto b) {
		return a.getPreco() < b.getPreco();
	}

}
