
public class Professor extends Pessoa {
	
	private double salario;
	
	public Professor(String nome, String cpf, double salario) {
		super(nome, cpf);
		this.salario = salario;
	}
	@Override
	public void imprime() {
		super.imprime();
		System.out.println("Sal�rio: " + this.salario);
	}
	

}
