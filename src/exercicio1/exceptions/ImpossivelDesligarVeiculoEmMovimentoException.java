package exercicio1.exceptions;

public class ImpossivelDesligarVeiculoEmMovimentoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ImpossivelDesligarVeiculoEmMovimentoException() {
		super("N�o � poss�vel desligar ve�culo em movimento.");
	}
}
