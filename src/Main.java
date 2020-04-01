import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salarioFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		
		double TOTALS = salarioFixo + (totalVendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", TOTALS);
		
		
	}
}