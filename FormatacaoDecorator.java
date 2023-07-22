package geradorRelatoriosBase;

public abstract class FormatacaoDecorator implements Formatacao{
    public Formatacao formatacao;
    
    public FormatacaoDecorator(Formatacao formatacao) {
    	this.formatacao = formatacao;
    }

    @Override
	public String formata() {
		return formatacao.formata();
	}
}