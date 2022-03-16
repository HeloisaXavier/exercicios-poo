package exercicio3.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
	
	public static int COUNT = 0;
	
	private List<String> listaDeHabilidades = new ArrayList<>();

	public Guerreiro() {
		super();
	}

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		COUNT++;
	}
	
	@Override
	public void lvlUp() {
		super.lvlUp();
		this.setForca(getForca() + 50);
		this.setVida(getVida() + 50);
	}
	
	public void attack() {
		Random geradorDeNumeroRandomico = new Random();
		int valorParaAtaque = geradorDeNumeroRandomico.nextInt(300) + 1;
		double valorFinalAtaque = (this.getForca() * this.getLevel()) + valorParaAtaque;
		System.out.println("Valor do ataque: " + valorFinalAtaque);
	}
	
	public void aprenderHabilidade(String habilidade) {
		this.listaDeHabilidades.add(habilidade);
	}

	@Override
	public String toString() {
		return "Guerreiro [listaDeHabilidades=" + listaDeHabilidades + ", Nome=" + getNome() + ", Vida=" + getVida()
				+ ", Mana=" + getMana() + ", Xp=" + getXp() + ", Inteligência=" + getInteligencia()
				+ ", Força=" + getForca() + ", Level=" + getLevel() + "]";
	}
}