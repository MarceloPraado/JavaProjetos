
public class Passaro extends Animal {
	
	private String Corpena;
	
	@Override
	public void locomover() {
		System.out.print("Voando ");
	}
	
	@Override
	public void alimentar() {
		System.out.print("Comendo minhoca ");
	}
	
	@Override 
	public void Emitirsom() {
		System.out.print("Cantando ");
	}
	
	public void Fazerninho() {
		System.out.print("Pegando galho seco ");
	}

	public String getCorpena() {
		return Corpena;
	}

	public void setCorpena(String corpena) {
		Corpena = corpena;
	}
}
