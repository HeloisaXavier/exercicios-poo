package exercicio7;

import exercicio7.entities.Funcionario;
import exercicio7.entities.Gerente;
import exercicio7.entities.Supervisor;
import exercicio7.entities.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente("Paula", 45, 1000.0);
		Funcionario supervisor = new Supervisor("Maura", 32, 1000.0);
		Funcionario vendedor = new Vendedor("Geuza", 25, 1000.0);
		
		System.out.println(gerente.toString());
		System.out.println("  Bonificação gerente: R$" + String.format("%.2f", gerente.bonificacao()) + "\n");
		System.out.println(supervisor.toString());
		System.out.println("  Bonificação supervisor: R$" + String.format("%.2f", supervisor.bonificacao()) + "\n");
		System.out.println(vendedor.toString());
		System.out.println("  Bonificação vendedor: R$" + String.format("%.2f", vendedor.bonificacao()));
	}
}