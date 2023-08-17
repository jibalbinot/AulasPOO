package classes;

public class Principal {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setId(0);
		a.setNome(null);
		a.setEmail(null);
		a.setSenha(null);
		System.out.println(a.getId());
	}
}
