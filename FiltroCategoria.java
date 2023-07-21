package geradorRelatoriosBase;

public class FiltroCategoria implements FiltroComparacao{
	
	private String argFiltro;
	
	public FiltroCategoria(String argFiltro) {
		this.argFiltro = argFiltro;
	}

	@Override
	public boolean filtrar(Produto x) {
		return x.getCategoria().equalsIgnoreCase(argFiltro);
	}
	
}
