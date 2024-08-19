import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		double valor = 0;
		
		double total = 0;
		
		int qtd = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto a ser comprado:");
		valor = ler.nextDouble();
		
		System.out.println("Digite a quantidade do produto a ser comprado:");
		qtd = ler.nextInt();
				
		total = valor * qtd;
		
		System.out.printf("O valor total da compra é de %.2f", total);
		
		ler.close();
	}

}
