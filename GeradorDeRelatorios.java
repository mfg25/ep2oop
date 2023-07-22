package geradorRelatoriosBase;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;

public class GeradorDeRelatorios {

	public static final String ALG_INSERTIONSORT = "quick";
	public static final String ALG_QUICKSORT = "insertion";

	public static final String CRIT_DESC_CRESC = "descricao_c";
	public static final String CRIT_PRECO_CRESC = "preco_c";
	public static final String CRIT_ESTOQUE_CRESC = "estoque_c";
	
	public static final String FILTRO_TODOS = "todos";
	public static final String FILTRO_ESTOQUE_MENOR_OU_IQUAL_A = "estoque_menor_igual";
	public static final String FILTRO_CATEGORIA_IGUAL_A = "categoria_igual";

	// operador bit a bit "ou" pode ser usado para combinar mais de  
	// um estilo de formatacao simultaneamente (veja como no main)
	public static final int FORMATO_PADRAO  = 0b0000;
	public static final int FORMATO_NEGRITO = 0b0001;
	public static final int FORMATO_ITALICO = 0b0010;

	private List<Produto> produtos;
	private FiltroComparacao estrategiaFiltragem;
	private String algoritmo;
	private String criterio;
	private String argFiltro;
	private int format_flags;
	
	

	public GeradorDeRelatorios(List<Produto> produtos, String algoritmo, String criterio, String filtro, String argFiltro, int format_flags){
		this.produtos = produtos;
		this.algoritmo = algoritmo;
		this.criterio = criterio;
		this.estrategiaFiltragem = SelecionarEstrategiaFiltro.criarEstrategia(filtro, argFiltro);
		this.argFiltro = argFiltro;
		this.format_flags = format_flags;
	}

	private List<Produto> ordena(int ini, int fim){
		ContextoOrdenacao contexto = new ContextoOrdenacao(algoritmo, ini, fim, this.produtos, criterio);
		return contexto.executarOrdenacao();
	}
	
	
	public void debug(){
		System.out.println("Gerando relatório para array contendo " + produtos.size() + " produto(s)");
		System.out.println("parametro filtro = '" + argFiltro + "'"); 
	}


	public void geraRelatorio(String arquivoSaida) throws IOException {

		debug();

		System.out.println(this.produtos);
		List<Produto> produtosOrdenados = ordena(0, this.produtos.size() - 1);

		PrintWriter out = new PrintWriter(arquivoSaida);

		out.println("<!DOCTYPE html><html>");
		out.println("<head><title>Relatorio de produtos</title></head>");
		out.println("<body>");
		out.println("Relatorio de Produtos:");
		out.println("<ul>");

		int count = 0;

		for(int i = 0; i < produtosOrdenados.size(); i++){

			Produto p = produtosOrdenados.get(i);
			
			ProdutoFormatadoPadrao produtoFormatado = new ProdutoFormatadoPadrao(p);

			if(estrategiaFiltragem.filtrar(p)){

				out.print("<li>");
				
				out.println("</li>");
				count++;
			}
		}

		out.println("</ul>");
		out.println(count + " produtos listados, de um total de " + produtosOrdenados.size() + ".");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}
	
