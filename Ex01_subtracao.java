import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		double num1, num2, subtrai = 0;
		
		double cont = 1;
		
		while (cont==1) {
			
		System.out.println("Digite o primeiro número da subtração:");
		
		num1 = ler.nextDouble();
		
		System.out.println("Digite o segundo número da subtração:");
		
		num2 = ler.nextDouble();
		
		subtrai = num1 - num2;
		
		System.out.printf("O resultado da subtração é: %d %n", subtrai);
		
		System.out.println("Deseja fazer mais subtrações? [0] Não [1] Sim");
		
		cont = ler.nextInt();
		
		}
		
		ler.close();
	}
}
