package geradorRelatoriosBase.Filtro;

import geradorRelatoriosBase.Produto;

public class FiltroPrecoIntervalo implements FiltroComparacao{
	
	private String argFiltro;

	public FiltroPrecoIntervalo(String argFiltro) {
		this.argFiltro = argFiltro;
	}
	
	@Override
	public boolean filtrar(Produto x) {
		String[] limites = argFiltro.split("-");
		
		double limiteInferior = Double.parseDouble(limites[0]);
	    double limiteSuperior = Double.parseDouble(limites[1]);
	    
	    return x.getPreco() >= limiteInferior && x.getPreco() <= limiteSuperior;

	}
}
