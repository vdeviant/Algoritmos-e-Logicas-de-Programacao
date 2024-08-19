import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double celsius = 0;
		double fahrenheit = 0;
		
		System.out.println("Digite a temperatura em graus Fahrenheit:");
		fahrenheit = ler.nextDouble();
		
		 celsius = ( fahrenheit - 32) * 5/9;
		
		System.out.printf("A temperatura %.2f em Celsius equivale a %.2f em Fahrenheit", fahrenheit, celsius);
		
		ler.close();

	}

}
