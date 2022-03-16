package exercicio4a6;

import java.util.ArrayList;
import java.util.List;

import exercicio4a6.entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa("João", 15);
		Pessoa leandro = new Pessoa("Leandro", 21);
		Pessoa paulo = new Pessoa("Paulo", 17);
		Pessoa jessica = new Pessoa("Jéssica", 18);
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(joao);
		pessoas.add(leandro);
		pessoas.add(paulo);
		pessoas.add(jessica);
		
		System.out.println("**Exercício 4** - Pessoa mais velha da lista.");
		Pessoa velha = pessoas.get(0);
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getIdade() > velha.getIdade()) {
				velha = pessoa;
			}
		}
		System.out.println(velha + "\n");
		
		System.out.println("**Exercício 5** - Quantidade de pessoas na lista antes e depois de remover os menores de idade");
		System.out.println("Pessoas na lista antes de remover os menores: " + pessoas.size());
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getIdade() < 18) {
				pessoas.remove(pessoas.get(i));
			}
		}
		System.out.println("Pessoas na lista após remover os menores: " + pessoas.size() + "\n");
		
		
		System.out.println("**Exercício 6** - Buscar por pessoa na lista");
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getNome().toLowerCase().equals("jéssica")) {
				System.out.println(pessoas.get(i).toString());
			}
		}

	}
}