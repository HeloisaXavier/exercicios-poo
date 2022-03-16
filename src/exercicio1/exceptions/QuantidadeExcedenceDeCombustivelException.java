package exercicio1.exceptions;

public class QuantidadeExcedenceDeCombustivelException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QuantidadeExcedenceDeCombustivelException(double excedente) {
		super("Capacidade m�xima excedida em " + excedente + " litros");
	}
}
