import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String nome;
	private String cpf;
	private Date dataNascimento;
	
	public Cliente(String nome, String cpf, Date dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void mostra() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("------ Cliente -----");
		System.out.println("Nome......: "+this.getNome());
		System.out.println("CPF.......: "+this.getCpf());
		System.out.println("Data Nasc.: "+formato.format(this.getDataNascimento()));
		System.out.println();
	}
	
}
