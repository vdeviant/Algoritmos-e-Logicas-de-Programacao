import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double raio = 0;
		double altura = 0;
		double volume = 0;
		double pi = 3.14159;
		
		System.out.println("Digite o valor do raio da lata de �leo:");
		raio = ler.nextDouble();
		
		System.out.println("Digite o valor da altura da lata de �leo:");
		altura = ler.nextDouble();
		
		volume = pi * raio * raio * altura;
		
		System.out.printf("O volume da lata de �leo � igual a %.3f", volume);
		
		ler.close();
		
	}

}
