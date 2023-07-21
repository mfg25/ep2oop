package geradorRelatoriosBase;

public class FormatacaoNegrito implements EstrategiaFormatacao{
	
	@Override
    public String aplicarFormatacao(String texto) {
        return "<span style=\"font-weight:bold\">" + texto + "</span>";
    }
}
