package geradorRelatoriosBase.Filtro;

public class SelecionarEstrategiaFiltro {
	public static FiltroComparacao criarEstrategia(String filtro, String argFiltro) {
        if (filtro.equals(FiltroComparacao.FILTRO_TODOS)) {
            return new FiltroTodos();
        } else if (filtro.equals(FiltroComparacao.FILTRO_ESTOQUE_MENOR_OU_IQUAL_A)) {
            return new FiltroEstoque(argFiltro);
        } else if (filtro.equals(FiltroComparacao.FILTRO_CATEGORIA_IGUAL_A)) {
            return new FiltroCategoria(argFiltro);
        } else {
            throw new IllegalArgumentException("Criterio invalido!");
        }
    }
}
