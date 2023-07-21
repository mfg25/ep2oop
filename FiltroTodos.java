package geradorRelatoriosBase;

public class FiltroTodos implements FiltroComparacao{
	
	@Override
	public boolean filtrar(Produto x) {
		return true;
	}
	
}
