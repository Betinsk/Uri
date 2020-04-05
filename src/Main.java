import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
	int x = sc.nextInt();
	int minutos = x * 2;
		System.out.printf("%d minutos\n", minutos);
	}
}