package geradorRelatoriosBase;

public class ItalicoDecorator extends FormatacaoDecorator{

	public ItalicoDecorator(Formatacao formatacao) {
		super(formatacao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String formata() {
		return super.formata() + "font-style:italic;";
	}

}
