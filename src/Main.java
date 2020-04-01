import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int codigo1 = sc.nextInt();
		int numeroPecas = sc.nextInt();
		double valorPeca = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int numeroPecas2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		double total = (numeroPecas * valorPeca) + (numeroPecas2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	}
}