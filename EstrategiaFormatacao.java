package geradorRelatoriosBase;

public interface EstrategiaFormatacao {
	
	public static final int FORMATO_NEGRITO = 0b0001;
	public static final int FORMATO_ITALICO = 0b0010;
	
	String aplicarFormatacao(String texto);
}
