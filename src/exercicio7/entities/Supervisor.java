package exercicio7.entities;

public class Supervisor extends Funcionario {

	public Supervisor() {
		super();
	}

	public Supervisor(String nome, int idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return super.bonificacao() + 5000.0;
	}
}