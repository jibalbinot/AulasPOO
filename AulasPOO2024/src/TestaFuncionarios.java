
public class TestaFuncionarios {

	public static void main(String[] args) {
		//Funcionario f = new Funcionario("Fabio", 100);
		Programador f = new Programador("Fabio", 100);
		Gerente g = new Gerente("Gregory",100);
		Estagiario e = new Estagiario("Estela", 100);
		f.mostra();
		g.mostra();
		e.mostra();
		
		FolhaPagamento fp = new FolhaPagamento();
		fp.registra(f);
		fp.registra(g);
		fp.registra(e);
		fp.totalDeGastos();

	}

}
