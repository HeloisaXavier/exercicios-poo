package exercicio1.exceptions;

public class QuantidadeExcedenceDeCombustivelException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QuantidadeExcedenceDeCombustivelException(double excedente) {
		super("Capacidade máxima excedida em " + excedente + " litros");
	}
}
