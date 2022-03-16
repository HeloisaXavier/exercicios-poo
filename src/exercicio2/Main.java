package exercicio2;

import exercicio2.entities.Livro;
import exercicio2.entities.Loja;
import exercicio2.entities.VideoGame;

public class Main {

	public static void main(String[] args) {
				
		Livro l1 = new Livro("Harry Potter", 40.0, 50, "J. K. Rowling", "FANTASIA", 300);
		Livro l2 = new Livro("Senhor dos Anéis", 60.0, 30, "J. R. R. Tolkien", "FANTASIA", 500);
		Livro l3 = new Livro("Java POO", 20.0, 50, "GFT", "EDUCATIVO", 500);
		
		VideoGame ps4 = new VideoGame("PS4", 1800.0, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000.0, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("Xbox", 1500.0, 500, "Microsoft", "One", false);
		
		Loja americanas = new Loja("Americanas", "123456789-11");
		
		americanas.adicionarLivro(l1);
		americanas.adicionarLivro(l2);
		americanas.adicionarLivro(l3);
		
		americanas.adicionarGame(xbox);
		americanas.adicionarGame(ps4Usado);
		americanas.adicionarGame(ps4);
		
		if (l2.getTema().toLowerCase().equals("educativo")) {
			System.out.println("Livro educativo não tem imposto: " + l2.getNome());
		} else {
			System.out.printf("R$%.2f de impostos sobre o livro %s\n", l2.calculaImposto(), l2.getNome());			
		}
		
		if (l3.getTema().toLowerCase().equals("educativo")) {
			System.out.println("Livro educativo não tem imposto: " + l3.getNome());
		} else {
			System.out.printf("R$%.2f de impostos sobre o livro %s\n", l3.calculaImposto(), l3.getNome());			
		}
		System.out.printf("Imposto PS4 Slim usado: R$%.2f\n", ps4Usado.calculaImposto());
		System.out.printf("Imposto PS4 Slim R$%.2f\n", ps4.calculaImposto());
		System.out.println("-----------------------------------------------------------");
		System.out.println("A loja Americanas possui estes livros para venda:");
		americanas.listaLivros();
		System.out.println("-----------------------------------------------------------");
		System.out.println("A loja Americanas possui estes vídeo games para venda:");
		americanas.listaVideogames();
		System.out.println("-----------------------------------------------------------");
		System.out.printf("O patrimonio da loja: %s é de R$%.2f\n", americanas.getNome() ,americanas.calculaPatrimonio());
	}
}