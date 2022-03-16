package exercicio1;

import exercicio1.entities.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Veiculo fusca = new Veiculo("VW", "Fusca", "GFT-2022", "Amarelo", 99999, false, 20, 6000.0);
		
    	System.out.println("** FUSCA **");
		System.out.println("Litros no tanque antes de abastecer: " + fusca.getLitrosCombustivel());
		fusca.abastecer(20);
		System.out.println("Litros no tanque após abastecer: " + fusca.getLitrosCombustivel());
		System.out.println();
		System.out.println("Status do veículo (LIGADO/DESLIGADO): " + fusca.isLigado());
		fusca.ligar();
		System.out.println("Status do veículo após ligar (LIGADO/DESLIGADO): " + fusca.isLigado());
		System.out.println();
		System.out.println("Velocidade do veículo antes de acelerar: " + fusca.getVelocidade());
		fusca.acelerar();
		System.out.println("Velocidade do veículo após acelerar: " + fusca.getVelocidade());
		System.out.println();
		System.out.println("Velocidade do veículo antes de frear: " + fusca.getVelocidade());
		fusca.frear();
		System.out.println("Velocidade do veículo após frear: " + fusca.getVelocidade());
		System.out.println();
		System.out.println("Quantidade de combustível no tanque antes de abastecer: " + fusca.getLitrosCombustivel());
		fusca.abastecer(20);
		System.out.println("Quantidade de combustível no tanque após abastecer: " + fusca.getLitrosCombustivel());
		System.out.println();
		System.out.println("Status do veículo (LIGADO/DESLIGADO): " + fusca.isLigado());
		fusca.desligar();
		System.out.println("Status do veículo após desligar (LIGADO/DESLIGADO): " + fusca.isLigado());
		}
}