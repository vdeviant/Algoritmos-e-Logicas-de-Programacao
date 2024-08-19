import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double dTotal = 0;
		double vCombustivel = 0;
		double consumo = 0;
		
		System.out.println("Digite a distância total percorrida, em KM:");
		dTotal = ler.nextDouble();
		
		System.out.println("Digite o volume de combustível utilizado, em L:");
		vCombustivel = ler.nextDouble();
		
		consumo = dTotal / vCombustivel;
		
		System.out.printf("O consumo médio do veículo de é de %.2f litros por kilômetro rodado.", consumo);
		
		ler.close();

	}

}
