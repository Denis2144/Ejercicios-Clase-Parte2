import java.util.Random;
import java.util.Scanner;

public class Secreto {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRandom;
		 Random rn=new Random();
		 numRandom=1+rn.nextInt(9);
		 int cont=0;
		 System.out.println("tienes 5 intentos para adivinar un numero entre el 1 y el 9");
		 System.out.println("Dime que numero crees que es");
		 while(cont<=5) {
			 cont=cont+1;
			 int num = sc.nextInt();
			 if (num==numRandom) {
				 System.out.println("has acertado");
			 }
			 if (cont==5){
				 System.out.println("No acertaste en tus 5 intentos");
			 }
			 System.out.println("HOLAAA);
			 
		 }	 
	}

}
