import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a = 4;
		int b = 3;
		int c, d;
		c = a + b;
		d = a - b;
		
		System.out.printf("A vari�vel a vale %d e a vari�vel b vale %d. A vari�vel c contem a soma %d e a vari�vel d contem a subtra��o %d", a, b, c, d);
		
		ler.close();
	}

}
