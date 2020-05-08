import java.util.Locale;
import java.util.Scanner;

public class Uri1052 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salary = sc.nextDouble();
		double reajuste = 0;
	
		if(salary <=400) {
		reajuste = salary * 0.15;
		salary += salary * 0.15;
		
		System.out.printf("Novo salario: %.2f%n", salary);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.println("Em percentual: 15 %");
	
		}
		
		else if (salary >400 && salary<=800) {
			reajuste = salary * 0.12;
			
			salary += salary * 0.12;
			System.out.printf("Novo salario: %.2f%n", salary);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 12 %");
		
		}
   
		else if (salary >800 && salary<=1200) {
			reajuste = salary * 0.10;
			
			salary += salary * 0.10;
			System.out.printf("Novo salario: %.2f%n", salary);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10 %");
		
		}
		else if (salary >1200 && salary<=2000) {
			reajuste = salary * 0.07;
			
			salary += salary * 0.07;
			System.out.printf("Novo salario: %.2f%n", salary);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7 %");
		
		}
		else {
			reajuste = salary * 0.04;
			
			salary += salary * 0.04;
			System.out.printf("Novo salario: %.2f%n", salary);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 4 %");
		
	}

	}

}
