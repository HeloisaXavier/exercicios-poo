package exercicio1.exceptions;

public class ImpossivelDesligarVeiculoEmMovimentoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ImpossivelDesligarVeiculoEmMovimentoException() {
		super("Não é possível desligar veículo em movimento.");
	}
}
