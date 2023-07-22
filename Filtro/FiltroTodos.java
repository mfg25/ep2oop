package geradorRelatoriosBase.Filtro;

import geradorRelatoriosBase.Produto;

public class FiltroTodos implements FiltroComparacao{
	
	@Override
	public boolean filtrar(Produto x) {
		return true;
	}
	
}
