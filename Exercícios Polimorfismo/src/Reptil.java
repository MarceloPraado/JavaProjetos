
public class Reptil extends Animal{
	
	private String CorEscama;
	
	@Override
	public void locomover() {
		System.out.print("Andando ");
	}
	
	@Override
	public void alimentar() {
		System.out.print("Comendo Vegetais ");
	}
	
	@Override 
	public void Emitirsom() {
		System.out.print("Som de R�ptil ");
	}

	public String getCorEscama() {
		return CorEscama;
	}

	public void setCorEscama(String corEscama) {
		CorEscama = corEscama;
	}
}
