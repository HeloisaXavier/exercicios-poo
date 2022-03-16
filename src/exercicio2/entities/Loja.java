package exercicio2.entities;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;
	
	public Loja() {
	}

	public Loja(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.videoGames = new ArrayList<VideoGame>();
		this.livros = new ArrayList<Livro>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}
	
	public void adicionarLivro(Livro livro) {
		this.livros.add(livro);
	}
	
	public void adicionarGame(VideoGame game) {
		this.videoGames.add(game);
	}
	
	public void listaLivros() {
		if (livros.size() == 0) {
			System.out.println("Lista de livros vazia");
		}
		for (Livro livro : livros) {
			System.out.println(livro);
		}
	}
	
	public void listaVideogames() {
		if (videoGames.size() == 0) {
			System.out.println("Lista de vídeo games vazia");
		}
		for (VideoGame game : videoGames) {
			System.out.println(game);
		}
	}
	
	public double calculaPatrimonio() {
		double total = 0;
		
		for (Livro livro : livros) {
			total += livro.getPreco() * livro.getQuantidade();
		}
		
		for (VideoGame game : videoGames) {
			total += game.getPreco() * game.getQuantidade();
		}
		return total;
	}
}