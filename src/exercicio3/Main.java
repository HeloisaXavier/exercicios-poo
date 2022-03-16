package exercicio3;

import exercicio3.entities.Guerreiro;
import exercicio3.entities.Mago;

public class Main {

	public static void main(String[] args) {
		
		Mago hermione = new Mago("Hermione Granger", 100, 100, 150, 50, 20, 8);
		Mago harry = new Mago("Harry Potter", 100, 100, 150, 120, 20, 8);
		Mago rony = new Mago("Rony Weasley", 100, 100, 150, 50, 20, 8);
		Guerreiro mulherMaravilha = new Guerreiro("Mulher Maravilha", 200, 20, 10, 20, 80, 100);
		Guerreiro canarioNegro = new Guerreiro("Canário Negro", 200, 20, 200, 10, 80, 20);
		
		hermione.aprenderMagia("Wingardium Leviosa");
		System.out.println("Hermione antes de evoluir:");
		System.out.println(hermione.toString());
		hermione.lvlUp();
		System.out.println("Hermione depois de evoluir:");
		System.out.println(hermione.toString());
		hermione.attack();
		System.out.println("\n");
		mulherMaravilha.aprenderHabilidade("Laço da verdade");
		System.out.println("Mulher Maravilha antes de evoluir:");
		System.out.println(mulherMaravilha.toString());
		mulherMaravilha.lvlUp();
		System.out.println("Mulher Maravilha depois de evoluir:");
		System.out.println(mulherMaravilha.toString());
		mulherMaravilha.attack();
		
		System.out.println();
		System.out.println("Magos criados: " + Mago.COUNT);
		System.out.println("Guerreiros criados: " + Guerreiro.COUNT);
		System.out.println("Total de personagens: " + (Guerreiro.COUNT + Mago.COUNT));
		
		System.out.println("\n\n");
		System.out.println(harry);
		System.out.println(rony);
		System.out.println(canarioNegro);
	}
}