package parimpar;
import java.util.Scanner;

public class parimpar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//pedimos n�meros 
		System.out.println("dime un n�mero");
		
		int num = in.nextInt();
		// definimos si es par o impar y lo decimos
		if (num %2==0){
			System.out.println("el n�mero es par");
		}
		else{
			System.out.println("el n�mero es impar");
		}
	}

}
