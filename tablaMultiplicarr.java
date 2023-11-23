import java.util.Scanner;

public class tablaMultiplicarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int cont =0;
		int num=1;
		System.out.println("Introduce un numero entre 1 y10:");
		num=sc.nextInt();
		while (num<=10 && num>=1){
			while(cont<=10){
				System.out.println(num*(cont++));
				
			}
		}
		
	}

}
