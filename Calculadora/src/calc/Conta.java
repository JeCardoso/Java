package calc;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int numero = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < numero ; System.out.println(numero  + " X " + i + " = " + (numero*i++) ));
		
	}

}
