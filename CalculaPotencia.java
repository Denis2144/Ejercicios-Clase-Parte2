import java.util.Scanner;

public class CalculaPotencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numBase;
		float numPotencia;
		float numfinal=0;

		Scanner sc =new Scanner(System.in);
		System.out.println("dame la base de un numero");
		numBase =sc.nextFloat();
		System.out.println("dame la pontencia de un numero");
		numPotencia =sc.nextFloat();
		int cont=0;
		numfinal=1;
		if(numPotencia>=0) {
		while (cont<numPotencia) {
			numfinal=numfinal*numBase;
			cont=cont+1;
			}
		}
		if (numPotencia<0) {
			numfinal=1;
			cont=0;
			while (cont>numPotencia) {
				numfinal=numfinal*numBase;
				cont=cont-1;	
				
			}
			numfinal=1/numfinal;
			
		}
		System.out.println(numfinal);
	}



}