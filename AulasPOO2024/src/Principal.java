import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Adao","111.111.111-11",new Date());
		Conta c1 = new Conta(cli1);
	
		//operacoes com a conta 1
		c1.setLimite(3400);
		c1.deposita(500);
		c1.saca(1100);
		c1.saca(400);
		
		Cliente cli2 = new Cliente("Eva","222.222.222-22",new Date());
		Conta c2 = new Conta(cli2);
		
		//operações com a conta 2
		c2.transfere(200, c1);
		
		//mostro os dados das contas e seus clientes
		c1.mostra();
		c2.mostra();
		
		Conta c3 = new Conta(cli1);
		c3.mostra();

	}

}
