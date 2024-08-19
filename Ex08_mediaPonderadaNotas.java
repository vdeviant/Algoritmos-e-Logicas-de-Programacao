import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		int p1 = 4;
		int p2 = 6;
		double media = 0;
		
		System.out.println("Digite o valor da primeira nota:");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite o valor da segunda nota:");
		nota2 = ler.nextDouble();
		
		media = ((nota1*p1)+(nota2*p2))/(p1+p2);
		
		System.out.printf("A média ponderada das notas é igual a %.2f", media);
		
		ler.close();
	}

}
