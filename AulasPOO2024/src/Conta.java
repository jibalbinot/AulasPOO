public class Conta {
	
	final static private double LIMITE_MINIMO = 1000;
	final static private double LIMITE_PADRAO = 1500;
	final static private double LIMITE_MAXIMO = 3500;
	
	private int numero;
	private Cliente titular;
	private double limite = LIMITE_PADRAO;
	private double saldo = 0;
	
	private static int cont = 1000;
	
	//construtor padrão
	public Conta(){
		System.out.println("Padrao: conta criada com sucesso");
	}

	public Conta(Cliente cliente){
		this.numero = ++Conta.cont;
		this.setTitular(cliente);
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		if((limite>=LIMITE_MINIMO) && (limite<=LIMITE_MAXIMO))
			this.limite = limite;
	}
	public double getSaldo() {
		return saldo;
	}
	boolean deposita(double valor) {
		if(valor>0) {
			this.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
	boolean saca(double valor) {
		if((valor>0)&&(valor<=this.saldo+this.limite)){
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			return destino.deposita(valor);
		} else {
			return false;
		}
	}
	void mostra() {
		System.out.println("----- Conta ----- ");
		System.out.println("Numero.: "+this.numero);
		//System.out.println("Titular: "+this.titular.getNome());
		titular.mostra();
		System.out.println("Limite.: "+this.limite);
		System.out.println("Saldo..: "+this.saldo);
		System.out.println();
	}
}





