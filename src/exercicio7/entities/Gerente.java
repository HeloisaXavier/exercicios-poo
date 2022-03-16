package exercicio7.entities;

public class Gerente extends Funcionario {

	public Gerente() {
		super();
	}

	public Gerente(String nome, int idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return super.bonificacao() + 10000.0;
	}
}