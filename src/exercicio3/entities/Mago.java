package exercicio3.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
	
	public static int COUNT = 0;
	
	private List<String> listaDeMagias = new ArrayList<>();

	public Mago() {
		super();
	}

	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		COUNT++;
	}
	
	@Override
	public void lvlUp() {
		super.lvlUp();
		this.setInteligencia(getInteligencia() + 50);
		this.setMana(getMana() + 50);
	}
	
	public void attack() {
		Random geradorDeNumeroRandomico = new Random();
		int valorParaAtaque = geradorDeNumeroRandomico.nextInt(300) + 1;
		double valorFinalAtaque = (this.getInteligencia() * this.getLevel()) + valorParaAtaque;
		System.out.printf("Valor do ataque: %.0f", valorFinalAtaque);
	}
	
	public void aprenderMagia(String magia) {
		this.listaDeMagias.add(magia);
	}

	@Override
	public String toString() {
		return "Mago [listaDeMagias=" + listaDeMagias + ", Nome=" + getNome() + ", Vida=" + getVida() + ", Mana="
				+ getMana() + ", Xp=" + getXp() + ", Inteligencia=" + getInteligencia() + ", Força="
				+ getForca() + ", Level=" + getLevel() + "]";
	}
}