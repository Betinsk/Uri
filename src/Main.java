import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int maiorAB= (A + B + Math.abs(A-B)) / 2;
		
		if (maiorAB> C) {
			System.out.printf("%d eh o maior\n", maiorAB);
		}
		else {
			System.out.printf("%d eh o maior\n", C);
		}
		
		
	}
}