import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double totalHoras = 0;
	double valorHora = 0;
	double salBruto = 0;
	double salLiquido = 0;
	
	System.out.println("Digite o total de horas trabalhadas no m�s:");
	totalHoras = ler.nextDouble();
	
	System.out.println("Digite o valor da hora trabalhada:");
	valorHora = ler.nextDouble();
	
	salBruto = totalHoras * valorHora;
	
	salLiquido = salBruto - (salBruto * 0.12);
	
	System.out.printf("O valor do sal�rio bruto � %.2f e o valor l�quido, com desconto do INSS, � de %.2f", salBruto, salLiquido);
	
	ler.close();
	}

}
