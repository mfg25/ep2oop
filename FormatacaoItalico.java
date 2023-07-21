package geradorRelatoriosBase;

public class FormatacaoItalico implements EstrategiaFormatacao{
	
	@Override
	public String aplicarFormatacao(String texto) {
        return "<span style=\"font-style:italic\">" + texto + "</span>";
    }
}
