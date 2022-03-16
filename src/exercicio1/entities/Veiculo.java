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
	private Double preco;
	
	public Veiculo() {
		super();
	}

	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, Double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.preco = preco;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void acelerar() {
		if (!isLigado) {
			System.out.println("N�o � poss�vel acelerar o ve�culo que est� desligado");
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
			System.out.println("Ve�culo est� parado");
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
			System.out.println("Carro j� est� ligado");
			return true;
		}
		setLigado(true);
		return isLigado;
	}
	
	public boolean desligar() throws ImpossivelDesligarVeiculoEmMovimentoException {
		if (velocidade > 0) {
			throw new ImpossivelDesligarVeiculoEmMovimentoException();
		} else if (!isLigado) {
			System.out.println("Ve�culo j� est� desligado");
			return isLigado;
		} else {
			setLigado(false);
			return isLigado;
		}
	}
}
