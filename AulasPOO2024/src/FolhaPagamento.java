
public class FolhaPagamento {
	private double salarios = 0;
	private double bonus = 0;
	
	//polimorfismo: pq pode receber diferntes objetos
	public void registra(Funcionario f) {
		this.salarios += f.getSalario();
		this.bonus += f.getBonus();
	}

	public void totalDeGastos() {
		System.out.println("Salarios: "+this.salarios);
		System.out.println("Bônus...: "+this.bonus);
	}
}
