import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	double N1 = sc.nextDouble();
	double N2 = sc.nextDouble();
	double N3 = sc.nextDouble();
	double N4 = sc.nextDouble();
	
    
	double media = ((N1 * 2.0) + (N2 * 3.0) + (N3 * 4.0) + (N4 * 1.0)) / 10;
	System.out.printf("Media: %.1f\n", media);
	
	if (media >= 7.0) {
		System.out.println("Aluno aprovado.");
	}
	
	else if (media < 5.0)  {
		System.out.println("Aluno reprovado.");
	}
	
	else {
		System.out.println("Aluno em exame.");
		double notaOb = sc.nextDouble();
		System.out.printf("Nota do exame: %.1f\n", notaOb);
		double novaNota = (media + notaOb) / 2.0;
			if(novaNota >= 5.0) {
			System.out.println("Aluno aprovado.");
			System.out.printf("Media: %.1f\n", novaNota);
		}
		else {
			System.out.println("Aluno reprovado.");
			System.out.printf("Media: %.1f\n", novaNota);
		}
	}
		
	
	
	sc.close();
	
	
	}
}