import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		double num1, num2, subtrai = 0;
		
		double cont = 1;
		
		while (cont==1) {
			
		System.out.println("Digite o primeiro n�mero da subtra��o:");
		
		num1 = ler.nextDouble();
		
		System.out.println("Digite o segundo n�mero da subtra��o:");
		
		num2 = ler.nextDouble();
		
		subtrai = num1 - num2;
		
		System.out.printf("O resultado da subtra��o �: %d %n", subtrai);
		
		System.out.println("Deseja fazer mais subtra��es? [0] N�o [1] Sim");
		
		cont = ler.nextInt();
		
		}
		
		ler.close();
	}
}