	public static List<Produto> carregaProdutosCsv(String nomeArquivo){
        List<Produto> produtos = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
        	String cabecalho = br.readLine();
        	
        	String linha;
        	
        	while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(", ");

                int id = Integer.parseInt(campos[0]);
                String descricao = campos[1];
                String categoria = campos[2];
                int qtdEstoque = Integer.parseInt(campos[3]);
                double preco = Double.parseDouble(campos[4]);
                boolean italico = Boolean.parseBoolean(campos[5]);
                boolean negrito = Boolean.parseBoolean(campos[6]);
                String cor = campos[7];

                ProdutoAlterado produto = new ProdutoAlterado(id, descricao, categoria, qtdEstoque, preco, italico, negrito, cor);
                produtos.add(produto);
        	}
        	
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        return produtos;

	}

	public static List<Produto> carregaProdutos(){

		List<Produto> produtos = new ArrayList<>();

	    produtos.add(new ProdutoPadrao(1, "O Hobbit", "Livros", 2, 34.90));
	    produtos.add(new ProdutoPadrao(2, "Notebook Core i7", "Informatica", 5, 1999.90));
	    produtos.add(new ProdutoPadrao(3, "Resident Evil 4", "Games", 7, 79.90));
	    produtos.add(new ProdutoPadrao(4, "iPhone", "Telefonia", 8, 4999.90));
	    produtos.add(new ProdutoPadrao(5, "Calculo I", "Livros", 20, 55.00));
	    produtos.add(new ProdutoPadrao(6, "Power Glove", "Games", 3, 499.90));
	    produtos.add(new ProdutoPadrao(7, "Microsoft HoloLens", "Informatica", 1, 19900.00));
	    produtos.add(new ProdutoPadrao(8, "OpenGL Programming Guide", "Livros", 4, 89.90));
	    produtos.add(new ProdutoPadrao(9, "Vectrex", "Games", 1, 799.90));
	    produtos.add(new ProdutoPadrao(10, "Carregador iPhone", "Telefonia", 15, 499.90));
	    produtos.add(new ProdutoPadrao(11, "Introduction to Algorithms", "Livros", 7, 315.00));
	    produtos.add(new ProdutoPadrao(12, "Daytona USA (Arcade)", "Games", 1, 12000.00));
	    produtos.add(new ProdutoPadrao(13, "Neuromancer", "Livros", 5, 45.00));
	    produtos.add(new ProdutoPadrao(14, "Nokia 3100", "Telefonia", 4, 249.99));
	    produtos.add(new ProdutoPadrao(15, "Oculus Rift", "Games", 1, 3600.00));
	    produtos.add(new ProdutoPadrao(16, "Trackball Logitech", "Informatica", 1, 250.00));
	    produtos.add(new ProdutoPadrao(17, "After Burner II (Arcade)", "Games", 2, 8900.0));
	    produtos.add(new ProdutoPadrao(18, "Assembly for Dummies", "Livros", 30, 129.90));
	    produtos.add(new ProdutoPadrao(19, "iPhone (usado)", "Telefonia", 3, 3999.90));
	    produtos.add(new ProdutoPadrao(20, "Game Programming Patterns", "Livros", 1, 299.90));
	    produtos.add(new ProdutoPadrao(21, "Playstation 2", "Games", 10, 499.90));
	    produtos.add(new ProdutoPadrao(22, "Carregador Nokia", "Telefonia", 14, 89.00));
	    produtos.add(new ProdutoPadrao(23, "Placa Aceleradora Voodoo 2", "Informatica", 4, 189.00));
	    produtos.add(new ProdutoPadrao(24, "Stunts", "Games", 3, 19.90));
	    produtos.add(new ProdutoPadrao(25, "Carregador Generico", "Telefonia", 9, 30.00));
	    produtos.add(new ProdutoPadrao(26, "Monitor VGA 14 polegadas", "Informatica", 2, 199.90));
	    produtos.add(new ProdutoPadrao(27, "Nokia N-Gage", "Telefonia", 9, 699.00));
	    produtos.add(new ProdutoPadrao(28, "Disquetes Maxell 5.25 polegadas (caixa com 10 unidades)", "Informatica", 23, 49.00));
	    produtos.add(new ProdutoPadrao(29, "Alone in The Dark", "Games", 11, 59.00));
	    produtos.add(new ProdutoPadrao(30, "The Art of Computer Programming Vol. 1", "Livros", 3, 240.00));
	    produtos.add(new ProdutoPadrao(31, "The Art of Computer Programming Vol. 2", "Livros", 2, 200.00));
	    produtos.add(new ProdutoPadrao(32, "The Art of Computer Programming Vol. 3", "Livros", 4, 270.00));

	    return produtos;
	} 

	public static void main(String [] args) {

		if(args.length < 4){

			System.out.println("Uso:");
			System.out.println("\tjava " + GeradorDeRelatorios.class.getName() + " <algoritmo> <critério de ordenação> <critério de filtragem> <parâmetro de filtragem> <opções de formatação>");
			System.out.println("Onde:");
			System.out.println("\talgoritmo: 'quick' ou 'insertion'");
			System.out.println("\tcriterio de ordenação: 'preco_c' ou 'descricao_c' ou 'estoque_c'");
			System.out.println("\tcriterio de filtragem: 'todos' ou 'estoque_menor_igual' ou 'categoria_igual'"); 
			System.out.println("\tparâmetro de filtragem: argumentos adicionais necessários para a filtragem"); 
			System.out.println("\topções de formatação: 'negrito' e/ou 'italico'");
			System.out.println();
			System.exit(1);
		}

		String opcao_algoritmo = args[0];
		String opcao_criterio_ord = args[1];
		String opcao_criterio_filtro = args[2];
		String opcao_parametro_filtro = args[3];
		
		String [] opcoes_formatacao = new String[2];
		opcoes_formatacao[0] = args.length > 4 ? args[4] : null;
		opcoes_formatacao[1] = args.length > 5 ? args[5] : null;
		int formato = FORMATO_PADRAO;
		
		for(int i = 0; i < opcoes_formatacao.length; i++) {

			String op = opcoes_formatacao[i];
			formato |= (op != null ? op.equals("negrito") ? FORMATO_NEGRITO : (op.equals("italico") ? FORMATO_ITALICO : 0) : 0); 
		}
		
		GeradorDeRelatorios gdr = new GeradorDeRelatorios(carregaProdutosCsv("produtos.csv"), 
									opcao_algoritmo,
									opcao_criterio_ord,
									opcao_criterio_filtro,
									opcao_parametro_filtro,
									formato 
								 );

		try{
			gdr.geraRelatorio("saida.html");
		}
		catch(IOException e){
			
			e.printStackTrace();
		}
	}
}
