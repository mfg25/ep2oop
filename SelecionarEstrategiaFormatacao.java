package geradorRelatoriosBase;

public class SelecionarEstrategiaFormatacao {
	public static EstrategiaFormatacao criarEstrategia(int formatacao) {
        if (formatacao == EstrategiaFormatacao.FORMATO_NEGRITO) {
            return new FormatacaoNegrito();
        } else if (formatacao == EstrategiaFormatacao.FORMATO_ITALICO) {
            return new FormatacaoItalico();
        } else {
            throw new IllegalArgumentException("Formatacao invalida!");
        }
    }
}
