import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Celsius, Kelvin, Fahrenreit, Reaumur, Rankine;
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("Bem vindo ao conversor de temperaturas!");
		
		System.out.print("Digite sua temperatura em Graus Celsius: ");
		
		Celsius = teclado.nextInt();
		
		Kelvin = (Celsius + 273.15);
		Fahrenreit = ((Celsius * 1.8) + 32);
		Reaumur = (Celsius * 0.8);
		Rankine = ((Celsius * 1.8) + 32 + 459.67 );
		
		System.out.println("Sua temperatura de " + Celsius + " Graus Celsius ? o Equivalente a: " + Kelvin + " Na escala Kelvin; " + Fahrenreit + " Na escala Fahrenheit; " + Reaumur + " Na escala de Reaumur; " + " E " + Rankine + " Na escala Rankine. ");
		
		teclado.close();
		
		
		
		
		
	}

}