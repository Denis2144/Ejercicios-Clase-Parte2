import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tarde
 *
 */
public class RestaSimple {

	
	public static void main(String[] args) {
		
		
	
		Scanner rs = new Scanner(System.in);
		//Pido dos numeros a la vez.
		System.out.println("Introduce dos numeros");
		int num1= rs.nextInt();
		int num2= rs.nextInt();
		
		if(num1==num2) {
			System.out.println("Los dos son iguales");
		}
		if (num1>num2) {
			System.out.println(num1-num2); 
					
		}
		if (num1<num2) {
			System.out.println(num2-num1);	
		}
		rs.close();
		
		
	}

}
