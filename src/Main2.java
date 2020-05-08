import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int anos = sc.nextInt();
		
		
		int idadeAno = anos / 365;
		int idadeMeses = anos % 365 / 30;
		int idadeDias =   anos % 365 % 30;
		
		System.out.printf("%d ano(s)\n", idadeAno);
		System.out.printf("%d mes(es)\n", idadeMeses);
		System.out.printf("%d dia(s)\n", idadeDias);
		
		
		sc.close();
		
		
	}

}
