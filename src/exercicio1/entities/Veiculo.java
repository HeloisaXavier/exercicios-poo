package exercicio1.entities;

import exercicio1.exceptions.ImpossivelDesligarVeiculoEmMovimentoException;
import exercicio1.exceptions.QuantidadeExcedenceDeCombustivelException;

public class Veiculo {
	
	private final double CAPACIDADE_COMBUSTIVEL = 60;
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private double litrosCombustivel;
	private int velocidade;
	private Double preço;
	
	public Veiculo() {
		super();
	}

	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, Double preço) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.preço = preço;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public double getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(double litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
	public void acelerar() {
		if (!isLigado) {
			System.out.println("Não é possível acelerar veículo que está desligado");
		} else {
			setVelocidade(velocidade + 20);
		}
	}

	public void abastecer(double quantidade) throws QuantidadeExcedenceDeCombustivelException {
		double combustivelAposAbastecer = litrosCombustivel + quantidade;
		if (combustivelAposAbastecer > 60) {
			throw new QuantidadeExcedenceDeCombustivelException(combustivelAposAbastecer - CAPACIDADE_COMBUSTIVEL);
		}
		litrosCombustivel = combustivelAposAbastecer;
	}
	
	public void frear() {
		if (velocidade < 20) {
			System.out.println("Veículo está parado");
		} else {
			velocidade -= 20;		
		}
	}
	
	public String pintar(String novaCor) {
		setCor(novaCor);
		return cor;
	}
	
	public boolean ligar() {
		if (isLigado) {
			System.out.println("Carro já está ligado");
			return true;
		}
		setLigado(true);
		return isLigado;
	}
	
	public boolean desligar() throws ImpossivelDesligarVeiculoEmMovimentoException {
		if (velocidade > 0) {
			throw new ImpossivelDesligarVeiculoEmMovimentoException();
		} else if (!isLigado) {
			System.out.println("Veículo já está desligado");
			return isLigado;
		} else {
			setLigado(false);
			return isLigado;
		}
	}
}
