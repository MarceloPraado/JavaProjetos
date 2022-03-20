
public class Main {

	public static void main(String[] args) {
		mamifero cachorro = new mamifero();
		Reptil lagarto = new Reptil();
		Peixe dourado = new Peixe();
		Passaro tucano = new Passaro();
		
		cachorro.setCorpelo("Marrom");
		cachorro.setPeso(35.3);
		cachorro.setIdade(2);
		cachorro.setMembros(4);
		cachorro.alimentar();
		cachorro.locomover();
		cachorro.Emitirsom();
		
		lagarto.setCorEscama("Verde");
		lagarto.setPeso(10);
		lagarto.setIdade(30);
		lagarto.setMembros(4);
		lagarto.alimentar();
		lagarto.locomover();
		lagarto.Emitirsom();
		
		dourado.setCorEscama("Branco");
		dourado.setPeso(0.8);
		dourado.setIdade(5);
		dourado.setMembros(0);
		dourado.alimentar();
		dourado.locomover();
		dourado.Emitirsom();
		dourado.Soltarbolha();
		
		tucano.setCorpena("Preto e branco");
		tucano.setPeso(4);
		tucano.setIdade(12);
		tucano.setMembros(2);
		tucano.alimentar();
		tucano.locomover();
		tucano.Emitirsom();
		tucano.Fazerninho();
		
	}

}
