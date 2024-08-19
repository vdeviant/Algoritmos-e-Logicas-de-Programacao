import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double celsius = 0;
		double fahrenheit = 0;
		
		System.out.println("Digite a temperatura em graus Celsius:");
		celsius = ler.nextDouble();
		
		fahrenheit = (celsius *	 9/5) + 32;
		
		System.out.printf("A temperatura %.2f em Celsius equivale a %.2f em Fahrenheit", celsius, fahrenheit);
		
		ler.close();

	}

}
