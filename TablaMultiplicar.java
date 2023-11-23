import java.util.Scanner;

public class TablaMultiplicar {
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dame un numero a multiplicar entre 1 y 10");
		int num = sc.nextInt();
		int cont=0;
		while (num>=1 && num<=10) {
			while (cont<=10) {
				System.out.println(num*(cont++));
				
			}
		}
		if (num<=10 || num>=1) {
			System.out.println("Te dije entre 1 y 10  ");
		}
		sc.close();
	}

}
