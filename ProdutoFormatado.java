package geradorRelatoriosBase;

import java.text.NumberFormat;

public class ProdutoFormatado implements Produto{
	
	private static final String SEPARADOR = ", ";
	private int id;
	private String descricao;
	private String categoria;
	private int qtdEstoque;
	private double preco;
	private boolean italico;
	private boolean negrito;
	private String cor;

	
	public ProdutoFormatado(int id, String descricao, String categoria, int qtdEstoque, double preco, boolean italico,
			boolean negrito, String cor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.categoria = categoria;
		this.qtdEstoque = qtdEstoque;
		this.preco = preco;
		this.italico = italico;
		this.negrito = negrito;
		this.cor = cor;
	}
	public boolean isItalico() {
		return italico;
	}
	public void setItalico(boolean italico) {
		this.italico = italico;
	}
	public boolean isNegrito() {
		return negrito;
	}
	public void setNegrito(boolean negrito) {
		this.negrito = negrito;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	@Override
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public int getId() {
		return this.id;
	}
	@Override
	public String getDescricao() {
		return this.descricao;
	}
	@Override
	public String getCategoria() {
		return this.categoria;
	}
	@Override
	public int getQtdEstoque() {
		return this.qtdEstoque;
	}
	@Override
	public double getPreco() {
		return this.preco;
	}
	@Override
	public String formataParaImpressao() {
		
		Formatacao formatacao = new FormatacaoSimples();
		
		if(italico) {
			formatacao = new ItalicoDecorator(formatacao);
		}
		if(negrito) {
			formatacao = new NegritoDecorator(formatacao);
		}
		if(cor != null) {
			formatacao = new CorDecorator(formatacao, cor);
		}
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		return "<span style=\"" + formatacao.formata() + "\">" + getDescricao() + SEPARADOR + getCategoria() + SEPARADOR + fmt.format(getPreco()) + SEPARADOR + getQtdEstoque() + " unidade(s) em estoque</span>";
	}
}

