import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, soma;
		Scanner teclado;
		
		System.out.println("Digite dois valores: ");
		teclado = new Scanner(System.in);
		
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("O resultado da sua soma é: " + soma);
		teclado.close();
	}

	
}
