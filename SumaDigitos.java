import java.util.Scanner;

public class SumaDigitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		int num = sc.nextInt();
		
		int acumulador = 0;
		while (num > 0) {
			acumulador = acumulador + (num % 10);
			num = num / 10;
		}
		System.out.println("La suma de los digitos es " + acumulador);
		sc.close();
	}

}