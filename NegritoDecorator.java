package geradorRelatoriosBase;

public class NegritoDecorator extends FormatacaoDecorator{

	public NegritoDecorator(Formatacao formatacao) {
		super(formatacao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String formata() {
		return super.formata() + "font-style:bold;";
	}
	
	

}
