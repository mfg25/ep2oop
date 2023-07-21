package geradorRelatoriosBase;

public class FiltroEstoque implements FiltroComparacao{
	
	private String argFiltro;

	public FiltroEstoque(String argFiltro) {
		this.argFiltro = argFiltro;
	}

	@Override
	public boolean filtrar(Produto x) {
		return x.getQtdEstoque() <= Integer.parseInt(argFiltro);
	}

}
