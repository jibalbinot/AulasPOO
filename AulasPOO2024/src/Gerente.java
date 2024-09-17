
public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus() {
		return this.getSalario()*0.15;
	}
	

}
