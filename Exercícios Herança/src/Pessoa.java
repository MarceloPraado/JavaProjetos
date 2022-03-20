
public class Pessoa {

	private String nome;
	private String cpf;
	
	public  Pessoa (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void imprime() {
		System.out.print("Nome: " + this.nome);
		System.out.print("CPF: " + this.cpf);
		 
	}
}
