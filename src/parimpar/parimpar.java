package parimpar;
import java.util.Scanner;

public class parimpar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//pedimos números 
		System.out.println("dime un número");
		
		int num = in.nextInt();
		// definimos si es par o impar y lo decimos
		if (num %2==0){
			System.out.println("el número es par");
		}
		else{
			System.out.println("el número es impar");
		}
	}

}
