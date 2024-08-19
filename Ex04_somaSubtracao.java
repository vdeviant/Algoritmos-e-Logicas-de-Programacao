import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a = 4;
		int b = 3;
		int c, d;
		c = a + b;
		d = a - b;
		
		System.out.printf("A variável a vale %d e a variável b vale %d. A variável c contem a soma %d e a variável d contem a subtração %d", a, b, c, d);
		
		ler.close();
	}

}
