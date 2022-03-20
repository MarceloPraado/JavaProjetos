
public class mamifero extends Animal {

	private String Corpelo;
	
	@Override
	public void locomover() {
		System.out.println("Correndo ");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Mamando ");
	}
	
	@Override
	public void Emitirsom() {
		System.out.println("Som de mamífero ");
	}

	public String getCorpelo() {
		return Corpelo;
	}

	public void setCorpelo(String corpelo) {
		Corpelo = corpelo;
	}
	
	
}