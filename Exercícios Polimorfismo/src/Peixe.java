
public class Peixe extends Animal{
	
	private String CorEscama;
	
	@Override
	public void locomover() {
		System.out.print("Nadando ");
	}
	
	@Override
	public void alimentar() {
		System.out.print("Comendo Subst�ncias ");
	}
	
	@Override 
	public void Emitirsom() {
		System.out.print("Peixe n�o faz som ");
	}
	
	public void Soltarbolha() {
		System.out.print("Soltou bolhinha ");
	}
	
	public String getCorEscama() {
		return CorEscama;
	}
	
	public void setCorEscama(String corEscama) {
			CorEscama = corEscama;
	}
}


