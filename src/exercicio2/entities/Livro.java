package exercicio2.entities;

import exercicio2.interfaces.Imposto;

public class Livro extends Produto implements Imposto {

	private String autor;
	private String tema;
	private int quantidadePaginas;
	
	public Livro() {
		super();
	}
	
	public Livro(String nome, Double preco, int quantidade, String autor, String tema, int quantidadePaginas) {
		super(nome, preco, quantidade);
		this.autor = autor;
		this.tema = tema;
		this.quantidadePaginas = quantidadePaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}

	@Override
	public double calculaImposto() {
		if (("educativo").equals(tema.toLowerCase())) {
			return 0;
		}
		return getPreco() * 0.10;
	}

	@Override
	public String toString() {
		return "Título: " + getNome() + ", preço: R$" + String.format("%.2f", getPreco()) + ", quantidade: " + getQuantidade();
	}
}
