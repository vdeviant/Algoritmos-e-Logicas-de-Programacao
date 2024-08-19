import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		
		// Primeiro exercício em java: multiplicação de dois números
		// Adicionei um loop while pra fazer novas somas
		
		Scanner ler = new Scanner(System.in);
		
		double num1, num2, multiply = 0;
		
		int cont = 1;
		
		while (cont==1) {
			
		System.out.println("Digite o primeiro número da multiplicação:");
		
		num1 = ler.nextDouble();
		
		System.out.println("Digite o segundo número da multiplicação:");
		
		num2 = ler.nextDouble();
		
		multiply = num1 * num2;
		
		System.out.printf("O resultado da multiplicação é: %d %n", multiply);
		
		System.out.println("Deseja fazer mais multiplicações? [0] Não [1] Sim");
		
		cont = ler.nextInt();
		
		}
		
		ler.close();
	}

}
