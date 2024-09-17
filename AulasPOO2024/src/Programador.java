
public class Programador extends Funcionario {

	public Programador(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus() {
		return this.getSalario()*0.10;
	}

}
