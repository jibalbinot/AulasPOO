
public abstract class Funcionario {
	private String nome;
	private double salario;
	
	public abstract double getBonus();
		
	public void mostra() {
		System.out.println(this.getClass());
		System.out.println("Nome...: "+this.getNome());
		System.out.println("Salario: "+this.getSalario());
		System.out.println("Bônus..: "+this.getBonus());
		System.out.println();
	}
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


}
