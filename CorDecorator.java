package geradorRelatoriosBase;

public class CorDecorator extends FormatacaoDecorator{

	private String cor;
	
	public CorDecorator(Formatacao formatacao, String cor) {
		super(formatacao);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String formata() {
		return super.formata() + "color:" + this.cor + ";";
	}
	
}
