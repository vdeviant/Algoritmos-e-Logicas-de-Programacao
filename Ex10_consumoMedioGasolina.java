import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double dTotal = 0;
		double vCombustivel = 0;
		double consumo = 0;
		
		System.out.println("Digite a dist�ncia total percorrida, em KM:");
		dTotal = ler.nextDouble();
		
		System.out.println("Digite o volume de combust�vel utilizado, em L:");
		vCombustivel = ler.nextDouble();
		
		consumo = dTotal / vCombustivel;
		
		System.out.printf("O consumo m�dio do ve�culo de � de %.2f litros por kil�metro rodado.", consumo);
		
		ler.close();

	}

}
