import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		
		// Primeiro exerc�cio em java: multiplica��o de dois n�meros
		// Adicionei um loop while pra fazer novas somas
		
		Scanner ler = new Scanner(System.in);
		
		double num1, num2, multiply = 0;
		
		int cont = 1;
		
		while (cont==1) {
			
		System.out.println("Digite o primeiro n�mero da multiplica��o:");
		
		num1 = ler.nextDouble();
		
		System.out.println("Digite o segundo n�mero da multiplica��o:");
		
		num2 = ler.nextDouble();
		
		multiply = num1 * num2;
		
		System.out.printf("O resultado da multiplica��o �: %d %n", multiply);
		
		System.out.println("Deseja fazer mais multiplica��es? [0] N�o [1] Sim");
		
		cont = ler.nextInt();
		
		}
		
		ler.close();
	}

}
