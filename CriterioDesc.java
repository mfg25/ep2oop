package geradorRelatoriosBase;

public class CriterioDesc implements CriterioComparacao{

	@Override
	public boolean comparar(Produto a, Produto b) {
		return a.getDescricao().compareToIgnoreCase(b.getDescricao()) < 0;
	}

}
