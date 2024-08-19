import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1 = 0;
		double n2 = 0;
		double media = 0;
		
		System.out.println("Digite o valor da primeira nota:");
		n1 = ler.nextDouble();
		
		System.out.println("Digite o valor da segunda nota:");
		n2 = ler.nextDouble();
		
		media = (n1+n2)/2;
		
		System.out.printf("A média aritmética das notas é igual a %.2f", media);
		
		ler.close();
	}

}
