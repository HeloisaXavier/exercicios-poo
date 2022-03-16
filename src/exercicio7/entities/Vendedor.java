/**
 * 
 */
package exercicio7.entities;

public class Vendedor extends Funcionario{

	public Vendedor() {
		super();
	}

	public Vendedor(String nome, int idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return super.bonificacao() + 3000.0;
	}
}